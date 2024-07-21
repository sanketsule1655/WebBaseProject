<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="java.util.*,org.techhub.service.*,org.techhub.model.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%@include file="newmaster.jsp"%>
	<div class="form-group control">
		<%
		VendorService vendorService = new VendorServiceImp();
		List<VendorModel> list = vendorService.getVendorList();
		%>
		<select name='vendorName' class="form-control" id="vid"
			onchange="getProductListByVendor()">
			<option>Select Vendor</option>
			<%
			for (VendorModel vmodel : list) {
			%>
			<option value="<%=vmodel.getId()%>"><%=vmodel.getName()%></option>
			<%
			}
			%>
		</select>
	</div>
	<div class="form-group control" id="grid"></div>
	</div>
	</div>
</body>
</html>