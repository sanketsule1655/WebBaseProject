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
	<h1>Add New Product Category</h1>
	<form name='frm' id="frm" action='category' method='POST'>
		<div class="form-group">
			<input type='text' name='prodCategory' value='' id="prodCategory"
				class="form-control" placeholder="Product Category" />
		</div>
		<div class="form-group">
			<input type='submit' name='s' id="btn"
				value='Add New Product Category' class="form-control" />
		</div>
	</form>
	</div>
	</div>
</body>
</html>
