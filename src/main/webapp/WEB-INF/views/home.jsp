<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="/WEB-INF/taglibs/image.tld" prefix="ui"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home Page</title>


<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="css/styles.css" rel="stylesheet">
<link href="css/default.css" rel="stylesheet">
<link href="css/header.css" rel="stylesheet" />
<link href="css/font-awesome.min.css" rel="stylesheet">
<link href="css/popup.css" rel="stylesheet">
<link href="css/btninfo.css" rel="stylesheet">

<style>

img1{

border-radius: 50%;

}

.upcoming-campaign {
  text-align: center;
}

ln{

border-bottom-color: #00B0B9;
margin-top: 0px;
margin-bottom: 0px;
}

 
</style>
</head>

<body onLoad="initialize()" style="background-color: white;">
	<nav class="navbar navbar-default navbar-inverse" role="navigation"
		style="background-color: rgb(255,255,255); height: 100px; " id="ln">
	<div class="container-fluid">
		<!-- Brand and toggle get grouped for better mobile display -->
		<div class="navbar-header">
			<button type="button" class="navbar-toggle collapsed"
				data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
				<span class="sr-only">Toggle navigation</span> <span
					class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
			<a class="navbar-brand" href="showHome"><!-- <b><font
					color="#000000">DivaStays</font></b> -->
			<img src="images/DivaStays_Logo.jpg" width="110" height="85">		
					</a>
		</div>
<!-- 		Member Reg -->









		<!-- Collect the nav links, forms, and other content for toggling -->
		<div class="collapse navbar-collapse"
			id="bs-example-navbar-collapse-1">
			<ul class="nav navbar-nav navbar-right">
				<li><a href="showOwnerPage"><font color="#000000">House
							Owner</font></a></li>
				<li><a href="showMemberPage"><font color="#000000">Member
					</font></a></li>
				<c:choose>
					<c:when test="${sessionScope.user!=null}">
						<img src="<ui:image img='${sessionScope.user.userImg}'></ui:image>"
							alt="..." style="height: 30px" />
							<li><a href="logoutHome"><font color="#000000">Logout</font></a></li>
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
											<form class="form" role="form" method="post"
												action="loginHome" accept-charset="UTF-8" id="login-nav">
												<div class="form-group">
													<label class="sr-only" for="exampleInputEmail2">Email
														address</label> <input type="email" name="email" value=""
														class="form-control" id="email"
														placeholder="Email address" autocomplete="off" required>
												</div>
												<div class="form-group">
													<label class="sr-only" for="exampleInputPassword2">Password</label>
													<input type="password" name="password" class="form-control" value=""
														id="password" placeholder="Password" autocomplete="off"
														required>
													<div class="help-block text-right" style="color:#00B0B9;">
														<a href="ForgotPassword1"><font color="#00B0B9;">Forget the password ?</font></a>
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
	<!-- /.container-fluid --> 
<%-- 	<jsp:include page="cityDropDown.jsp"></jsp:include> --%>
	
</nav>

	<!-- Carousel
================================================== -->

<div class="row">
<div class="col-md-12">
  
 

 			 
           <div class="row">
                    <div class="media col-md-12">
               		<div class="carousel-inner">
  				 <div class="item active">
  				    <div id="myCarousel" class="carousel slide" data-ride="carousel">


<!-- <div id="myCarousel" class="carousel slide">

                    <div class="media col-md-12">
               		<div class="carousel-inner">
  				 <div class="item active">
  				    <div id="myCarousel" class="carousel slide" data-ride="carousel"> -->
  <!-- Indicators -->
  <ol class="carousel-indicators">
    <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
    <li data-target="#myCarousel" data-slide-to="1"></li>
    <li data-target="#myCarousel" data-slide-to="2"></li>
  </ol>
  <div class="carousel-inner">
    <div class="item active">
      <img src="images/girls_img.jpg" class="img-responsive" style="width: 1500px; height: 600px;">
      <div class="container">
        <div class="carousel-caption">
