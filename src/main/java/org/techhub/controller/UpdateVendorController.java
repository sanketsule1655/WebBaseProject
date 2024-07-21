package org.techhub.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UpdateVendorController
 */
@WebServlet("/updatevendor")
public class UpdateVendorController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String vendorName=request.getParameter("vname");
		int vendorId=Integer.parseInt(request.getParameter("vid"));
		RequestDispatcher r=request.getRequestDispatcher("superadmindashboard.jsp");
		r.include(request, response);
		out.println("<input type='text' name='vendorName' value='"+vendorName+"'/>");
		out.println("<br><br><input type='submit' name='s' value='Update Vendor'/>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
