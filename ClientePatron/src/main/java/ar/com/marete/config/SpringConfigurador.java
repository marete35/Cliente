package ar.com.marete.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Configuration
@ComponentScan("ar.com.marete.*")
@EnableAspectJAutoProxy
public class SpringConfigurador {
	
	@Bean
	public ViewResolver viewResolver() {
		//esto nos configura un resolutor de vistas para ficheros jsp
		//que es uno de los resolutores mas clasicos. 
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setViewClass(JstlView.class);
		viewResolver.setExposeContextBeansAsAttributes(true);
		viewResolver.setPrefix("/WEB-INF/jsp/");
		viewResolver.setSuffix(".jsp");
		return viewResolver;
	}

}
