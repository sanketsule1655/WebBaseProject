package org.techhub.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.techhub.model.ProductModel;
import org.techhub.service.ProductService;
import org.techhub.service.ProductServiceImp;

/**
 * Servlet implementation class ProductController
 */
@WebServlet("/product")
public class ProductController extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String productName=request.getParameter("prodName");
		ProductModel prodModel=new ProductModel();
		prodModel.setName(productName);
		ProductService prodService=new ProductServiceImp();
		boolean b=prodService.isAddNewProduct(prodModel);
		if(b)
		{
			RequestDispatcher r=request.getRequestDispatcher("AddNewProduct.jsp");
			r.forward(request, response);
		}
		else
		{
			out.println("<h1>Product Not Added</h1>");
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
