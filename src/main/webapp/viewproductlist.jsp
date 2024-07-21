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
	<%-- <%@include file="newmaster.jsp"%>

	<table class="table">
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
		List<VendorProductCatJoinModel> list = prodService.getVendorProductCategoryList();
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

	</div>
	</div> --%>
	
	<%@ include file="newmaster.jsp" %>

<div class="container">
    <table class="table">
        <thead>
            <tr>
                <th>Product Name</th>
                <th>Vendor</th>
                <th>Category</th>
                <th>Product</th>
                <th>Price</th>
                <th>Man Date</th>
                <th>Exp Date</th>
            </tr>
        </thead>
        <tbody>
            <%
            ProductService prodService = new ProductServiceImp();
            List<VendorProductCatJoinModel> list = prodService.getVendorProductCategoryList();
            for (VendorProductCatJoinModel vmodel : list) {
                VendorModel vm = vmodel.getVendorModel();
                ProductModel pm = vmodel.getProductModel();
                CategoryModel cm = vmodel.getCategoryModel();
            %>
            <tr>
                <td><%= pm.getName() %></td>
                <td><%= vm.getName() %></td>
                <td><%= cm.getName() %></td>
                <td><%= pm.getName() %></td>
                <td><%= vmodel.getPrice() %></td>
                <td><%= vmodel.getManDate() %></td>
                <td><%= vmodel.getExpDate() %></td>
            </tr>
            <%
            }
            %>
        </tbody>
    </table>
</div>
	
</body>
</html>