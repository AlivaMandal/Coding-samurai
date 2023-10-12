package com.task.servlet;
import java.io.IOException;
import com.task.dao.UserDao;
import com.to.entity.user;
import com.to.jdbc.DBcon;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/reg")
public class Reg extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String sub= req.getParameter("sub");
		String chap=req.getParameter("chap");
		String date=req.getParameter("date");
		String status=req.getParameter("status");
		
		user us = new user(sub,chap,date,status);
		
		UserDao dao = new UserDao(DBcon.getCon());
		
		HttpSession ses=req.getSession();
		
		
		boolean  f=dao.addtask(us);
		if(f) {
			ses.setAttribute("Succcesful","tasks added Succesfully*");
			resp.sendRedirect("View.jsp");
		}else {
			ses.setAttribute("Error!","Something Wrong!!!");
			resp.sendRedirect("AddTask.jsp");	
			}
		
		
		
	}
	

}
