<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="newmaster.jsp"></jsp:include>
	<h1>Add New Product </h1>
	<form name='frm' id="frm" action='product' method='POST'>
		<div class="form-group">
			<input type='text' name='prodName' value='' id="prodname"
				class="form-control" placeholder="Product Name" />
		</div> 
		<div class="form-group">
			<input type='submit' name='s' id="btn"
				value='Add New Product Name' class="form-control" />
		</div>
	</form>
	</div>
	</div>
</body>
</html>
