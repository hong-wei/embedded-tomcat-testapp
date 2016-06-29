package com.osthus.mfs.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/helo",loadOnStartup=1)
public class Helo extends HttpServlet
{
	private static final long serialVersionUID = 1L;

	@Override
	//TODO 0  set the index project working per hour
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
	}
	
	
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter pw = response.getWriter();
		pw.write("<form method='post' action='#'>");
		pw.write("Your Words :  <input type='text' name='username'/>");
		pw.write("<input type='submit' value='submit'>");
		pw.write("</form>");
	}

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		String username = request.getParameter("username");
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter pw = response.getWriter();
		pw.write(username);
	}

}
