package de.osthus.test;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// http://localhost:8081/embedded-tomcat-testapp/bar
@WebServlet(loadOnStartup = 1, urlPatterns = { "/bar" })
public class SomeServlet extends HttpServlet
{

	@Override
	public void init() throws ServletException
	{
		System.out.println("init1");
		super.init();
	}

	@Override
	public void init(ServletConfig config) throws ServletException
	{
		System.out.println("init2");
		super.init(config);
	}

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		resp.getOutputStream().write("Hello".getBytes());
	}

}
