<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="tag" uri="/WEB-INF/taglibs/customTaglib.tld"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="/WEB-INF/taglibs/image.tld" prefix="ui"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>New_Header</title>

<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="css/styles.css" rel="stylesheet">
<link href="css/default.css" rel="stylesheet">
<link href="css/header.css" rel="stylesheet" />
<link href="css/font-awesome.min.css" rel="stylesheet">
<link href="css/popup.css" rel="stylesheet">
<link href="css/btninfo.css" rel="stylesheet">


</head>
<body>

<nav class="navbar navbar-default navbar-inverse" role="navigation" style="background-color: rgb(245,126,182);">
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
      <img src="images/DivaStays_Logo.jpg" width="80" height="50">
      </a>
    </div>

    <!-- Collect the nav links, forms, and other content for toggling -->
    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
      <ul class="nav navbar-nav navbar-right">
      <c:choose>
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

					</ul></li>
    </c:otherwise>
</c:choose>          <li><a href="showHelp"><font color="#000000">Help</font></a></li>
      </ul>
    </div><!-- /.navbar-collapse -->
  </div><!-- /.container-fluid -->


 <jsp:include page="cityDropDown.jsp"></jsp:include>
 
 </nav>


</body>
</html>