<!--           <img src="images/DivaStays_Logo.jpg" width="700" height="300"> -->
			
			     <h1 style="color:#F57EB6; font-family:Georgia; font-size: 60px;">DivaStays</h1> 
				<h1 class="cursive">Simple, get near by hostel</h1>
				<h4><b>Find a PG/Hostel as per your stay duration</b></h4>
				<hr>
						 
				<a href="showShortTerm" class="btn btn-info btn-xl"><font
					color="#000000"><b>Short Term Houses</b></font></a>  &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; <a href="showLongTerm"
					class="btn btn-info btn-xl"><font color="#000000"><b>Long
						Term Houses</b></font></a></div>
      </div>
    </div>
    <div class="item">
      <img src="images/girl_img.jpg" class="img-responsive" style="width: 1500px; height: 600px;">
      <div class="container">
        <div class="carousel-caption">
<!--           <img src="images/DivaStays_Logo.jpg" width="700" height="300"> -->
			
			    <h1 style="color:#F57EB6; font-family:Georgia; font-size: 60px;">DivaStays</h1> 
				<h1 class="cursive">Simple, get near by hostel</h1>
				<h4><b>Find a PG/Hostel as per your stay duration</b></h4>
				<hr>
						 
				<a href="showShortTerm" class="btn btn-info btn-xl"><font
					color="#000000"><b>Short Term Houses</b></font></a>  &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; <a href="showLongTerm"
					class="btn btn-info btn-xl"><font color="#000000"><b>Long
						Term Houses</b></font></a></div>
      </div>
    </div>
    <div class="item">
      <img src="images/girls_img3.jpg" class="img-responsive" style="width: 1500px; height: 600px;">
      <div class="container">
        <div class="carousel-caption">
<!--          <img src="images/DivaStays_Logo.jpg" width="700" height="300">  -->
			
			    <h1 style="color:#F57EB6; font-family:Georgia; font-size: 60px;">DivaStays</h1> 
				<h1 class="cursive">Simple, get near by hostel</h1>
				<h4><b>Find a PG/Hostel as per your stay duration</b></h4>
				<hr>
						 
				<a href="showShortTerm" class="btn btn-info btn-xl"><font
					color="#000000"><b>Short Term Houses</b></font></a>  &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; <a href="showLongTerm"
					class="btn btn-info btn-xl"><font color="#000000"><b>Long
						Term Houses</b></font></a></div>
      </div>
    </div>
  </div>
  <!-- Controls -->
  
<!--    <a class="left carousel-control" href="#myCarousel" data-slide="prev">
    <span class="icon-prev"></span>
  </a>
  <a class="right carousel-control" href="#myCarousel" data-slide="next">
    <span class="icon-next"></span>
  </a>  
  
  
  
</div>
</div>colm 8 class  closed
      </div>
      </div>
      </div> -->
      
      
      
      
     <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
        <span class="icon-prev"></span>
        <span class="sr-only">Previous</span>
      </a>
      <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
        <span class="icon-next"></span>
        <span class="sr-only">Next</span>
      </a>
    </div>
  	</div>
  	</div>
  	</div>
  
 
      </div><!--active item class closed-->
    </div><!--carousel inner class closed-->
  		      
      </div><!--colm 8 class  closed-->
      </div>
      </div> 
