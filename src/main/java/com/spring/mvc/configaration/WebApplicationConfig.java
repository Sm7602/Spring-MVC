package com.spring.mvc.configaration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.context.ContextLoaderListener;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRegistration;

public class WebApplicationConfig implements WebApplicationInitializer {
	@Override
    public void onStartup(ServletContext ctx) throws ServletException {

        System.out.println("WebApplicationConfig.onStartup()");

        // 🔹 ROOT CONTEXT (Hibernate, DB, Services)
        AnnotationConfigWebApplicationContext rootContext =
                new AnnotationConfigWebApplicationContext();
        rootContext.register(Rootconfig.class);

        ctx.addListener(new ContextLoaderListener(rootContext));

        // 🔹 WEB CONTEXT (Spring MVC)
        AnnotationConfigWebApplicationContext webContext =
                new AnnotationConfigWebApplicationContext();
        webContext.register(SpringConfiguration.class);

        ServletRegistration.Dynamic dispatcher =
                ctx.addServlet("dispatcher", new DispatcherServlet(webContext));

        dispatcher.setLoadOnStartup(1);
        dispatcher.addMapping("/");
    }

	
}