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
    <!-- Brand and toggle get grouped for better mobile display -->
    <div class="navbar-header" >
      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
      <a class="navbar-brand" href="showHome"> <img src="images/DivaStays_Logo.jpg" width="110" height="85"></a>
    </div>

    <!-- Collect the nav links, forms, and other content for toggling -->
    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
    
      <ul class="nav navbar-nav navbar-right">
     
         <li><a href="showHelp" class="astext" ><b style="color:#000000;">Help</b></a></li> 	
      </ul>
    </div><!-- /.navbar-collapse -->
  </div><!-- /.container-fluid -->
</nav>
    <div class="main-content">
   
  <form class="form-basic" method="post" action="saveOwner" onSubmit="return Submit()" style="background-color: rgb(245,126,182);">
   
	 <div class="form-title-row">
                <h1>Owner Registration Form</h1>
            </div>
		<div class="form-row" style="float:left; width:50%;">
             <label>
                    <span>First Name</span>
          <input type="text" name="firstName" id="firstName" placeholder="First Name" onBlur="CheckName(); return false;" autocomplete="off" required>
             </label>
             <label>
                    <span>Contact No.</span>
                    <input type="text" name="contactNumber" id="contact" placeholder="Contact Number" onBlur="checkContactNumber();CheckPhoneNumber(); return false;" autocomplete="off" required>
             </label>
             <label>
                    <span>Password</span>
                    <input type="password" name="password1" id="password1" placeholder="Password" onBlur="CheckPassword(); return false;" autocomplete="off" required>
             </label>
             <label>
                    <span>Aadhar Number</span>
                    <input type="text" name="aadharNumber" id="aadharNumber" placeholder="Aadhar Number" onBlur="checkAadharNumber();CheckAadhar(); return false;" autocomplete="off" required>
             </label> 
            </div>
        <div class="form-row" style="float:left; width:50%;">
                <label>
                    <span>Last name</span>
                    <input type="text" name="lastName" id="lastName" placeholder="Last Name" onBlur="CheckLastName(); return false;" autocomplete="off" required>
                </label>
                <label>
                    <span>Email</span>
                    <input type="text" name="email" id="email" placeholder="Email" onBlur="checEmail();CheckEmail(); return false;" autocomplete="off" required>
                </label>
                <label>
                    <span>Confirm Password</span>
                    <input type="password" name="password2" id="password2" placeholder="Confirm Password" onBlur="CheckPass(); return false;" autocomplete="off" required>
                </label>
              </div>
        <span>Are You Member?</span>
<label for="chkYes">
    <input type="radio" id="chkYes" name="chkPassPort" />
    Member
</label>
<label for="chkNo">
    <input type="radio" id="chkNo" name="chkPassPort" />
    Self
</label>
<hr/>
<div id="dvPassport" style="display: none">
    Enter MemberId:
    <input type="text" name="mId" id="mId" onBlur="checmember();Checkmember(); return false;" autocomplete="off" placeholder="MemberId"/>
</div>
         <div class="form-row" style="width:50%;">
               &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <button type="submit" value="Submit" id="submit">Submit</button> 
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
       <script type="text/javascript">
    function checmember()
    {
    	 var mId=document.getElementById( "mId" ).value;
    	 $.ajax({
    			url:"checkMember",
    			data:{mId:$("#mId").val()},
    			success:function(resText){
    				if(resText!="")
    					{
    				alert(resText);
    					}
    				if(resText!=""){
    					$("#mId").val("");
    					$("#mId").focus();
    				}
    			}
    			
    		});
    }
    </script>
    <script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.8.3/jquery.min.js"></script>
      <script type="text/javascript">
    $(function () {
        $("input[name='chkPassPort']").click(function () {
            if ($("#chkYes").is(":checked")) {
                $("#dvPassport").show();
            } else {
                $("#dvPassport").hide();
            }
        });
    });
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