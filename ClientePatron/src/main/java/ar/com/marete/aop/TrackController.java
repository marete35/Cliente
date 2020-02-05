package ar.com.marete.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

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
	public void adviceControllersEndPoint(JoinPoint jp,RequestMapping request){
		//logger.debug ("Executing Advice on getName()"+jp.getSignature().getName ());
		/*MethodSignature signature = (MethodSignature) jp.getSignature();
		String methodName = signature.getMethod().getName();
		Class<?>[] parameterTypes = signature.getMethod().getParameterTypes();
		Annotation[][] annotations = jp.getTarget().getClass().getMethod(methodName,parameterTypes).getParameterAnnotations();*/

		System.out.println(request.path());
		logger.debug ("Clase: "+jp.getTarget().getClass().getSimpleName()+" Metodo: "+jp.getSignature().getName ());
		
		

		@Pointcut(
		        "within(@org.springframework.stereotype.Controller *) && " +
		        "@annotation(requestMapping) && " +
		        "execution(* *(..))"
		    )
		    public void controller(RequestMapping requestMapping) {}
	
	 @Before("controller(requestMapping)")
	    public void advice(JoinPoint thisJoinPoint, RequestMapping requestMapping) {
	        System.out.println(thisJoinPoint);
	        System.out.println("  " + requestMapping);
	        System.out.println("  " + requestMapping.method()[0]);
	    }
	

}
