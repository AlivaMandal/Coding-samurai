package com.task.servlet;

import java.io.IOException;

import com.to.jdbc.DBcon;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import com.task.dao.*;
import com.to.jdbc.*;
@WebServlet("/delete")
public class Deleteservlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		 int id=Integer.parseInt(req.getParameter("id"));
		 
		 UserDao dao =  new UserDao(DBcon.getCon());
		 boolean f = dao.delete(id);
		 HttpSession ses=req.getSession();
			if(f) {
				ses.setAttribute("Succcesful","tasks deleted Succesfully*");
				resp.sendRedirect("View.jsp");
			}else {
				ses.setAttribute("Error!","Something Wrong!!!");
				resp.sendRedirect("View.jsp");	
				}
		 
	}
	

}
