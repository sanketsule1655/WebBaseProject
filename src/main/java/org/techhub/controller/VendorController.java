package org.techhub.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.techhub.model.VendorModel;
import org.techhub.service.VendorService;
import org.techhub.service.VendorServiceImp;

/**
 * Servlet implementation class VendorController
 */
@WebServlet("/savevendor")
public class VendorController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String vendName = request.getParameter("name");
		VendorModel vmodel = new VendorModel();
		vmodel.setName(vendName); 
		VendorService vendService = new VendorServiceImp();
		boolean b = vendService.isAddNewVendor(vmodel);
		if(b)
		{
			RequestDispatcher r = request.getRequestDispatcher("superadmindashboard.jsp");
			r.forward(request, response);
		}
		else
		{
			out.println("<h1>Vendor Not added Successfully....</h1>");
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
