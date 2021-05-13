package spms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;
import spms.util.DBConnectionPool;
import spms.vo.User;

public class UserDao {

	DataSource ds = null;

	public void setDataSource(DataSource ds) {
		this.ds = ds;
	}

	DBConnectionPool connPool;
	
	public void setDBConnectionPool(DBConnectionPool connPool) {
		this.connPool = connPool;
	}
	
	public List<User> selectList() throws Exception {

		Connection connection = null;
		Statement stmt = null;
		ResultSet rs = null;
		final String sqlSelect = "SELECT no,grade,id,email,cre_date" + "\r\n" + "FROM user" + "\r\n"
				+ "ORDER BY no ASC";

		try {
			// 커넥션 풀에서 Connection객체를 빌려온다
			connection = ds.getConnection();

			stmt = connection.createStatement();
			rs = stmt.executeQuery(sqlSelect);

			ArrayList<User> users = new ArrayList<User>();

			while (rs.next()) {
				users.add(new User().setNo(rs.getInt("no")).setGrade(rs.getString("grade")).setId(rs.getString("id"))
						.setEmail(rs.getString("email")).setCre_date(rs.getDate("cre_date")));
			}

			return users;

		} catch (Exception e) {
			throw e;
		} finally {
			try {
				if (rs != null)
					rs.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			try {
				if (stmt != null)
					stmt.close();
			} catch (Exception e) {
				e.printStackTrace();
			}

			try {
				/*	DataSource가 빌려준 Connection은
				 *  close()시 연결이 종료되는 것이 아니라
				 *  반납하는 의미이다
				 * */
				if(connection != null)
					connection.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
			
		}
	}

	public int insert(User user) throws Exception {
		Connection connection = null;
		int result = 0;
		PreparedStatement stmt = null;
		final String sqlInsert = "INSERT INTO user(grade,id,password,email,cre_date)" + "\r\n"
				+ "VALUES(1, ?, ?, ?, NOW())";

		try {
			System.out.println("sql문");
			connection = ds.getConnection();
			stmt = connection.prepareStatement(sqlInsert);
			stmt.setString(1, user.getId());
			stmt.setString(2, user.getPassword());
			stmt.setString(3, user.getEmail());
			result = stmt.executeUpdate();
		} catch (Exception e) {
			throw e;
		} finally {
			try {
				if (stmt != null)
					stmt.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			try {
				/*	DataSource가 빌려준 Connection은
				 *  close()시 연결이 종료되는 것이 아니라
				 *  반납하는 의미이다
				 * */
				if(connection != null)
					connection.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}

		return result;
	}

	public int delete(int no) throws Exception {
		Connection connection = null;
		int result = 0;
		Statement stmt = null;
		final String sqlDelete = "DELETE FROM USER WHERE NO=";

		try {
			connection = ds.getConnection();
			stmt = connection.createStatement();
			result = stmt.executeUpdate(sqlDelete + no);

		} catch (Exception e) {
			throw e;

		} finally {
			try {
				if (stmt != null)
					stmt.close();
			} catch (Exception e) {
			}
			try {
				/*	DataSource가 빌려준 Connection은
				 *  close()시 연결이 종료되는 것이 아니라
				 *  반납하는 의미이다
				 * */
				if(connection != null)
					connection.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}

		return result;
	}

	public User selectOne(int no) throws Exception {
		Connection connection = null;
		User user = null;
		Statement stmt = null;
		ResultSet rs = null;

		final String sqlSelectOne = "SELECT NO,GRADE,ID,EMAIL FROM MEMBERS" + " WHERE NO=";

		try {
			connection = ds.getConnection();
			stmt = connection.createStatement();
			rs = stmt.executeQuery(sqlSelectOne + no);
			if (rs.next()) {
				user = new User().setNo(rs.getInt("NO")).setGrade(rs.getString("GRADE")).setId(rs.getString("id"))
						.setEmail(rs.getString("EMAIL")).setCre_date(rs.getDate("CRE_DATE"));
			} else {
				throw new Exception("해당 번호의 회원을 찾을 수 없습니다.");
			}

		} catch (Exception e) {
			throw e;
		} finally {
			try {
				if (rs != null)
					rs.close();
			} catch (Exception e) {
			}
			try {
				if (stmt != null)
					stmt.close();
			} catch (Exception e) {
			}
			try {
				/*	DataSource가 빌려준 Connection은
				 *  close()시 연결이 종료되는 것이 아니라
				 *  반납하는 의미이다
				 * */
				if(connection != null)
					connection.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}

		return user;
	}

	public int update(User user) throws Exception {
		Connection connection = null;
		int result = 0;
		PreparedStatement stmt = null;
		final String sqlUpdate = "UPDATE MEMBERS SET EMAIL=?,PASSWORD=?" + " WHERE NO=?";
		try {
			connection = ds.getConnection();
			stmt = connection.prepareStatement(sqlUpdate);
			stmt.setString(1, user.getEmail());
			stmt.setString(2, user.getPassword());
			stmt.setInt(3, user.getNo());
			result = stmt.executeUpdate();
		} catch (Exception e) {
			throw e;
		} finally {
			try {
				if (stmt != null)
					stmt.close();
			} catch (Exception e) {
			}
			try {
				/*	DataSource가 빌려준 Connection은
				 *  close()시 연결이 종료되는 것이 아니라
				 *  반납하는 의미이다
				 * */
				if(connection != null)
					connection.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		return result;
	}

	public User exist(String id, String password) throws Exception {
		Connection connection = null;
		User user = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		final String sqlExist = "SELECT ID,PASSWORD FROM USER" + " WHERE ID=? AND PASSWORD=?";

		try {
			connection = ds.getConnection();
			stmt = connection.prepareStatement(sqlExist);
			stmt.setString(1, id);
			stmt.setString(2, password);
			rs = stmt.executeQuery();
			if (rs.next()) {
				user = new User().setId(rs.getString("ID")).setPassword(rs.getString("Password"));
			} else {
				return null;
			}
		} catch (Exception e) {
			throw e;

		} finally {
			try {
				if (rs != null)
					rs.close();
			} catch (Exception e) {
			}
			try {
				if (stmt != null)
					stmt.close();
			} catch (Exception e) {
			}
			try {
				/*	DataSource가 빌려준 Connection은
				 *  close()시 연결이 종료되는 것이 아니라
				 *  반납하는 의미이다
				 * */
				if(connection != null)
					connection.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}

		return user;
	}
}