<!-- /.carousel -->
 <!-- 	<div class="jumbotron" style="background-color: #ffffff"> 
	    
		<div class="header-content" align="center">
			<div class="inner" style="margin-top: 10px;">
			<img src="images/DivaStays_Logo.jpg" width="700" height="300">
			<hr>
				<h1 class="cursive">Simple, get near by hostel</h1>
				<h4><b>Get easy and best hostel</b></h4>
				<hr>
						 
				<a href="showShortTerm" class="btn btn-info btn-xl"><font
					color="#000000">short term</font></a>  &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; <a href="showLongTerm"
					class="btn btn-info btn-xl"><font color="#000000">Long
						term</font></a>
			</div>
			inner class end here
			<br /> <br /> <br /> <br /> <br /> <br />
		</div>
		header .. align center class end here
	</div> -->
	<!--jumbotron class ends here --> <br>
	<div class="container" style="background-color: #F57EB6; width: 1300px; height: 500px">
		<div class="row">
			<div class="col-md-12 text-center">
				<h2 class="service-title pad-bt15"><b>Popular Divastays Cities</h2></b>
				<hr class="bottom-line">
			</div>
			<div class="col-sm-4">
				<div class="panel panel-primary">
					<div class="panel-heading" style="background-color:#00B0B9"><center>Pune</center></div>
					<div class="panel-body">
						<img src="images/index_pune_city.png" class="img-responsive"
							style="width: 100%" alt="Image">
					</div>
					<div class="panel-footer"><center>Surrounded by hills and forts</center></div>
				</div>
			</div>
			<div class="col-sm-4">
				<div class="panel panel-primary">
					<div class="panel-heading" style="background-color:#00B0B9"><center>Delhi</center></div>
					<div class="panel-body">
						<img src="images/index_delhi_city.png" class="img-responsive"
							style="width: 100%" alt="Image">
					</div>
					<div class="panel-footer"><center>Historic City of Maharashtra</center></div>
				</div>
			</div>
			<div class="col-sm-4">
				<div class="panel panel-primary">
					<div class="panel-heading" style="background-color:#00B0B9"><center>Banglore</center></div>
					<div class="panel-body">
						<img src="images/index_banglore_city.png" class="img-responsive"
							style="width: 100%" alt="Image">
					</div>
					<div class="panel-footer"><center>Have great market for It Industry</center></div>
				</div>
			</div>
		</div>
	</div>
	<br>
	
	<div class="container" style="background-color: #F57EB6; width: 1300px; height: 500px">
	  <hr class="bottom-line">
		<div class="row">
			<div class="col-sm-4">
				<div class="panel panel-primary">
					<div class="panel-heading" style="background-color:#00B0B9"><center>Kolhapur</center></div>
					<div class="panel-body">
						<img src="images/index_kolhapur_city.png" class="img-responsive"
							style="width: 100%" alt="Image">
					</div>
					<div class="panel-footer"><center>Amhi Kolhapuri</center></div>
				</div>
			</div>
			<div class="col-sm-4">
				<div class="panel panel-primary">
					<div class="panel-heading" style="background-color:#00B0B9"><center>Hydrabad</center></div>
					<div class="panel-body">
						<img src="images/index_hyderabad_city.png" class="img-responsive"
							style="width: 100%" alt="Image">
					</div>
					<div class="panel-footer"><center>Most of the historic monuments in India</center></div>
				</div>
			</div>
			<div class="col-sm-4">
				<div class="panel panel-primary">
					<div class="panel-heading" style="background-color:#00B0B9"><center>Mumbai</center></div>
					<div class="panel-body">
						<img src="images/index_mumbai_city.png" class="img-responsive"
							style="width: 100%" alt="Image">
					</div>
					<div class="panel-footer"><center>A city of dreams</center></div>
				</div>
			</div>
		</div>
	</div>
	<div></div>
	<div></div>
	<sec></sec> <section id="three" class="no-padding">
	<div class="jumbotron" style="background-color: #fffff">
	<div class="container-fluid" style="background-color: #fffff">
		<div class="container" style="background-color: #fffff">
			<div class="row">
				<div class="col-lg-12 text-center">
					<h2 class="margin-top-0 "><b>DivaStays togetherness is uniqueness</b></h2>
					<hr class="primary">
				</div>
			</div>
		</div>
		<div class="row no-gutter">
			<div class="col-lg-4 col-sm-6">
				<a href="#galleryModal" class="gallery-box" data-toggle="modal">
<!-- 					data-src="./assets/holi_image.jpg">  -->  
					<img src="images/holi_image.jpg" height="500">
					<!-- <img
					src="images/index_limiteddeal1.png" class="img-responsive"
					alt="Image 1"> -->
					<div class="gallery-box-caption">
						<div class="gallery-box-content">
							<div>
								<i class="icon-lg ion-ios-search"></i>
								<h4>DivaStays Holi Celebration</h4>
							</div>
						</div>
					</div>
				</a>
			</div>
			<div class="col-lg-4 col-sm-6">
				<a href="#galleryModal" class="gallery-box" data-toggle="modal">
<!-- 					data-src="./assets/beach.png">  -->
					<img src="images/diwali_image.jpg" height="500">
					<!-- <img
					src="images/index_limitedeal_2.png" class="img-responsive"
					alt="Image 2"> -->
					<div class="gallery-box-caption">
						<div class="gallery-box-content">
							<div>
								<i class="icon-lg ion-ios-search"></i>
								<h4>DivaStays Diwali Celebration</h4>
							</div>
						</div>
					</div>
				</a>
			</div>
			<div class="clearfix hidden-lg"></div>
			<div class="col-lg-4 col-sm-6">
				<a href="#galleryModal" class="gallery-box" data-toggle="modal">
