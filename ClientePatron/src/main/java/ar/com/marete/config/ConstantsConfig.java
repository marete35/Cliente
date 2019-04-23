package ar.com.marete.config;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.context.ConfigurableWebEnvironment;

@Configuration
@PropertySource("classpath:configuration.properties")
public class ConstantsConfig {
	
	@Autowired
	ConfigurableWebEnvironment env;
	
	@PostConstruct
	public void init() {
		Constantes.CONTEXTO = env.getProperty("contexto");
		Constantes.VERSION = env.getProperty("version");
	}

}
