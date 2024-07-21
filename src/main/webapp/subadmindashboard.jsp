<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
	integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
	crossorigin="anonymous"></script>
<script
	src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js"
	integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
	crossorigin="anonymous"></script>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js"
	integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
	="anonymous"></script>
<link rel="stylesheet" href="CSS/subadmin.css" />
</head>
<body>
	<%-- <div class="container-fluid bg-danger mycontainer ">
		<div>
			<nav class="p-5">
				<a href='viewprofile.jsp'>View Profile</a> <a href=''>Employee Master</a>
			</nav>
		</div class="p-5">
		<%
			String loginUser=session.getAttribute("name").toString();
		%>
			<h1>Welcome SubAdmin <%=loginUser%>!</h1>
		 --%>
		 
		 <div class="container-fluid bg-danger mycontainer">
    <div class="p-5">
        <nav class="p-5">
            <a href='viewprofile.jsp'>View Profile</a>
            <a href=''>Employee Master</a>
        </nav>
    </div>
    <%
        String loginUser = (String) session.getAttribute("name");
        if (loginUser != null) {
    %>
        <h1>Welcome SubAdmin <%= loginUser %>!</h1>
    <%
        } else {
    %>
        <h1>Welcome SubAdmin!</h1>
    <%
        }
    %>
</div>
		 
</body>
</html>