<!-- 					data-src="./assets/lake.png">  -->
                    <img src="images/dhol_image.jpg" height="500">
					<!-- <img src="images/index_limiteddeal3.png" class="img-responsive"
					alt="Image 3"> -->
					<div class="gallery-box-caption">
						<div class="gallery-box-content">
							<div>
								<i class="icon-lg ion-ios-search"></i>
								<h4>Festive Season</h4>
							</div>
						</div>
					</div>
				</a>
			</div>
			<div class="col-lg-4 col-sm-6">
				<a href="#galleryModal" class="gallery-box" data-toggle="modal">
<!-- 					data-src="./assets/bike.png">  -->

                    <img src="images/party_image.jpeg" height="500">
					<!-- <img src="images/index_limiteddeal4.png" class="img-responsive"
					alt="Image 4"> -->
					<div class="gallery-box-caption">
						<div class="gallery-box-content">
							<div>
								<i class="icon-lg ion-ios-search"></i>
								<h4>Party Mood</h4>
							</div>
						</div>
					</div>
				</a>
			</div>
			<div class="clearfix hidden-lg"></div>
			<div class="col-lg-4 col-sm-6">
				<a href="#galleryModal" class="gallery-box" data-toggle="modal">
<!-- 					data-src="./assets/city.png">  -->
					
					<img src="images/garba_image.JPG" height="500">
					<!-- <img src="images/index_limiteddeal5.png" class="img-responsive"
					alt="Image 5"> -->
					<div class="gallery-box-caption">
						<div class="gallery-box-content">
							<div>
								<i class="icon-lg ion-ios-search"></i>
								<h4>Lets try some moves</h4>
							</div>
						</div>
					</div>
				</a>
			</div>
			<div class="col-lg-4 col-sm-6">
				<a href="#galleryModal" class="gallery-box" data-toggle="modal">
					<!-- data-src="./assets/colors.png"> <img
					src="images/index_limiteddeal6.png" class="img-responsive"
					alt="Image 6"> -->
					
					<img src="images/teej_image.jpeg" height="500">
					<div class="gallery-box-caption">
						<div class="gallery-box-content">
							<div>
								<i class="icon-lg ion-ios-search"></i>
								<h4>DivaStays in Cultural places</h4>

							</div>
						</div>
					</div>
				</a>
			</div>
		</div>
	</div>
	</div>
	</section>
	<div class="jumbotron" style="background-color: #F57EB6">
		<div class="container text-center">
			<h2 class="margin-top-0 "><b>Best Places</b></h2>
			<hr class="primary">
			<div class="row">
				<div class="col-lg-4 col-md-4 text-center">
					<div class="feature">
						<i class="icon-lg ion-android-laptop wow fadeIn"
							data-wow-delay=".3s"></i>
						<img alt="round_image" src="images/hinjewadi_img.jpeg" style="border-radius:50%; width:120px; height:120px">
						<h3>Hinjawadi</h3>
						<p class="text-muted">Hostels looks good everywhere</p>
					</div>
				</div>
				<div class="col-lg-4 col-md-4 text-center">
					<div class="feature">
						<i class="icon-lg ion-social-sass wow fadeInUp"
							data-wow-delay=".2s"></i>
							<img alt="round_image" src="images/aundh_img.jpg" style="border-radius:50%; width:120px; height:120px">
						<h3>Aundh</h3>
						<p class="text-muted">Easy to get</p>
					</div>
				</div>
				<div class="col-lg-4 col-md-4 text-center">
					<div class="feature">
						<i class="icon-lg ion-ios-star-outline wow fadeIn"
							data-wow-delay=".3s"></i>
							<img alt="round_image" src="images/pimpri_img.jpg" style="border-radius:50%; width:120px; height:120px">
						<h3>Pimpari</h3>
						<p class="text-muted">A mature, well, stable area</p>
					</div>
				</div>

			</div>
		</div>
	</div>
	<%-- <section class="container-fluid" id="four">
	<div class="row" style="background-color: #fffff">
		<div
			class="col-xs-10 col-xs-offset-1 col-sm-6 col-sm-offset-3 col-md-4 col-md-offset-4">
			<h2 class="text-center"><b>Features</b></h2>
			<div class="row">
			<hr>
			
			<div class="media wow fadeInRight">
			<center> <img alt="simple_image" src="images/simple_img.jpg" style="border-radius:25%; width:120px; height:120px"> </center>   
				<center><h3>Simple</h3></center>
				<div class="media-body media-middle">
				<center><p>What could be easier? Get started fast with this page
						starter.</p></center>
				</div>
				<div class="media-right">
					<i class="icon-lg ion-ios-bolt-outline"></i>
				</div>
			</div>
			
			<hr>
			
			<div class="media wow fadeIn">
			 <center> <img alt="free_image" src="images/free_img.jpg" style="border-radius:25%; width:120px; height:120px"> </center>  
				<center><h3>Free</h3></center>
				<div class="media-left">
					<a href="#alertModal" data-toggle="modal" data-target="#alertModal"><i
						class="icon-lg ion-ios-cloud-download-outline"></i></a>
				</div>
				<div class="media-body media-middle">
					<center><p>Yes, please. Grab it for yourself, and find something
						awesome for you.</p></center>
				</div>
			</div>
			
			<hr>
			
			<div class="row">
				<div class="media wow fadeInRight">
				    <center> <img alt="unique_image" src="images/unique_img.jpg" style="border-radius:25%; width:120px; height:120px"></center>
					<center><h3>Unique</h3></center>
					<div class="media-body media-middle">
					<center><p>Because you want your bset hostel, to look like a good
							place.</p></center>
					</div>
					<div class="media-right">
						<i class="icon-lg ion-ios-snowy"></i>
					</div>
				</div>
			
				<hr>
			
				<div class="media wow fadeIn">
				  <center> <img alt="popular_image" src="images/popular_img.jpg" style="border-radius:25%; width:120px; height:120px"> </center> 
					<center><h3>Popular</h3></center>
					<div class="media-left">
						<i class="icon-lg ion-ios-heart-outline"></i>
					</div>
					<div class="media-body media-middle">
						<center><p>There's good reason why DivaStays is the most used all at
							one place to find hostel.</p></center>
					</div>
				</div>
			
				<hr>
			
				<div class="media wow fadeInRight">
				<center><img alt="analyse_image" src="images/analyse_img1.jpg" style="border-radius:25%; width:120px; height:120px"></center>    
					<center><h3>Analysed</h3></center>
					<div class="media-body media-middle">
						<center><p>DivaStays is well-analysed. It's a stable portal that
							provides your best hostel.</p></center>
					</div>
					<div class="media-right">
						<i class="icon-lg ion-ios-flask-outline"></i>
					</div>
				</div>
       </div>
       </div>
			</div>
		
	</div>
	</section> --%>
	
	<!-- --------------------------------------------------------------  -->
	<div class="jumbotron" style="background-color: white">
		<div class="container text-center">
			<h2 class="margin-top-0 "><b>Features</b></h2>
			<hr class="primary">
			<div class="row">
				<div class="col-lg-4 col-md-4 text-center">
					<center> <img alt="simple_image" src="images/simple_img.jpg" style="border-radius:25%; width:120px; height:120px"> </center>   
				
				  <div class="media-body media-middle">
				  <center><p>What could be easier? Get started fast with this page
						starter.</p></center>
				  </div>
				  <div class="media-right">
					<i class="icon-lg ion-ios-bolt-outline"></i>
				  </div>
				</div>
				<div class="col-lg-4 col-md-4 text-center">
					<center> <img alt="free_image" src="images/free_img.jpg" style="border-radius:25%; width:120px; height:120px"> </center>  
				
				<div class="media-left">
					<a href="#alertModal" data-toggle="modal" data-target="#alertModal"><i
						class="icon-lg ion-ios-cloud-download-outline"></i></a>
				</div>
				<div class="media-body media-middle">
					<center><p>Yes, please. Grab it for yourself, and find something
						awesome for you.</p></center>
				</div>
		    	</div>
				<div class="col-lg-4 col-md-4 text-center">
					<center> <img alt="unique_image" src="images/unique_img.jpg" style="border-radius:25%; width:120px; height:120px"></center>
					
					<div class="media-body media-middle">
					<center><p>Because you want your bset hostel, to look like a good
							place.</p></center>
					</div>
					<div class="media-right">
						<i class="icon-lg ion-ios-snowy"></i>
					</div>
				</div>
				
				
             <center>
               
           
               <div style="align:center;">
               <div class="col-md-4 text-center">
                   <div class="upcoming-campaign">
					 <center> <img alt="popular_image" src="images/popular_img.jpg" style="border-radius:25%; width:120px; height:120px"> </center> 
					<center><h3>Popular</h3></center>
					<div class="media-left">
						<i class="icon-lg ion-ios-heart-outline"></i>
					</div>
					<div class="media-body media-middle">
						<center><p>There's good reason why DivaStays is the most used all at
							one place to find hostel.</p></center>
					</div>
                  </div>
				</div>
				
				<div class="col-md-4 text-center">
				<div class="upcoming-campaign">
					<center><img alt="analyse_image" src="images/analyse_img1.jpg" style="border-radius:25%; width:120px; height:120px"></center>    
					<center><h3>Analysed</h3></center>
					<div class="media-body media-middle">
						<center><p>DivaStays is well-analysed. It's a stable portal that
							provides your best hostel.</p></center>
					</div>
					<div class="media-right">
						<i class="icon-lg ion-ios-flask-outline"></i>
					</div>
				</div>
				</div>
			 </div>
               </center>
               
			</div>
		</div>
	</div>
	
	
	
	<!-- --------------------------------------------------------------  -->
	
	<div class="jumbotron" style="background-color: #F57EB6;">
		<div class="container text-center">
			<H2><b>As Spotted In</b></H2>
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
	<div class="jumbotron" style="background-color: #F57EB6;">
		<div class="container">
			<div class="row">
				<div class="header-section text-center">
					<h2><b>Why People Love DivaStays?</b></h2>
					<hr class="bottom-line">
				</div>
				<div class="feature-info">
					<div class="fea">
						<div class="col-md-2">
							<div class="heading pull-right">
								<h4>SIMPLE</h4>
								<h6>hey guys this is really simple & easy procresss</h6>
							</div>
							<div class="fea-img pull-left">
								<i class="fa fa-css3"></i>
							</div>
						</div>
					</div>
					<div class="fea">
						<div class="col-md-2">
							<div class="heading pull-right">
								<h4>AFFORDABLE PRICE</h4>
								<h6>Yes, we provide the best service at affordable price.</h6>
							</div>
							<div class="fea-img pull-left">
								<i class="fa fa-drupal"></i>
							</div>
						</div>
					</div>
					<div class="fea">
						<div class="col-md-2">
							<div class="heading pull-right">
								<h4>UNIQE</h4>
								<h6>Because you don't want restrinct and the customer are
									ready to move in homes for life time.</h6>
							</div>
							<div class="fea-img pull-left">
								<i class="fa fa-drupal"></i>
							</div>
						</div>
					</div>
					<div class="fea">
						<div class="col-md-2">
							<div class="heading pull-right">
								<h4>POPULAR</h4>
								<h6>There's good reason the people are enjoyed lot.</h6>
							</div>
							<div class="fea-img pull-left">
								<i class="fa fa-drupal"></i>
							</div>
						</div>
					</div>
					<div class="fea">
						<div class="col-md-3">
							<div class="heading pull-right">
								<h4>NO UNNECESSARY RESTRICTION</h4>
								<h6>at DivaStays you provide lot of freedom and enjoyed
									lot.</h6>
							</div>
							<div class="fea-img pull-left">
								<i class="fa fa-trophy"></i>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<div class="jumbotron" style="background-color: #F57EB6;">
		<div class="container">
			<div class=" row">
				<div class="col-md-2"></div>
				<div class="text-right-md col-md-4 col-sm-4">
					<h2 class="section-title blue lg-line\">
						A few words<br> about us..
					</h2>
				</div>
				<div class="col-md-3col-sm-5">
					We provides a better hostels guide website that really gives you
					all the information you need to find the best hostels., the idea of
					having a one stop website for hostels was born What we got for you:
					pghostel.com started in 2017.
					<p class="text-right text-primary">
						<i></i>
					</p>
				</div>
				<div class="col-md-2"></div>
			</div>
		</div>
	</div>
	<div></div>
	<!--  from here get in touch -->
	<jsp:include page="Feedback.jsp"></jsp:include> 
	<jsp:include page="footer.jsp"></jsp:include> 
	<!--Popup  for invalid username and password-->
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
									action="login">
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
											<a href="javascript:;">Forgot your password?</a> <a
												href="showUserReg">Register</a>
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
	<!--  Expired user email-verification link Popup code-->
	<div class="mod" id="userEmailExpire" style="color: black;">
		<div class="modal-dialog modal-sm">
			<div class="modal-content">
				<div class="modal-header" style="background-color: white;">
					<span class="close1">&times;</span>
					<h4 class="modal-title" id="myModalLabel">User Email
						Verification</h4>
				</div>
				<div class="modal-body" style="background-color: white;">
					<h5 style="color: red">Your Email Activation link is expired..</h5>
					<div class="row">
						<div class="col-md-6">

							<form  class="form-horizontal" method="post"
								action="emailExpirePopup">

								<input type="hidden" name="email" id="email" value="${email}">
								<div class="row">
									<div class="col-sm-2"></div>
									<div class="col-sm-10">
										<button type="submit" value="Submit">Resend</button>
									</div>
								</div>
							</form>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!--  End of email-verification link expired popup code-->
	 <!--  Expired owner email-verification link Popup code-->
	<div class="mod" id="ownerEmailExpire" style="color: black;">
		<div class="modal-dialog modal-sm">
			<div class="modal-content">
				<div class="modal-header" style="background-color: white;">
					<span class="close2">&times;</span>
					<h4 class="modal-title" id="myModalLabel">Owner Email
						Verification</h4>
				</div>
				<div class="modal-body" style="background-color: white;">
					<h5 style="color: red">Your Email Activation link is expired..</h5>
					<div class="row">
						<div class="col-md-6">
							<form role="form" class="form-horizontal" method="post"
								action="ownerEmailExpirePopup">

								<input type="hidden" name="email" id="email" value="${email}">
								<div class="row">
									<div class="col-sm-2"></div>
									<div class="col-sm-10">
										<button type="submit" value="Submit">Resend</button>
									</div>
								</div>
							</form>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	
