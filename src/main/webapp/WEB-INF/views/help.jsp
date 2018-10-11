<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta charset="utf-8" content="">
<meta name="viewport" content="width=device-width, initial-scale=1.0">

<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link href="css/bootstrap.min.css" rel="stylesheet" type="text/css">
<link href="css/help.css" rel="stylesheet" type="text/css">
<link href="css/btninfo.css" rel="stylesheet">
<link href="css/styels.css" rel="stylesheet">
<link href="css/header.css" rel="stylesheet">

</head>
<body style="background-color: white;"> 

	<nav class="navbar navbar-default navbar-inverse" role="navigation" style="background-color: rgb(255,255,255);">
  <div class="container-fluid">
    <!-- Brand and toggle get grouped for better mobile display -->
    <div class="navbar-header">
      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
      <a class="navbar-brand" href="showHome"> 
<!--        <b><font color="#000000">Diva Stays</font></b> -->
      <img src="images/DivaStays_Logo.jpg" width="110" height="85">
      </a>
    </div>

    <!-- Collect the nav links, forms, and other content for toggling -->
    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
    <div class="row">
      <ul class="nav navbar-nav navbar-right" style="width: 100px;">
      
<%--       <c:choose>
   <c:when test="${sessionScope.user!=null}">
						<img src="<ui:image img='${sessionScope.user.userImg}'></ui:image>"
							alt="..." style="height: 30px" />
							<li><a href="logoutShortTerm"><font color="#000000">Logout</font></a></li>
						<li><a href="editUserDetails/${user.uId}"><font color="#000000">Edit Your Profile</font></a></li>
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

									<form class="form" role="form" method="post" action="loginShortTerm"
										accept-charset="UTF-8" id="login-nav">
										<div class="form-group">
											<label class="sr-only" for="exampleInputEmail2">Email
												address</label> <input type="email" name="email"
												class="form-control" id="email" placeholder="Email address"
												autocomplete="off" required>
										</div>
										<div class="form-group">
											<label class="sr-only" for="exampleInputPassword2">Password</label>
											<input type="password" name="password" class="form-control"
												id="password" placeholder="Password" autocomplete="off"
												required>
											<div class="help-block text-right">
												<a href="verificationlink"><font color="#337ab7;">Forget the password ?</font></a>
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

					</ul>
					</li>
    </c:otherwise>
</c:choose>  --%>     
    <li><a href="showHelp"><font color="#000000">Help</font></a></li>
      </ul>
      </div>
    </div><!-- /.navbar-collapse -->
  </div><!-- /.container-fluid -->


 <jsp:include page="cityDropDown.jsp"></jsp:include>
 
 </nav>
	
	<div class="container" id="home" style="background-color: white;">
		<div class="row">
			<!-- row-offcanvas row-offcanvas-left"-->
			<div class="col-md-6">
				<!--id="sidebar" role="navigation">-->

				<h4>Most Frequently Asked Questions</h4>
				<ul class="sidebar_menu">
					<li><a href="index.jsp">How do I locate my currnet
							upcoming bookings?</a></li>
					<li><a href="secondlink.html">How do I create a booking in
							DivaStays?</a></li>
					<li><a href="helpPages/thirdlink.html">How can i find the
							best deals available?</a></li>
					<li><a href="helpPages/fourthlink.html">Where are the
							valid ID proof that i should carry?</a></li>
					<li><a href="helpPages/fifthlink.html">How do i check the
							status of my currnt openings?</a></li>
				</ul>
			</div>

			<div class="col-md-6">
				<h4>Discount and Coupens</h4>
				<ul class="sidebar_menu">
					<li><a href="eleventhlink.html">How can i find the bset
							deals available?</a></li>
					<li><a href="twelvethlink.html">Why i can't modify my
							discounter bookings?</a></li>
					<li><a href="thirteenthlink.html">What is DivaStays and
							how is it different from other hotel booking websites?</a></li>
					<li><a href="fourteenthlink.html">What amenities can I
							expect in a standard DivaStays?</a></li>

				</ul>
			</div>
		</div>


		<div class="row">
			<div class="col-md-6">
				<h4>Booking Creation</h4>
				<ul class="sidebar_menu">
					<li><a href="sixthlink.html">How to create a booking in
							DivaStays?</a></li>
					<li><a href="seventhlink.html">How do i book more than
							three rooms in PG Hoatel?</a></li>
					<li><a href="eighthlink.html">What is the differnce
							between standard and premium propertirs?</a></li>
					<li><a href="ninthlink.html">What are the standard
							check-in and check-out timings? </a></li>
					<li><a href="tenthlink.html">Does the booking include
							lunch/dinner as well?</a></li>
				</ul>
			</div>


			<div class="col-md-6">
				<h4>Booking Modification</h4>
				<ul class="sidebar_menu">
					<li><a href="fifteenthlink.html">How can i extend my
							bookings?</a></li>
					<li><a href="sixteenthlink.html">How i can
							increase/decrease the number of rooms?</a></li>
					<li><a href="seventeenthlink.html">How do i cancel my
							booking?</a></li>
					<li><a href="eighteenthlink.html">Can i cancel a part of
							my booking?</a></li>
					<li><a href="ninteenthlink.html">What are the cancellation
							policies in DivaStays?</a></li>
				</ul>
			</div>
		</div>

		<hr>

		<div class="social_buttons">
			<a href="#" class="bglight-blue"><i class="fa fa-twitter"></i><span></span></a>
			<a href="#" class="bglight-blue"><i class="fa fa-facebook"></i><span></span></a>
			<a href="#" class="bgred"><i class="fa fa-google-plus"></i><span></span></a>
		</div>

		<hr>

	</div> 





</body>
</html> 