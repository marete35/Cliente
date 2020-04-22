package ar.com.marete.base.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/test")
public class TestUnoController extends BaseController {
	
	private final Logger LOGGER = LoggerFactory.getLogger(TestUnoController.class);

	
	@RequestMapping("/testUno")
	public ModelAndView mensaje() {
		//LOGGER.debug("url: /test numero: {}",1);
		super.isUserLogueado();
		//esta es la vista de retorno que necesitamos.
		super.agregarCSSExtra("test.css");
		super.agregarJsExtra("componentTest.js");
		super.modelo.put("nombre","mario");
		return new ModelAndView("pages/test", modelo);
	}

}