<!--   </nav> -->
  
	<!--  End of email-verification link expired popup code-->
	<script type="text/javascript" src="js/jquery-1.11.3.min.js"></script>
	<script src="js/bootstrap.min.js" type="text/javascript"></script>
	<script src="js/cbpHorizontalMenu.js" type="text/javascript"></script>	
	<script src="js/popup.js" type="text/javascript"></script>
	<script src="js/registrationForm.js" type="text/javascript"></script>  
	<script type="text/javascript">
		$(function() {
			cbpHorizontalMenu.init();
		});
	</script>

	<!-- User email popup code -->
	<c:set var="status" value="${status}" />
	<%
		//	String status="${status}";
		String status = (String) pageContext.getAttribute("status");
		if (status != null) {
			if (status.equals("Activated")) {
	%>
	<script type="text/javascript">
		alert("Your account is activated");
	</script>
	<%
		} else if (status.equals("Expired")) {
	%>
	<script type="text/javascript">
	emailExpirePopup1();
	</script>
	<%
		}
		}
	%>
	<!--  User email popup code end -->
	<!-- Owner email popup code -->
	<c:set var="ownerStatus" value="${ownerStatus}" />
	<%
		String ownerStatus = (String) pageContext.getAttribute("ownerStatus");
		if (ownerStatus != null) {
			if (ownerStatus.equals("Activated")) {
	%>
	<script type="text/javascript">
		alert("Your account is activated");
	</script>
	<%
		} else if (ownerStatus.equals("Expired")) {
	%>
	<script type="text/javascript">
		ownerEmailExpirePopup1();
	</script>
	<%
		}
		}
	%>
	<!--  Owner email popup code end -->
	<!--  popup call from jsp    -->
	<c:if test="${invalid==400}">
		<script type="text/javascript">
			popup();
		</script>
	</c:if>
	

</body>
</html>