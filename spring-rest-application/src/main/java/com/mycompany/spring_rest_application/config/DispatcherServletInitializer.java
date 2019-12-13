package com.mycompany.spring_rest_application.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.h2.server.web.WebServlet;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class DispatcherServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {


	/*
	 * @Override public void onStartup(ServletContext servletContext) throws
	 * ServletException { super.onStartup(servletContext);
	 * ServletRegistration.Dynamic servlet = servletContext
	 * .addServlet("h2-console", new WebServlet()); servlet.setLoadOnStartup(2);
	 * servlet.addMapping("/console/*"); }
	 */

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		// TODO Auto-generated method stub
		return new Class<?>[] {MvcConfiguration.class};
	}

	@Override
	protected String[] getServletMappings() {
		// TODO Auto-generated method stub
		return new String[] {"/"};
	}

}
