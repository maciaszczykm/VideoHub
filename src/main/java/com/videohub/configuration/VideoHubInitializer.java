package com.videohub.configuration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

/**
 * Created by: GiBSoN.
 * Created on: 2015-06-05.
 */
public class VideoHubInitializer implements WebApplicationInitializer {

    private static final String DISPATCHER_MAPPING = "/rest/*";
    private static final String DISPATCHER_NAME = "dispatcher";

    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        AnnotationConfigWebApplicationContext rootContext = new AnnotationConfigWebApplicationContext();
        rootContext.register(WebConfig.class);

        servletContext.addListener(new ContextLoaderListener(rootContext));

        AnnotationConfigWebApplicationContext dispatcherContext = new AnnotationConfigWebApplicationContext();
        dispatcherContext.register(DispatcherConfig.class);

        ServletRegistration.Dynamic dispatcher = servletContext
                .addServlet(DISPATCHER_NAME, new DispatcherServlet(dispatcherContext));

        dispatcher.setLoadOnStartup(1);
        dispatcher.addMapping(DISPATCHER_MAPPING);
    }
}
