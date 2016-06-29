package com.osthus.mfs.web;

import javax.ws.rs.GET;

import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

//import de.osthus.ambeth.webservice.AbstractServiceREST;


//embedded :http://localhost:9191/foo/api/bar/hello
@Path("/bar")
public class HelloWorldRestResource // extends AbstractServiceREST
{

	@GET
	@Path("/hello")
	@Produces(MediaType.TEXT_PLAIN)
	public String sayHello()
	{
		return "Hello World from Tomcat Embedded with Jersey!";
	}
}