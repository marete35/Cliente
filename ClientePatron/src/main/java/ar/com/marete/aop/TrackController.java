package ar.com.marete.aop;

import javax.servlet.http.HttpServletRequest;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ar.com.marete.base.controllers.BaseController;

@Aspect
@Component
public class TrackController {
	
	private static Logger logger = LoggerFactory.getLogger(BaseController.class);
	@Autowired(required = false)
	private HttpServletRequest request;

	
	/*@After ("args(name)")
	public void logStringArguments (String name){
		
		logger.debug ("Running After Advice. String argument passed="+name);
	}*/
	
	@Before ("execution (public * ar.com.marete.base.controllers.*.*())")
	public void adviceControllersEndPoint(JoinPoint jp){
		System.out.println(request.getRequestURL());
		System.out.println(request.getServletPath());
		logger.debug ("Url: "+request.getServletPath()+" Clase: "+jp.getTarget().getClass().getSimpleName()+" Metodo: "+jp.getSignature().getName ());

    }
	

}
