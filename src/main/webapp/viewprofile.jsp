<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="subadmindashboard.jsp"></jsp:include>
	
	<%
		int loginUserid=Integer.parseInt(session.getAttribute("userid").toString());
	%>
	<h1><h1>Hey Admin Your Databses Primary Key is <%=loginUserid%></h1></h1>
	</div>
	</div>
</body>
</html>