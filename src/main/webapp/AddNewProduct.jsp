<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="org.techhub.service.*,java.util.*,org.techhub.model.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="newmaster.jsp"></jsp:include>
	<br>
	<br>
	<form name='frm' id="frm" action='saveproduct' method='POST'>
		<div class="form-group control">
			<%
			VendorService vendorService = new VendorServiceImp();
			List<VendorModel> list = vendorService.getVendorList();
			%>
			<select name='vendorName' class="form-control">
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
		<div class="form-group control" style= display:flex; justify-content:space-between;">
			<a href='addnewcategory.jsp' style='text-decoration:none;color:red;'>+</a> 
			<%
				CategoryService catService=new CategoryServiceImp();
				Set<CategoryModel> catSet=catService.getAllCategories();
			%>
			<select name='productCategory' class="form-control control"/>
			   <option>Select Product Category</option>
			   <%
			   		for(CategoryModel catModel:catSet)
			   		{
			   			%>
			   			<option value="<%=catModel.getId()%>"><%=catModel.getName()%></option>
			   			<%
			   		}
			   %>
			</select>
		</div>
		<div class="form-group control" style= display:flex; justify-content:space-between;">
			<a href='newproduct.jsp'>+</a>
			<%
			ProductService prodService=new ProductServiceImp();
			List<ProductModel> productList=prodService.getAllProducts();
			%>
			<select name='productName' class="form-control"/>
			<option>Select Product</option>
			<%
				for(ProductModel model:productList)
				{
					%>
					<option value="<%=model.getId()%>"><%=model.getName()%></option>
					<% 
				}
			%>
			</select>
		</div>
		<div class="form-group">
			<input type='text' name='productPrice' value='' id="prodPrice"
				class="form-control" placeholder="Product Price" />
		</div>
		<div class="form-group">
			<input type='date' name='manFactDate' value='' id="manFactDate"
				class="form-control" placeholder="Product ManuFacturing Date" />
		</div>
		<div class="form-group">
			<input type='date' name='expDate' value='' id="prodExpDate"
				class="form-control" placeholder="Product Expiry Date" />
		</div>
		<div class="form-group">
			<input type='submit' name='s' id="btn" value='Add New Product'
				class="form-control" />
		</div>
	</form>
	</div>
	</div>
</body>
</html>