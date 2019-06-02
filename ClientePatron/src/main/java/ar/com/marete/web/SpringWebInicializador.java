package ar.com.marete.web;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import ar.com.marete.config.SpringConfigurador;
import ar.com.marete.interceptors.MDCFilter;

public class SpringWebInicializador implements WebApplicationInitializer{

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		
		//registro un contexto via web dentro de springframework. 
		AnnotationConfigWebApplicationContext contexto = new AnnotationConfigWebApplicationContext();
		contexto.register(SpringConfigurador.class);
		contexto.setServletContext(servletContext);
		
		//un servlet que haga de controlador frontal y despache todas las peticiones hacia las vistas 
		//y controladores. 
		ServletRegistration.Dynamic servlet = servletContext.addServlet("dispatcher", new DispatcherServlet(contexto));
		servlet.setLoadOnStartup(1);
		servlet.addMapping("/");
		servletContext.addFilter("My filter", MDCFilter.class).addMappingForServletNames(null, false, "dispatcher");
		
	}
	
}
