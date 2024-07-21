package org.techhub.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.techhub.model.CategoryModel;
import org.techhub.service.CategoryService;
import org.techhub.service.CategoryServiceImp;

/**
 * Servlet implementation class ProductCategoryController
 */
@WebServlet("/category")
public class ProductCategoryController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		CategoryService catService = new CategoryServiceImp();
		String name=request.getParameter("prodCategory");
		CategoryModel catModel = new CategoryModel();
		catModel.setName(name);
		boolean b=catService.isAddNewCategory(catModel);
		if(b)
		{
			RequestDispatcher r=request.getRequestDispatcher("AddNewProduct.jsp");
			r.forward(request, response);
		}
		else
		{
			out.println("<h1>Category Not Added Successfully.....</h1>");
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
