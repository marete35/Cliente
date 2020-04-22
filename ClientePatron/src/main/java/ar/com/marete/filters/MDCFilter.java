package ar.com.marete.filters;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.MDC;

/**
 * Servlet Filter implementation class MDCFilter
 */
public class MDCFilter implements Filter {

    /**
     * Default constructor. 
     */
    public MDCFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest httpServletRequest = (HttpServletRequest)request;
        Cookie[] cookies = httpServletRequest.getCookies();
        if(cookies!=null) {
        	MDC.put("sessionId",this.getCookieValue(cookies, "JSESSIONID"));
        	MDC.put("nombre", "mario");
        }else {
        	MDC.put("sessionId","-1");
        	MDC.put("nombre", "no user");
        }
		chain.doFilter(request, response);
	}
	
	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}
	
	/*
	 * Dado las cookies y el nombre de una ella retorna su valor. 
	 */
	private String getCookieValue(Cookie[] cookies, String nameCookie) {
		String valueCookie = "";
		for(Cookie cookie:cookies) {
			if(nameCookie.equals(cookie.getName())) {
				valueCookie =  cookie.getValue();
			}
		}
		return valueCookie;
	}

}
