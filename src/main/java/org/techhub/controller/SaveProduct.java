package org.techhub.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.techhub.model.CategoryModel;
import org.techhub.model.ProductModel;
import org.techhub.model.VendorModel;
import org.techhub.model.VendorProductCatJoinModel;
import org.techhub.service.ProductService;
import org.techhub.service.ProductServiceImp;

/**
 * Servlet implementation class SaveProduct
 */
@WebServlet("/saveproduct")
public class SaveProduct extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String vendorId=request.getParameter("vendorName");
		String categoryId=request.getParameter("prodCategory");
		String productId=request.getParameter("productName");
		String prodPrice=request.getParameter("productPrice");
		String manDate=request.getParameter("manFactDate");
		String expDate=request.getParameter("expDate");
		VendorModel vendModel=new VendorModel();
		vendModel.setId(Integer.parseInt(vendorId));
		CategoryModel catModel=new CategoryModel();
		catModel.setId(Integer.parseInt(categoryId));
		ProductModel prodModel=new ProductModel();
		prodModel.setId(Integer.parseInt(productId));
		
		VendorProductCatJoinModel vendProdCatModel=new VendorProductCatJoinModel();
		vendProdCatModel.setPrice(Integer.parseInt(prodPrice));
		vendProdCatModel.setManDate(manDate);
		vendProdCatModel.setExpDate(expDate);
		vendProdCatModel.setCategoryModel(catModel);
		vendProdCatModel.setVendorModel(vendModel);
		vendProdCatModel.setProductModel(prodModel);
		ProductService prodService=new ProductServiceImp();
		boolean b=prodService.isAddNewProductWithDetail(vendProdCatModel);
		if(b)
		{
			out.println("<h1>New Product Added</h1>");
		}
		else
		{
			out.println("<h1>Some Problem is there</h1>");
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
