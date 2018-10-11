<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="/WEB-INF/taglibs/image.tld" prefix="ui"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>DivaStays Member</title>


<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="css/styles.css" rel="stylesheet">
<link href="css/default.css" rel="stylesheet">
<link href="css/header.css" rel="stylesheet" />
<link href="css/font-awesome.min.css" rel="stylesheet">
<link href="css/popup.css" rel="stylesheet">
<link href="css/btninfo.css" rel="stylesheet">
<link rel="stylesheet" href="css/registrationForm.css">
<link href="css/bootstrap.min.css" rel="stylesheet">  
<link href="css/header.css" rel="stylesheet"/>
<link href="css/btninfo.css" rel="stylesheet">
</head>
<body>
<nav class="navbar navbar-default navbar-inverse" role="navigation" style="background-color: rgb(255,255,255);height:105px; border-color: white;">
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
      <ul class="nav navbar-nav navbar-right" >
     
         <li><a href="showHelp" class="astext"><b><font color="#000000">Help</font></b></a></li> 	
      </ul>
    </div><!-- /.navbar-collapse -->
  </div><!-- /.container-fluid -->
</nav>

<   <sql:setDataSource
        var="divastays"
        driver="com.mysql.jdbc.Driver"
        url="jdbc:mysql://localhost:2017/divastays?createDatabaseIfNotExist=true&amp;amp;useUnicode=true&amp;amp;characterEncoding=utf-8&amp;amp;autoReconnect=true"
        user="divastays" password="divastays"
    />
    
    <sql:query var="listMember"   dataSource="${divastays}">
        SELECT * FROM member;
    </sql:query>
     
    <div align="center">
        <table border="1" cellpadding="5">
            <caption><h2>List of Member</h2></caption>
            <tr>
                <th>ID</th>
                <th>firstName</th>
                <th>lastName</th>
                <th>Email</th>
                <th>contactNumber</th>
            </tr>
            <c:forEach var="member" items="${listMember.rows}">
                <tr>
                    <td><c:out value="${member.mId}" /></td>
                    <td><c:out value="${member.firstName}" /></td>
                    <td><c:out value="${member.lastName}" /></td>
                    <td><c:out value="${member.Email}" /></td>
                    <td><c:out value="${member.contactNumber}" /></td>
                    
                </tr>
            </c:forEach>
        </table>
    </div> 






</body>
</html>