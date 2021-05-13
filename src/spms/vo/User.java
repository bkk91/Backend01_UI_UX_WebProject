package spms.vo;

import java.util.Date;

public class User {
	
	protected int no;	
	protected String grade;
	protected String id;				
	protected String password;
	protected String email;
	protected Date cre_date;
	
	public int getNo() {
		return no;
	}
	public User setNo(int no) {
		this.no = no;
		return this;
	}
	public String getGrade() {
		return grade;
	}
	public User setGrade(String grade) {
		this.grade = grade;
		return this;
	}
	public String getId() {
		return id;
	}
	public User setId(String id) {
		this.id = id;
		return this;
	}
	public String getPassword() {
		return password;
	}
	public User setPassword(String password) {
		this.password = password;
		return this;
	}
	public String getEmail() {
		return email;
	}
	public User setEmail(String email) {
		this.email = email;
		return this;
	}
	public Date getCre_date() {
		return cre_date;
	}
	public User setCre_date(Date cre_date) {
		this.cre_date = cre_date;
		return this;
	}	
	
}
