<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<meta http-equiv="X-UA-Compatible" content="ie=edge" />
<title>Dog Shelter</title>

<link rel="stylesheet"
	href="//maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css">
<link rel="stylesheet"
	href="https://fonts.googleapis.com/css?family=Open+Sans:400,600" />
<link rel="stylesheet" href="etc/css/all.min.css" />
<link rel="stylesheet" href="etc/css/bootstrap.min.css" />
<link rel="stylesheet" href="etc/css/templatemo-style.css"
	type="text/css">
<link rel="stylesheet" href="etc/css/ionicons.min.css">
</head>
<body>
	<div class="parallax-window" data-parallax="scroll"
		data-image-src="etc/img/bg-00.jpg">
		<div class="container-fluid">
			<div class="row tm-brand-row1">
				<div class="col-lg-12 col-1">
					<div id="btn_group">
						<div id="btn_group">
							<button id="test_btn1">
								<a class="nav-link1" href="./auth/Login.jsp">Login</a>
							</button>
							<button id="test_btn1">
								<a class="nav-link1" href="./auth/Register.jsp">Register</a>
							</button>
						</div>
					</div>
				</div>
			</div>
			<div class="row tm-brand-row">
				<div class="col-lg-4 col-11">
					<div class="tm-brand-container tm-bg-white-transparent">
						<img src="etc/img/logo_0.png" alt="App on Mobile mockup" />
						<div class="tm-brand-texts">
							<h1 class="tm-brand-name">Dog Shelter</h1>
							<p class="small">Give new life to puppies!!</p>
						</div>
					</div>
				</div>
				<div class="col-lg-8 col-1">
					<div class="tm-nav">
						<nav
							class="navbar navbar-expand-lg navbar-light tm-bg-white-transparent tm-navbar">
							<button class="navbar-toggler" type="button"
								data-toggle="collapse" data-target="#navbarNav"
								aria-controls="navbarNav" aria-expanded="false"
								aria-label="Toggle navigation">
								<span class="navbar-toggler-icon"></span>
							</button>
							<div class="collapse navbar-collapse" id="navbarNav">
								<ul class="navbar-nav">
									<li class="nav-item active">
										<div class="tm-nav-link-highlight"></div> <a class="nav-link"
										href="index.jsp">Home <span class="sr-only">(current)</span></a>
									</li>
									<li class="nav-item">
										<div class="tm-nav-link-highlight"></div> <a class="nav-link"
										href="about.jsp">About</a>
									</li>
									<li class="nav-item">
										<div class="tm-nav-link-highlight"></div> <a
										class="nav-link dropdown-toggle js-scroll-trigger"
										data-toggle="dropdown" href="services.jsp">Adoption</a>
										<ul class="dropdown-menu">
											<li class="dropdown-item"><a href="services.jsp">
													<p style="color: grey;">센터내 동물</p>
											</a></li>
											<li class="dropdown-item"><a href="./services2.jsp">
													<p style="color: grey;">입양된 동물</p>
											</a></li>
										</ul>
									</li>
									<li class="nav-item">
										<div class="tm-nav-link-highlight"></div> <a class="nav-link"
										href="testimonials.jsp">Board</a>
									</li>
									<li class="nav-item">
										<div class="tm-nav-link-highlight"></div> <a class="nav-link"
										href="contact.jsp">Direction</a>
									</li>
								</ul>
							</div>
						</nav>
					</div>
				</div>
			</div>

			<!-- About -->
			<section class="row" id="tmAbout">
				<header class="col-12 tm-about-header">
					<h2
						class="text-uppercase text-center text-dark tm-about-page-title">유기견
						센터 소개</h2>
					<hr class="tm-about-title-hr">
				</header>
			</section>
			<!-- Features -->
			<section id="tmAppFeatures">
				<div class="row">
					<header
						class="col-12 text-center text-white tm-bg-black-transparent p-5 tm-app-header">
						<h2 class="text-uppercase mb-3 tm-app-feature-header">서울유기동물입양센터</h2>
						<p class="mb-0 small">
							저희 입양센터에서는 유기동물을 보호하고,<br> 새로운 가족을 만날 수 있도록 도움을 드리고 있습니다. <br>
							<br> 동물과 공존하는 행복한 세상!<br> 여러분의 관심과 사랑이 함께하면 현실이 됩니다.<br>
							<br> 유기동물을 돕는 방법에는 입양, 자원봉사, 후원 등이 있습니다.<br> 입양센터 홈페이지에
							있는 센터 아이들을 입양하실 수 있고,<br> '자원봉사 신청'을 통해 희망하는 일자에 봉사활동을 하실 수
							있습니다.<br> 또한 '후원하기'를 통해 입양센터를 후원하실 수 있습니다.<br>
						</p>
					</header>
				</div>

				<div class="row">
					<div class="col-lg-6">
						<div class="tm-bg-white-transparent tm-app-feature-box">
							<div class="tm-app-feature-icon-container">
								<i><img src="etc/img/house01.png" width=100px, height=100px
									alt="App on Mobile mockup" /></i>
							</div>
							<div class="tm-app-feature-description-box">
								<h3 class="mb-4 tm-app-feature-title">1. 동물보호 캠페인 및 홍보</h3>
								<p class="tm-app-feature-description">
									동물의 보호 및 <br>유기동물입양 증대를 위한 홍보
								</p>
							</div>
						</div>
					</div>


					<div class="col-lg-6">
						<div class="tm-bg-white-transparent tm-app-feature-box">
							<div class="tm-app-feature-icon-container">
								<i><img src="etc/img/house03.png"  width=100px, height=100px
									alt="App on Mobile mockup" /></i>
							</div>
							<div class="tm-app-feature-description-box">
								<h3 class="mb-4 tm-app-feature-title">2. 동물보호 교육사업</h3>
								<p class="tm-app-feature-description">
									유기동물 발생 방지를 위한 교육자료 기획 배포 및<br> 동물보호 교육실시
								</p>
							</div>
						</div>
					</div>

					<div class="col-lg-6">
						<div class="tm-bg-white-transparent tm-app-feature-box">
							<div class="tm-app-feature-icon-container">
								<i><img src="etc/img/house02.png"  width=100px, height=100px
									alt="App on Mobile mockup" /></i>
							</div>
							<div class="tm-app-feature-description-box">
								<h3 class="mb-4 tm-app-feature-title">3. 입양지원</h3>
								<p class="tm-app-feature-description">
									유기동물의 안락사 수를 줄이고<br> 입양을 통한 새 삶의 기회 부여
								</p>
							</div>
						</div>
					</div>

					<div class="col-lg-6">
						<div class="tm-bg-white-transparent tm-app-feature-box">
							<div class="tm-app-feature-icon-container">
								<i><img src="etc/img/house04.png"  width=100px, height=100px
									alt="App on Mobile mockup" /></i>
							</div>
							<div class="tm-app-feature-description-box">
								<h3 class="mb-4 tm-app-feature-title">4. 개인보호소 지원</h3>
								<p class="tm-app-feature-description">
									열악한 개인보호소 지원을 통한 동물보호 및<br> 자립심 부여
								</p>
							</div>
						</div>
					</div>
				</div>

			</section>
			<!-- Page footer -->
			<footer class="row">
				<p class="col-12 text-white text-center tm-copyright-text">
					Copyright &copy; 2021 BitComputer JAVA #203. Designed by <a
						href="#" class="tm-copyright-link">Team 3</a>
				</p>
			</footer>
		</div>
		<!-- .container-fluid -->
	</div>

	<script src="etc/js/jquery.min.js"></script>
	<script src="etc/js/parallax.min.js"></script>
	<script src="etc/js/bootstrap.min.js"></script>
	<script src="etc/js/main.js"></script>
	<script src="etc/js/popper.js"></script>
</body>
</html>