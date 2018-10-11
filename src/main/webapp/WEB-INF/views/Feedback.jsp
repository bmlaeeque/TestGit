<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="container">
		<div class="row">
			<div class="col-lg-8 col-lg-offset-2 text-center">
				<h2 class="margin-top-0 wow fadeIn" style="margin-top: 10px"><b>Get
					In Touch</b></h2>
				<hr class="primary">
				<p>We love feedback. Fill out the form below and we'll get back
					to you as soon as possible.</p>
			</div>
			<div class="col-lg-10 col-lg-offset-1 text-center">
				<form class="contact-form row" action="sendMail" method="post" onSubmit="return submitFeedback()" >
					<div class="col-md-4">
						<label></label> <input type="text" class="form-control" style="background-color: #D3D3D3;"
							id="firstName" name="firstName" placeholder="Name" onblur="CheckName(); return false;" required>
									</div>
					<div class="col-md-4">
						<label></label> <input type="text" class="form-control" id="email" style="background-color: #D3D3D3;
							name="email" placeholder="Email" onblur="CheckEmail(); return false;" required> 
					</div>
					<div class="col-md-4">
						<label></label> <input type="text" class="form-control"
							id="contact" name="contact" placeholder="Contact Number" style="background-color: #D3D3D3; onblur="CheckPhoneNumber(); return false;" required>

						
					</div>
					<div class="col-md-12">
						<label></label>
						<textarea class="form-control" rows="8"
							placeholder="Your message here.." name="message" id="message" style="background-color: #D3D3D3; required cols="" onblur="CheckMessage(); return false;"></textarea>
					</div>
					<div class="col-md-3 col-md-offset-4">
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						<br>
						<br>
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <center><button type="submit" data-toggle="modal"
							data-target="#alertModal" class="btn btn-info" id="register">
							Submit<i
								class="ion-android-arrow-forward"></i>
						</button></center>	
						<br>
						
					</div>
				</form>
				
			</div>
		</div>
	</div>
	<script src="js/registrationForm.js" type="text/javascript"></script>  
</body>
</html>