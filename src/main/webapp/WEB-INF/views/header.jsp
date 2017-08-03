<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<link href="css/header.css" rel="stylesheet"/>
<script src="//ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
<title>Header</title>

</head>
<body>
<nav class="navbar navbar-default navbar-inverse" role="navigation" style="background-color: rgb(243,210,230);">
  <div class="container-fluid">
    <!-- Brand and toggle get grouped for better mobile display -->
    <div class="navbar-header" >
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
    
      <ul class="nav navbar-nav navbar-right" style="background-color: rgb(243,210,230);" >
       <% 
        String ownerEmail =  (String)session.getAttribute("ownerEmail");
        if(ownerEmail!=null)
            {
        	 out.println(ownerEmail+"   <a href=\"logoutOwner\" >Logout</a>");
            }  
         else  
         {
        
        
        }
        %>	
         <li><a href="showHelp" ><b style="color:#000000;">Help</b></a></li> 	
      </ul>
    </div><!-- /.navbar-collapse -->
  </div><!-- /.container-fluid -->
</nav>
<script src="js/jquery.min.js" type="text/javascript"></script>
<script src="js/bootstrap.min.js" type="text/javascript"></script>
<script>  
   function doAjaxPost() {  
    var email = $('#email').val();  
    var password = $('#password').val();  
    $.ajax({  
     type : "POST",   
     url : "login",   
     data : "email=" + email + "&password=" + password,  
     success : function(response) {  
    	 window.location = 'showSuccess';   
     },  
    
     error : function(e) {  
    	 window.location = 'showHeader';    
     }  
    });  
   }  
  </script>  
</body>
</html>