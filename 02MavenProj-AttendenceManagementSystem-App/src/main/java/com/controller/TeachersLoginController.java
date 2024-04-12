package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.model.TeachersLoginBean;
import com.model.TeachersLoginDAO;
import javax.servlet.annotation.WebServlet;

@WebServlet("/teacherlogin")
@SuppressWarnings("serial")
public class TeachersLoginController extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res)
	throws ServletException, IOException
	{
		String rollNo = req.getParameter("rollno");
		String pWord = req.getParameter("pword");
		TeachersLoginDAO ald = new TeachersLoginDAO();
		TeachersLoginBean tlb = ald.login(rollNo, pWord);
		if(tlb==null)
		{
			req.setAttribute("message", "<strong>Invalid login details...<strong><br>");
			RequestDispatcher rd = req.getRequestDispatcher("Home.jsp");
			rd.forward(req, res);
		}
		else
		{
			HttpSession hs = req.getSession();
			hs.setAttribute("teachersloginbean", tlb);
			req.setAttribute("message", "<strong>Login Successfull...</strong><br>");
			RequestDispatcher rd = req.getRequestDispatcher("TeachersLoginJsp.jsp");
			rd.forward(req, res);
		}//end of if-else
	}
}
