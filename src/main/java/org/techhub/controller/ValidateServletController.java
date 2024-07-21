package org.techhub.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.techhub.model.LoginModel;
import org.techhub.repository.DBConfig;
import org.techhub.repository.DBParent;
import org.techhub.service.ValidateUserService;
import org.techhub.service.ValidateUserServiceImp;

/**
 * Servlet implementation class ValidateServlet
 */
@WebServlet("/valid")
public class ValidateServletController extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String path = this.getServletContext().getRealPath("/")+"resources\\db.properties";
		DBParent.path=path;
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		LoginModel model = new LoginModel();
		model.setUsername(username);
		model.setPassword(password);
        ValidateUserService validService = new ValidateUserServiceImp();
		model = validService.isValidateUser(model);
		if(model.getLoginType().equals("super admin"))
		{
			RequestDispatcher r = request.getRequestDispatcher("superadmindashboard.jsp");
			r.forward(request, response);
		}
		else if(model.getLoginType().equals("employee"))
		{
			out.println("Call Dashboard for employee");
		}
		else if(model.getLoginType().equals("subadmin"))
		{
			HttpSession session=request.getSession(true);
			session.setAttribute("userid", model.getUserId());
			session.setAttribute("name", model.getUsername());
			RequestDispatcher r=request.getRequestDispatcher("subadmindashboard.jsp");
			r.forward(request, response);
		}
		else
		{
			out.println("Invalid username and password");
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}
