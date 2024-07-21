<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page
	import="java.util.*,org.techhub.service.*,org.techhub.model.*,org.techhub.repository.*"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%!int vendorId;%>
	<%
	vendorId = Integer.parseInt(request.getParameter("vid"));
	%>
	<table class="table" id="grid">
		<tr>
			<th>Product Name</th>
			<th>Vendor</th>
			<th>Category</th>
			<th>Product</th>
			<th>Price</th>
			<th>Man Date</th>
			<th>Exp Date</th>
		</tr>

		<%
		ProductService prodService = new ProductServiceImp();
		List<VendorProductCatJoinModel> list = prodService.getVendorProductCategoryList(vendorId);
		for (VendorProductCatJoinModel vmodel : list) {
			VendorModel vm = vmodel.getVendorModel();
			ProductModel pm = vmodel.getProductModel();
			CategoryModel cm = vmodel.getCategoryModel();
		%>

		<tr>
			<td><%=vm.getName()%></td>
			<td><%=cm.getName()%></td>
			<td><%=pm.getName()%></td>
			<td><%=vmodel.getPrice()%></td>
			<td><%=vmodel.getManDate()%></td>
			<td><%=vmodel.getExpDate()%></td>
		</tr>
		<%
		}
		%>
	</table>
</body>
</html>