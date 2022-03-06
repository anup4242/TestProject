package com.shopnow.configuration;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class FrontController extends AbstractAnnotationConfigDispatcherServletInitializer
{

	@Override
	protected Class<?>[] getRootConfigClasses() 
	{
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() 
	{
		System.out.println("in configurationnnnnn");
		return new Class[] {SpringConfiguration.class};
	}

	@Override
	protected String[] getServletMappings() 
	{
		return new String [] {"/"};
	}

}

