package ar.com.marete.interceptors;

import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.MDC;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class ServiceInterceptor extends HandlerInterceptorAdapter{
	
    private final static Logger LOGGER = Logger.getLogger("ServiceInterceptor");
    
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object object) throws Exception {

        MDC.put("userId", request.getHeader("UserId"));

         MDC.put("sessionId ", request.getHeader("SessionId"));

         MDC.put("requestId", request.getHeader("RequestId"));
         
         return true;

 }
	

}
