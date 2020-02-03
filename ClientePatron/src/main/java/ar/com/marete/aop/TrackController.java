package ar.com.marete.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import ar.com.marete.base.controllers.BaseController;

@Aspect
@Component
public class TrackController {
	
	private static Logger logger = LoggerFactory.getLogger(BaseController.class);

	
	/*@After ("args(name)")
	public void logStringArguments (String name){
		
		logger.debug ("Running After Advice. String argument passed="+name);
	}*/
	
	@Before ("execution (public * ar.com.marete.base.controllers.*.*())")
	public void getNameAdvice() {
		logger.debug ("Executing Advice on getName()");
	}
	

}
