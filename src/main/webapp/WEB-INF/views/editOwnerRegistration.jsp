<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>Owner Registration</title>
	
 	<link rel="stylesheet" href="css/registrationForm.css">
	
	 <link href="css/header.css" rel="stylesheet"/>
	 <link href="css/bootstrap.min.css" rel="stylesheet">
	 <link href="css/btninfo.css" rel="stylesheet">
	 <link href="css/popup.css" rel="stylesheet">
	 <script src="js/modernizr.custom.js"></script>
	 
	 
 <style>

#submit {
 color: black;
 font-size: 10;
 width: 120px;
 height: 50px;
 border-radius: 25px;
 margin: 0;
 padding: 0;
 background:#00B0B9; 
}

.astext {
    background:none;
    border:none;
    margin:0;
    padding:0;
}

</style>
	 
	 
</head>
<body style="background-image:url(images/formBackground.png)">

<nav class="navbar navbar-default navbar-inverse" role="navigation" style="background-color: rgb(255,255,255); height:105px; border-color: white;">
  <div class="container-fluid">
<!--     Brand and toggle get grouped for better mobile display -->
    <div class="navbar-header" >
      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
      <a class="navbar-brand" href="showHome">  <img src="images/DivaStays_Logo.jpg" width="110" height="85"></a>
    </div>

<!--     Collect the nav links, forms, and other content for toggling -->
    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
    
      <ul class="nav navbar-nav navbar-right">
     
         <li><a href="showHelp" class="astext"><b><font color="#000000">Help</font></b></a></li> 	
      </ul>
    </div> <!-- /.navbar-collapse -->
   </div>  <!--/.container-fluid -->
  </nav>
  
 <%-- <nav class="navbar navbar-default navbar-inverse" role="navigation"
		style="background-color: rgb(245,126,182);">
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
			<img src="images/DivaStays_Logo.jpg" width="80" height="50">		
					</a>
		</div>
		<!-- Collect the nav links, forms, and other content for toggling -->
		<div class="collapse navbar-collapse"
			id="bs-example-navbar-collapse-1">
			<ul class="nav navbar-nav navbar-right">
				<li><a href="showOwnerPage"><font color="#000000">House
							Owner</font></a></li>
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
														<a href="verificationlink"><font color="#00B0B9;">Forget the password ?</font></a>
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
</nav> --%>


    <div class="main-content">
   
  <form class="form-basic" method="post" action="saveEditedOwner" onSubmit="return Submit()" style="background-color: rgb(245,126,182);">
   
	 <div class="form-title-row">
                <h1>Owner Registration Form</h1>
            </div>
		<div class="form-row" style="float:left; width:50%;">
             <label>
                    <span>First Name</span>
          <input type="text" name="firstName" id="firstName" placeholder="First Name" onBlur="CheckName(); return false;" autocomplete="off" value="${owner.firstName}">
             </label>
             <label>
                    <span>Contact No.</span>
                    <input type="text" name="contactNumber" id="contact" placeholder="Contact Number" onBlur="checkContactNumber();CheckPhoneNumber(); return false;" autocomplete="off" value="${owner.contactNumber}">
             </label>
             <label>
                    <span>Password</span>
                    <input type="password" name="password1" id="password1" placeholder="Password" onBlur="CheckPassword(); return false;" autocomplete="off" value="${owner.password}">
             </label>
             <label>
                    <span>Aadhar Number</span>
                    <input type="text" name="aadharNumber" id="aadharNumber" placeholder="Aadhar Number" onBlur="checkAadharNumber();CheckAadhar(); return false;" autocomplete="off" value="${owner.aadharNumber}">
             </label> 
            </div>
        <div class="form-row" style="float:left; width:50%;">
                <label>
                    <span>Last name</span>
                    <input type="text" name="lastName" id="lastName" placeholder="Last Name" onBlur="CheckLastName(); return false;" autocomplete="off" value="${owner.lastName}">
                </label>
                <label>
                    <span>Email</span>
                    <input type="text" name="email" id="email" placeholder="Email" onBlur="checEmail();CheckEmail(); return false;" autocomplete="off" value="${owner.email}">
                </label>
                <label>
                    <span>Confirm Password</span>
                    <input type="password" name="password2" id="password2" placeholder="Confirm Password" onBlur="CheckPass(); return false;" autocomplete="off" required>
                </label>
                <input type="hidden" name="oId" id="oId" value="${owner.oId}">
              </div>

         <div class="form-row" style="width:50%;">
<!--                 <a><button type="submit" class="button btn-info">Submit</button></a> -->

              <p> <button type="submit" name="submit" value="Submit" id="submit">Submit</button> 
         </div>
      </form>
   </div>
      
     <script type="text/javascript">
    function checEmail()
    {
    	 var email=document.getElementById( "email" ).value;
    	 $.ajax({
    			url:"checkOwnerEmail",
    			data:{email:$("#email").val()},
    			success:function(resText){
    				if(resText!="")
    					{
    				alert(resText);
    					}
    				if(resText!=""){
    					$("#email").val("");
    					$("#email").focus();
    				}
    			}
    			
    		});
    }
    </script>
    <script>
    function checkContactNumber()
    {
    	 var contact=document.getElementById( "contact" ).value;
    	 $.ajax({
    			url:"checkOwnerContactNumber",
    			data:{contactNumber:$("#contact").val()},
    			success:function(resText){
    				if(resText!="")
    					{
    				alert(resText);
    					}
    				if(resText!=""){
    					$("#contact").val("");
    					$("#contact").focus();
    				}
    			}
    			
    		});
    }
    </script>
    <script>
    function checkAadharNumber()
    {
    	 var aadharNumber=document.getElementById( "aadharNumber" ).value;
    	 $.ajax({
    			url:"checkOwnerAadharNumber1",
    			data:{aadharNumber:$("#aadharNumber").val()},
    			success:function(resText){
    				if(resText!="")
    					{
    				alert(resText);
    					}
    				if(resText!=""){
    					$("#aadharNumber").val("");
    					$("#aadharNumber").focus();
    				}
    			}
    			
    		});
    }
    
    </script>
    <script src="js/registrationForm.js" type="text/javascript"></script>  
    <script src="js/jquery-1.11.2.min.js"></script>
</body>
</html>