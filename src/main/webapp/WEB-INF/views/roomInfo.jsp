<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Room Information</title>
 <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="css/bootstrap.min.css">
  <script src="js/jquery.min.js"></script>
  <script src="js/bootstrap.min.js"></script>
  
  
<style>
/* Popup code */
.popup {
    position: relative;
  
    cursor: pointer;
    -webkit-user-select: none;
    -moz-user-select: none;
    -ms-user-select: none;
    user-select: none;
}
/* The actual popup */
.popup .popuptext {
    visibility: hidden;
    width: 160px;
    background-color: #555;
    color: #fff;
    text-align: center;
    border-radius: 6px;
    padding: 8px 0;
    position: absolute;
    z-index: 1;
    bottom: 125%;
    left: 50%;
    margin-left: -80px;
}
/* Popup arrow */
.popup .popuptext::after {
    content: "";
    position: absolute;
    top: 100%;
    left: 50%;
    margin-left: -5px;
    border-width: 5px;
    border-style: solid;
    border-color: #555 transparent transparent transparent;
}
/* Toggle this class - hide and show the popup */
.popup .show {
    visibility: visible;
    -webkit-animation: fadeIn 1s;
    animation: fadeIn 1s;
}
/* Add animation (fade in the popup) */
@-webkit-keyframes fadeIn {
    from {opacity: 0;} 
    to {opacity: 1;}
}

@keyframes fadeIn {
    from {opacity: 0;}
    to {opacity:1 ;}
}
</style>
 <!--End popup Code--> 
 
<style>
#first{ height:500px;}
</style>
<!--Login Header Code End-->

<!--Code for Text on image-->
 <style>
    .carousel-inner img {
      width: 100%; /* Set width to 100% */
      min-height: 200px;
    }
.carousel-content {
  position: absolute;
  bottom: 10%;
  left: 5%;
  z-index: 20;
  color: white;
  text-shadow: 0 1px 2px rgba(0,0,0,.6);
}
h6 {
  display: inline-block;
  padding: 8px;
  background: #B9121B;
  border-top-left-radius: 10px;
  border-top-right-radius: 10px;
}
.p {
  text-align: center;
  padding-top: 40px;
  font-size: 10px;
}
 </style>
 <!--End of Code for Text on image-->

</head>
<body style="background-color: rgb(243,210,230);">
<!--Header-->
<nav class="navbar navbar-default navbar-inverse" role="navigation" style="background-color: rgb(243,210,230);">
  <div class="container-fluid">
    <!-- Brand and toggle get grouped for better mobile display -->
    <div class="navbar-header">
      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
      <a class="navbar-brand" href="showHome">DivaStays</a>
    </div>

    <!-- Collect the nav links, forms, and other content for toggling -->
    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
      
     
      <ul class="nav navbar-nav navbar-right">
        <li><a href="showHelp">Help</a></li>
      </ul>
    </div><!-- /.navbar-collapse -->
  </div><!-- /.container-fluid -->
</nav>
<!--End of Header-->
<!--Room details Start-->
<div class="container">    
 <div class="row">
 
  <div class="bs-example">
   <ul class="nav nav-tabs">
     <c:forEach var="i" begin="1" end="${roomCount}">
        <li><a data-toggle="tab" href="#section${i}">Room ${i}</a></li>
        </c:forEach>
    </ul>    
  </div>
    <!--Room 1 Section-->
    <div class="col-sm-5">
      <div class="tab-content">
       <c:forEach var="i" begin="1" end="${roomCount}">
   		 <div id="section${i}" class="tab-pane fade in active">
            <h3>Room Details</h3>
              <div class="w3-container">
         <table class="table">
           <thead>
              <tr class="w3-light-grey w3-hover-red">
                 <th>Things</th>
                 <th>Details</th>
             </tr>
           </thead>
             <tr class="w3-hover-green">
                <td>Type of Room</td>
                <td>f</td>
             </tr>
             <tr class="w3-hover-green">
                <td>No. Of Bed</td>
                <td>${room.NumberOfBed}</td>
             </tr>
             <tr class="w3-hover-green">
                <td>Facilities</td>
                <td>Sofa<br>Television<br>Wifi<br>Attached Bathroom<br>Geyser</td>
            </tr>
             <tr class="w3-hover-green">
                <td>Roommates</td>
                <td>
                     <ul>
                      <li><a data-toggle="collapse" data-target="#bed1">Bed 1</a></li>
                       <div id="bed1" class="collapse">
                         <ol>
                           <li>English</li>
                           <li>non-Veg</li>
                         </ol>
                       </div>    
         
                     <li><a data-toggle="collapse" data-target="#bed2">Bed 2</a></li>
                        <div id="bed2" class="collapse">
                           <ol>
                             <li>Hindi</li>
                             <li>Veg</li>
                           </ol>   
                        </div>
                     </ul> 
                </td>
              </tr>
         </table>
 </div>
</div>
  </c:forEach> 
<!--End Room 1 Section-->
  </div>
</div>
  
   <!--Review Code-->
