<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="subadminmaster.jsp"></jsp:include>
	<h1>Add New SubAdmin</h1>
	<form name='frm' id="frm" action='saveadmin' method='POST'>
		<div class="form-group">
			<input type='text' name='name' value='' id='name'
				class="form-control" placeholder="SubAdmin Name" />
		</div>
		<div class="form-group">
			<input type='text' name='email' value='' id='email'
				class="form-control" placeholder="SubAdmin Email" />
		</div>
		<div class="form-group">
			<input type='text' name='contact' value='' id='contact'
				class="form-control" placeholder="SubAdmin Contact" />
		</div>
		<div class="form-group">
			<input type='text' name='username' value='' id='username'
				class="form-control" placeholder="SubAdmin Username" />
		</div>
		<div class="form-group">
			<input type='text' name='password' value='' id='password'
				class="form-control" placeholder="SubAdmin Password" />
		</div>
		<div class="form-group">
			<input type='submit' name='s' id="btn" value='Add New SubAdmin'
				class="form-control" />
		</div>
	</form>
	</div>
	</div>
</body>
</html>