package de.osthus.test;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import org.glassfish.jersey.filter.LoggingFilter;

import com.osthus.mfs.web.HelloWorldRestResource;

@ApplicationPath("/api")
public class JerseyApp extends Application
{
	@Override
	public Set<Class<?>> getClasses()
	{
		final Set<Class<?>> classes = new HashSet<Class<?>>();
		classes.add(HelloWorldRestResource.class);
		classes.add(LoggingFilter.class);
		return classes;
	}
}
