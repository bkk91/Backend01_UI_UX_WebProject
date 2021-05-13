<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1.0" />
  <meta http-equiv="X-UA-Compatible" content="ie=edge" />
  <title>회원등록</title>

<link rel="stylesheet"
	href="//maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css">
<link rel="stylesheet"
	href="https://fonts.googleapis.com/css?family=Lato:300,400,700&display=swap" />
<link rel="stylesheet" href="../etc/css/bootstrap.min.css" />
<link rel="stylesheet" href="../etc/css/all.min.css" />
<link rel="stylesheet" href="../etc/css/form.css">
</head>
<body>
	<section class="ftco-section">
		<div class="container">
			<div class="row justify-content-center">
				<div class="col-md-7 col-lg-5">
					<div class="wrap">
						<div class="img" style="background-image: url(../etc/img/bg-13.jpg);"></div>
						<div class="login-wrap p-4 p-md-5">
							<div class="d-flex">
								<div class="w-100">
									<h3 class="mb-4">Register</h3>
								</div>
							</div>
							<form action="register" method="post">
								<div class="form-group">
									<input type="text" name="id" class="form-control" required> <label
										class="form-control-placeholder">Name</label>
								</div>
								<div class="form-group">
									<input type="text" name="password" class="form-control" required> <label
										class="form-control-placeholder">Password</label>
								</div>

								<div class="form-group">
									<input type="email" name="email" class="form-control" required> <label
										class="form-control-placeholder">email</label>
								</div>
								<div class="form-group">
									<button type="submit" value="등록"
										class="form-control btn btn-primary rounded submit px-3">Register</button>
								</div>
							</form>
							<p class="text-center">
								Have already an account ? <a href="./Login.jsp" class="loginhere-link">Login
									here</a>
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>

	<script src="../etc/js/jquery.min.js"></script>
	<script src="../etc/js/parallax.min.js"></script>
	<script src="../etc/js/bootstrap.min.js"></script>
	<script src="../etc/js/main.js"></script>
	<script src="../etc/js/popper.js"></script>

</body>
</html>