<div class="col-sm-7">
 <div id="myCarousel" class="carousel slide" data-ride="carousel">
  <!-- Indicators -->
   <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
    <!-- Wrapper for slides -->
     <div class="carousel-inner" >
      <div class="item active">
       <img src="images/roomInfoBackground.png" alt="Image" />
       
         <div class="carousel-content">
          <div class="popup" >
            <span class="popuptext" id="mypopup3" style="margin-left:80%; margin-bottom:-50%;">Available</span>
             <img style="margin-left:100%;" src="images/roomInfo1.png" alt="image" height="50px" width="50px" onclick="bed3()" />
          </div>
        </div>
 
         <div class="carousel-content">
           <div class="popup" >
            <span class="popuptext" id="mypopup1" style="margin-right:80%; margin-bottom:-50%;">bed1</span>		 
             <img style="margin-left:1%;" src="images/roomInfo1.png" alt="image" height="50px" width="50px" onclick="bed1()" />
          </div>
         </div>
            
         <div class="carousel-content">
           <div class="popup" >
           <span class="popuptext" id="mypopup2" style="margin-top:50%; margin-bottom:-70%; margin-left:35%;">Not Available</span>
             <img style="margin-bottom:50%; margin-left:50%;" src="images/roomInfo1.png" alt="image" width="20px" height="20px" onclick="bed2()" />
           </div>
         </div>
      </div>
    </div>
    <!-- Left and right controls -->
      <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
        <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
        <span class="sr-only">Previous</span>
      </a>
      <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
        <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
        <span class="sr-only">Next</span>
      </a>
    </div>
  <br>
  <br>
  </div>	 
 </div>
</div>
 <hr>
 <!--End of Room Details--> 
 
 <div class="container">
  <div class="row">
   <div class="col-md-4">
  </div>
  <div class="col-md-4">
	<div class="panel panel-login" style="background-color: rgb(243,210,230);">
      <div class="panel-heading row">
	    <div class="row">
		  <div class="col-xs-6 text-center">
			<a href="#" class="active" id="book">Book</a>
		  </div>
		  <div class="col-xs-6 text-center">
			<a href="#" id="visit">Visit</a>
		  </div>
	    </div>
			<hr>
	   </div>
        
	<div class="panel-body">
	  <div class="row">
		<div class="col-lg-12">
		  <form id="login-form" action="showPaymentPage" method="post" role="form" style="display: block;">
           <p>
             To Book, you need to pay a token amount and the remaining before move-in.</p>
            <br>
            <br>
            <div class="form-group">
	         <div class="row">
	          <div class="col-sm-6 col-sm-offset-3">
		        <input type="submit" name="login-submit" id="login-submit" tabindex="4" class="form-control btn btn-login" value="Book Now" style="color:#FF0000">
	          </div>
	        </div> 
	      </div>
         </form>
  
  <form id="register-form" action="" method="post" role="form" style="display: none;">
   <div class="form-group">
	<input type="text" name="name" id="name" tabindex="1" class="form-control" placeholder="Name" value="" onBlur="CheckName(); return false;" required>
      <span id="checkName" class="checkName"></span>
   </div>
   <div class="form-group">
    <input type="email" name="email" id="email" tabindex="1" class="form-control" placeholder="Email Address" value="" onBlur="CheckEmail(); return false;" required> 
      <span id="checkEmail" class="checkEmail"></span>
   </div>
   <div class="form-group">
	<input type="text" name="phone" id="phone" tabindex="2" class="form-control" placeholder="Phone" onBlur="CheckPhone();                  return false;" required>
       <span id="checkPhone" class="checkPhone"></span>
  </div>
								
    <div class="form-group">
	  <div class="row">
	    <div class="col-sm-6 col-sm-offset-3">
	      <input type="submit" name="register-submit" id="register-submit" tabindex="4" class="form-control btn btn-register"                 value="Visit Now" style="color:#FF0000" onClick="Submit();">
		</div>
	  </div>
   </div>
   </form>
			        </div>
			     </div>
		      </div>             
	      </div>
        </div>      
     </div>
    <hr>
</div>
        
 <!--Script for book and view Code-->
<script>
$(function() {

    $('#book').click(function(e) {
		$("#login-form").delay(100).fadeIn(100);
 		$("#register-form").fadeOut(100);
		$('#register-form-link').removeClass('active');
		$(this).addClass('active');
		e.preventDefault();
	});
	$('#visit').click(function(e) {
		$("#register-form").delay(100).fadeIn(100);
 		$("#login-form").fadeOut(100);
		$('#login-form-link').removeClass('active');
		$(this).addClass('active');
		e.preventDefault();
	});

});
</script>
<!--End of Script-->
 <script src="js/validate.js" type="text/javascript"></script>
 <script>
// When the user clicks on bed, open the popup
   function bed3() {
    var popup3 = document.getElementById("mypopup3");
	popup3.classList.toggle("show");
	
	}
</script>	
<script>	
	function bed2() {
  
	 var popup2 = document.getElementById("mypopup2");
	
	popup2.classList.toggle("show");
	}
</script>	
<script>	
	function bed1() {
  
	 var popup1 = document.getElementById("mypopup1");
	
	popup1.classList.toggle("show");
	}	
</script>
</body>
</html>