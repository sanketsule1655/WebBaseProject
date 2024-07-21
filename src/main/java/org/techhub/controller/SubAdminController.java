package org.techhub.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.techhub.model.SubAdminModel;
import org.techhub.service.SubAdminService;
import org.techhub.service.SubAdminServiceImp;

/**
 * Servlet implementation class SubAdminController
 */
@WebServlet("/saveadmin")
public class SubAdminController extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		String contact=request.getParameter("contact");
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		SubAdminModel subModel=new SubAdminModel();
		subModel.setName(name);
		subModel.setEmail(email);
		subModel.setContact(contact);
		subModel.setUsername(username);
		subModel.setPassword(password);
		SubAdminService subAdminService=new SubAdminServiceImp();
		boolean b=subAdminService.isAddNewSubAdmin(subModel);
		if(b)
		{
			out.println("<h1>SubAdmin Added Successfully.....</h1>");
		}
		else
		{
			out.println("<h1>SubAdmin Not Added......</h1>");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
