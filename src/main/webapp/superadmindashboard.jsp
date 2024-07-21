<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="CSS/style.css" />
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
	crossorigin="anonymous"></script>
<script type='text/javascript' src='JS/validate.js'></script>
</head>
<body>
	<div class="container myflex">
		<div class="nav flex-column nav-pills menubar mt-5" id="v-pills-tab"
			role="tablist" aria-orientation="vertical">
			<a class="nav-link active" id="v-pills-home-tab" data-toggle="pill"
				href="#v-pills-home" role="tab" aria-controls="v-pills-home"
				aria-selected="true">Company Master</a>
				
				 <a class="nav-link"
				id="v-pills-profile-tab" data-toggle="pill" href="newmaster.jsp"
				role="tab" aria-controls="v-pills-profile" aria-selected="false">Product
				Master</a> 
				
				
				<a class="nav-link" id="v-pills-messages-tab"
				data-toggle="pill" href="#v-pills-messages" role="tab"
				aria-controls="v-pills-messages" aria-selected="false">Add New
				Subadmin</a> <a class="nav-link" id="v-pills-settings-tab"
				data-toggle="pill" href="#v-pills-settings" role="tab"
				aria-controls="v-pills-settings" aria-selected="false">Settings</a>
		</div>
		<div class="content">
			<div class="tab-content" id="v-pills-tabContent">
				<div class="tab-pane fade show active mt-5" id="v-pills-home"
					role="tabpanel" aria-labelledby="v-pills-home-tab">
					<!-- Company Master Tabs -->
					<ul class="nav nav-pills mb-3" id="pills-tab" role="tablist">
						<li class="nav-item"><a class="nav-link active"
							id="pills-home-tab" data-toggle="pill" href="#pills-home"
							role="tab" aria-controls="pills-home" aria-selected="true">New
								Vendor</a></li>
						<li class="nav-item"><a class="nav-link"
							id="pills-profile-tab" data-toggle="pill" href="#pills-profile"
							role="tab" aria-controls="pills-profile" aria-selected="false">View
								Vendor</a></li>
						<li class="nav-item"><a class="nav-link"
							id="pills-contact-tab" data-toggle="pill" href="#pills-contact"
							role="tab" aria-controls="pills-contact" aria-selected="false">Search
								Vendor</a></li>
					</ul>
					<div class="tab-content" id="pills-tabContent">
						<div class="tab-pane fade show active" id="pills-home"
							role="tabpanel" aria-labelledby="pills-home-tab">
							<form name='frm' id="frm" action='savevendor' method='POST'
								onsubmit="validateName()">
								<div class="form-group">
									<input type="text" name="name" value="" id="txtVend"
										class="form-control" placeholder="Vendor Name"
										onkeyup="validateVendor()"> <br> <span id="s"></span>
								</div>
								<div class="form-group">
									<input type='submit' name='s' id="btn" value='Add New Vendor'
										class="form-control" placeholder="Vendor Name" />
								</div>
							</form>
						</div>
						<div class="tab-pane fade" id="pills-profile" role="tabpanel"
							aria-labelledby="pills-profile-tab">
							<%@ page
								import="org.techhub.service.*,org.techhub.model.*,java.util.*"%>
							<%!VendorService vendService = new VendorServiceImp();%>
							<%
							List<VendorModel> vendList = vendService.getVendorList();
							%>
							<div class="form-group">
								<input type='text' name='name' value='' id="txtVend"
									class="form-control"
									placeholder="Search Data Using Vendor Name"
									onKeyup="searchUsingAjax(this.value)"> <br> <span
									id="s"></span>
							</div>
							<div id="showGrid">
								<table class="table">
									<thead>
										<tr>
											<th scope="col">ID</th>
											<th scope="col">NAME</th>
											<th scope="col">DELETE</th>
											<th scope="col">UPDATE</th>
										</tr>
									</thead>
									<tbody>
										<%
										int count = 0;
										for (VendorModel vmodel : vendList) {
											++count;
										%>
										<tr>
											<th scope="row"><%=count%></th>
											<td><%=vmodel.getName()%></td>
											<td><a href='delvendor?vid=<%=vmodel.getId()%>'>DELETE</a></td>
											<td><a
												href='updatevendor?vid=<%=vmodel.getId()%>&vname=<%=vmodel.getName()%>'>UPDATE</a></td>
										</tr>
										<%
										}
										%>
									</tbody>
								</table>
							</div>
						</div>
						<div class="tab-pane fade" id="pills-contact" role="tabpanel"
							aria-labelledby="pills-contact-tab"></div>
					</div>
				</div>
				<div class="tab-pane fade mt-5" id="v-pills-profile" role="tabpanel"
					aria-labelledby="v-pills-profile-tab">Cillum ad ut irure
					tempor velit nostrud occaecat ullamco aliqua anim Lorem sint.
					Veniam sint duis incididunt do esse magna mollit excepteur laborum
					qui. Id id reprehenderit sit est eu aliqua occaecat quis et velit
					excepteur laborum mollit dolore eiusmod. Ipsum dolor in occaecat
					commodo et voluptate minim reprehenderit mollit pariatur. Deserunt
					non laborum enim et cillum eu deserunt excepteur ea incididunt
					minim occaecat.</div>
				<div class="tab-pane fade" id="v-pills-messages" role="tabpanel"
					aria-labelledby="v-pills-messages-tab">...</div>
				<div class="tab-pane fade" id="v-pills-settings" role="tabpanel"
					aria-labelledby="v-pills-settings-tab">...</div>
			</div>
		</div>
	</div>
</body>
</html>
