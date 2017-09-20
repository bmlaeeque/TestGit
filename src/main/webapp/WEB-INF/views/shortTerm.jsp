<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="/WEB-INF/taglibs/image.tld" prefix="ui"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>DivaStays short_term</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="css/styles.css" rel="stylesheet">
<link href="css/default.css" rel="stylesheet">
<link href="css/header.css" rel="stylesheet" />
<link href="css/popup.css" rel="stylesheet">
<link rel="stylesheet" href="//code.jquery.com/ui/1.11.2/themes/smoothness/jquery-ui.css">
<link type="text/css" rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto:300,400,500">
<link href="css/font-awesome.min.css" rel="stylesheet">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.4.1/css/bootstrap-datepicker3.css" />
<style type="text/css">
.ui-autocomplete {
	font-size: 10px;
}
#address {
	width: 300px;
}
}
</style>
</head>
<body>
	<nav class="navbar navbar-default navbar-inverse" role="navigation"
		style="background-color: rgb(243,210,230);">
	<div class="container-fluid">
		<!-- Brand and toggle get grouped for better mobile display -->
		<div class="navbar-header">
			<button type="button" class="navbar-toggle collapsed"
				data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
				<span class="sr-only">Toggle navigation</span> <span
					class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
			<a class="navbar-brand" href="showHome"><b><font
					color="#000000">DivaStays</font></b></a>
		</div>

		<!-- Collect the nav links, forms, and other content for toggling -->
		<div class="collapse navbar-collapse"
			id="bs-example-navbar-collapse-1">
			<ul class="nav navbar-nav navbar-right">
				<c:choose>
					<c:when test="${sessionScope.user!=null}">
						<img
							src="<ui:image img='${sessionScope.user.userImg}'></ui:image>"
							alt="..." style="height: 30px" />
						<a href="logoutShortTerm">Logout</a>
					</c:when>
					<c:otherwise>
						<li class="dropdown"><a href="#" class="dropdown-toggle"
							data-toggle="dropdown"><b><font color="#000000">Login</font></b>
								<span class="caret"></span></a>
							<ul id="login-dp" class="dropdown-menu">
								<li>
									<div class="row">
										<div class="col-md-12">
											Login via
											<div class="social-buttons">
												<a href="#" class="btn btn-fb"><i class="fa fa-facebook"></i>
													Facebook</a> <a href="#" class="btn btn-tw"><i
													class="fa fa-twitter"></i> Twitter</a>
											</div>
											or

											<form class="form" role="form" method="post"
												action="loginShortTerm" accept-charset="UTF-8"
												id="login-nav">
												<div class="form-group">
													<label class="sr-only" for="exampleInputEmail2">Email
														address</label> <input type="email" name="email"
														class="form-control" id="email"
														placeholder="Email address" autocomplete="off" required>
												</div>
												<div class="form-group">
													<label class="sr-only" for="exampleInputPassword2">Password</label>
													<input type="password" name="password" class="form-control"
														id="password" placeholder="Password" autocomplete="off"
														required>
													<div class="help-block text-right">
														<a href="verificationlink">Forget the password ?</a>
													</div>
													<span id="empIdErr" class="errMsg"></span>
												</div>
												<div class="form-group">
													<button type="submit" class="btn btn-primary btn-block"
														onclick="checkLogin();">Sign in</button>
												</div>
												<div class="checkbox">
													<label> <input type="checkbox"> keep me
														logged-in
													</label>
												</div>
											</form>
										</div>
										<div class="bottom text-center">
											New here ? <a href="showUserReg"><b><font
													color="#000000">Join Us</font></b></a>
										</div>
									</div>
								</li>
							</ul></li>
					</c:otherwise>
				</c:choose>
				<li><a href="showHelp"><font color="#000000">Help</font></a></li>
			</ul>
		</div>
		<!-- /.navbar-collapse -->
	</div>
	<!-- /.container-fluid --> <jsp:include page="cityDropDown.jsp"></jsp:include>
	<div class="jumbotron" style="background-color: #ffffff">
		<div class="container text-center">
			<h1 style="color: #000000; font-family: Georgia">DivaStays</h1>
			<p style="color: #000000; font-family:"CourierNew", Courier, monospace;">Your
				Friendly Neighbourhood Hostel</p>
			<h5 style="color: #333333;">now in India</h5>
			<a href="showKnowMore">
				<button class="btn btn-info">Know More</button>
			</a>
		</div>
		<br>
		<div class="container text-center">
			<div class="container text-center"
				style="background-color: rgb(243, 210, 230)">
				<h3 align="center" style="color: #000000">Stay with us and
					enjoy life</h3>
				<br>
				<div class="container">
					<div class="row">
						<div class="col-md-12 col-md-offset-1">
							<div class="form-section">
								<div class="row">
									<form role="form" action="showFilter1">
										<div class="col-md-4">
											<div class="form-group">
												<label class="sr-only" for="location">Location</label> <input
													type="text" name="address" class="form-control"
													id="address" placeholder="Where ?">
											</div>
										</div>
										<div class="col-md-2">
											<div class="input-group">
												<div class="input-group-addon">
													<i class="fa fa-calendar"> </i>
												</div>
												<input class="form-control" id="dpd1" name="dpd1"
													placeholder="Check In" type="text" />
											</div>
										</div>
										<div class="col-md-2">
											<div class="input-group">
												<div class="input-group-addon">
													<i class="fa fa-calendar"> </i>
												</div>
												<input class="form-control" id="dpd2" name="dpd2"
													placeholder="Check Out" type="text" />
											</div>
										</div>
										<div class="col-md-2">
											<button class="btn btn-info">Search</button>
											<!--<button type="submit" class="btn btn-default btn-primary">Search</button>-->
										</div>
									</form>

								</div>
							</div>
						</div>
					</div>
					<!-- two more tag add for  puppose is to contain in one-->
				</div>
			</div>
			<!-- search box start -->
			<div class="col-md-12 text-center">
				<h2 class="service-title pad-bt15">Hostels In Pune</h2>
				<hr class="bottom-line">
			</div>
			<!-here we are add the map ->
			<div class="map">
				<div id="google-map">
					<!-here we can add the embeded map URL... ie hotels in pune>
					<iframe
						src="https://www.google.com/maps/d/embed?mid=1c-xBCOm4KzrFzL7o24ZlWuwAhSg"
						width="100%" height="450" frameborder="0" style="border: 0"
						allowfullscreen></iframe>
				</div>
			</div>
			<br>
		</div>
	</div>
	<!-- search box end -->
	<div class="container">
		<div class="row">
			<div class="col-md-12 text-center">
				<h2 class="service-title pad-bt15">Limited Deals</h2>
				<hr class="bottom-line">
			</div>

			<div class="col-sm-4">
				<a href="showDeal1" class="gallery-box" data-toggle="modal"
					data-src="images/pg_hostel_img1.png"> <img
					src="images/pghostel_img5.jpg" class="img-responsive" alt="Image 1">
					<div class="gallery-box-caption">
						<div class="gallery-box-content">
							<div>
								<i class="icon-lg ion-ios-search"></i>
								<h4>For Checkin Today</h4>
								<h4>Minimum</h4>
								<h4>vacation</h4>
							</div>
						</div>
					</div></a>
			</div>
			<div class="col-sm-4">
				<a href="showDeal1" class="gallery-box" data-toggle="modal"
					data-src="images/pg_hostel_img1.png"> <img
					src="images/pg_hostel_img6.png" class="img-responsive"
					alt="Image 1">
					<div class="gallery-box-caption">
						<div class="gallery-box-content">
							<div>
								<i class="icon-lg ion-ios-search"></i>
								<h4>For Checkin Today</h4>
								<h4>Minimum 35% off</h4>

							</div>
						</div>
					</div>
				</a>

			</div>
			<div class="col-sm-4">
				<a href="showDeal1" class="gallery-box" data-toggle="modal"
					data-src="images/pg_hostel_img1.png"> <img
					src="images/pg_hostel_img7.png" class="img-responsive"
					alt="Image 1">
					<div class="gallery-box-caption">
						<div class="gallery-box-content">
							<div>
								<i class="icon-lg ion-ios-search"></i>
								<h4>For Checkin Today</h4>
								<h4>Minimum 35 % off</h4>
								<h4>vacation</h4>
							</div>
						</div>
					</div>
				</a>


			</div>
		</div>
	</div>
	<br>
	<br>
	<section id="three" class="no-padding">
	<div class="container-fluid">
		<div class="container">
			<div class="row">
				<div class="col-lg-12 text-center">
					<h2 class="margin-top-0 ">DivaStays For All Your Needs</h2>
					<hr class="primary">
				</div>
			</div>
		</div>
		<div class="row no-gutter">
			<div class="col-lg-6 col-sm-6">
				<a href="#galleryModal" class="gallery-box" data-toggle="modal"
					data-src="images/pg_hostel_img1.png"> <img
					src="images/pg_hostel_img1.png" class="img-responsive"
					alt="Image 1">
					<div class="gallery-box-caption">
						<div class="gallery-box-content">
							<div>
								<i class="icon-lg ion-ios-search"></i>
								<h4>Our cutomized holiday packages at handpicked</h4>
								<h4>destinations will help you have an extraordinary</h4>
								<h4>vacation</h4>
							</div>
						</div>
					</div>
				</a>
			</div>
			<div class="col-lg-6 col-sm-6">
				<a href="#galleryModal" class="gallery-box" data-toggle="modal"
					data-src="./assets/beach.png"> <img
					src="images/pg_hostel_img2.png" class="img-responsive"
					alt="Image 2">
					<div class="gallery-box-caption">
						<div class="gallery-box-content">
							<div>
								<i class="icon-lg ion-ios-search"></i>
								<h4>Enjoy the mystic beauty of places at collection of</h4>
								<h4>handpicked hostels across India</h4>
							</div>
						</div>
					</div>
				</a>
			</div>
			<div class="col-lg-6 col-sm-6">
				<a href="#galleryModal" class="gallery-box" data-toggle="modal"
					data-src="./assets/bike.png"> <img
					src="images/pg_hostel_img3.png" class="img-responsive"
					alt="Image 4">
					<div class="gallery-box-caption">
						<div class="gallery-box-content">
							<div>
								<i class="icon-lg ion-ios-search"></i>
								<h4>Diva Stayss for</h4>
								<h3>BUISNESS</h3>
							</div>
						</div>
					</div>
				</a>
			</div>
			<div class="clearfix hidden-lg"></div>
			<div class="col-lg-6 col-sm-6">
				<a href="#galleryModal" class="gallery-box" data-toggle="modal"
					data-src="./assets/colors.png"> <img
					src="images/pg_hostel_img4.png" class="img-responsive"
					alt="Image 6">
					<div class="gallery-box-caption">
						<div class="gallery-box-content">
							<div>
								<i class="icon-lg ion-ios-search"></i>
								<h4>Diva Stayss for</h4>
								<h4>Tommorow's people</h4>
							</div>
						</div>
					</div>
				</a>
			</div>
		</div>
	</div>
	</section>
	<div class="jumbotron">
		<div class="container text-center">
			<H2 style="color: #000000;">As Spotted In</H2>
			<div class="row">
				<div class="col-sm-4">
					<H3>Times Of India</H3>
					<p>Some text..</p>
				</div>
				<div class="col-sm-4">
					<H3>Forbs</H3>
					<p>Some text..</p>
				</div>
				<div class="col-sm-4">
					<H3>The Hindu</H3>
					<p>Some text..</p>
				</div>
			</div>
		</div>
	</div>
	<!--  from here get in touch -->
	<jsp:include page="Feedback.jsp"></jsp:include>
	<jsp:include page="footer.jsp"></jsp:include>


	<div class="mod" id="myModal11" style="color: black;">
		<div class="modal-dialog modal-lg">
			<div class="modal-content">
				<div class="modal-header" style="background-color: white;">
					<span class="close1">&times;</span>
					<h4 class="modal-title" id="myModalLabel">Login</h4>
				</div>
				<div class="modal-body" style="background-color: white;">
					<h3 style="color: red">Username or Password is incorrect</h3>
					<div class="row">
						<div class="col-md-6">
							<!-- Nav tabs -->
							<ul class="nav nav-tabs">
								<li class="active"><a href="#Login" data-toggle="tab">Login</a></li>

							</ul>
							<!-- Tab panes -->
							<div class="tab-content">

								<form role="form" class="form-horizontal" method="post"
									action="loginShortTerm">
									<div class="form-group">
										<label for="email" class="col-sm-2 control-label">
											Email</label>
										<div class="col-sm-10">
											<input type="email" class="form-control" id="email"
												name="email" placeholder="Email" autocomplete="off" />
										</div>
									</div>
									<div class="form-group">
										<label for="password" class="col-sm-2 control-label">
											Password</label>
										<div class="col-sm-10">
											<input type="password" class="form-control" id="password"
												name="password" placeholder="Password" autocomplete="off" />
										</div>
									</div>
									<div class="row">
										<div class="col-sm-2"></div>
										<div class="col-sm-10">
											<button type="submit" class="btn btn-primary btn-sm"
												style="color: black;">Submit</button>
											<a href="">Forgot your password?</a>
										</div>
									</div>
								</form>

							</div>

						</div>

					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- Include jQuery --> <script type="text/javascript"
		src="js/jquery-1.11.3.min.js"></script> <script
		src="js/bootstrap.min.js" type="text/javascript"></script> 
		<script
		type="text/javascript"
		src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.4.1/js/bootstrap-datepicker.min.js"></script>
	<script src="js/cbpHorizontalMenu.js" type="text/javascript"></script>
	<script src="js/userFormVerify.js" type="text/javascript"></script> <script
		src="js/jquery-ui.js" type="text/javascript"></script> <script
		src="js/popup.js" type="text/javascript"></script> <!--  Check in,check-out calender-->
	<script type="text/javascript">
		var nowTemp = new Date();
		var now = new Date(nowTemp.getFullYear(), nowTemp.getMonth(), nowTemp
				.getDate(), 0, 0, 0, 0);

		var checkin = $('#dpd1').datepicker({
			onRender : function(date) {
				return date.valueOf() < now.valueOf() ? 'disabled' : '';
			}
		}).on('changeDate', function(ev) {
			if (ev.date.valueOf() > checkout.date.valueOf()) {
				var newDate = new Date(ev.date)
				newDate.setDate(newDate.getDate() + 1);
				checkout.setValue(newDate);
			}
			checkin.hide();
			$('#dpd2')[0].focus();
		}).data('datepicker');
		var checkout = $('#dpd2')
				.datepicker(
						{
							onRender : function(date) {
								return date.valueOf() <= checkin.date.valueOf() ? 'disabled'
										: '';
							}
						}).on('changeDate', function(ev) {
					checkout.hide();
				}).data('datepicker');
	</script> <script type="text/javascript">
		$(function() {
			cbpHorizontalMenu.init();
		});
	</script> <!---get in touch validation--> <script type="text/javascript">
	$(function() {
		$("#address").autocomplete({
			source : function(request, response) {
				$.ajax({
					url : "listAddress",
					data : {
						input : request.term
					},
					success : function(data) {
						response(data);
					}
				});
			}
		});
	});
</script> <!--  popup call from jsp    --> <c:if test="${invalid==400}">
		<script type="text/javascript">
			popup();
		</script>
	</c:if> </nav>
</body>
</html>