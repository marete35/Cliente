package ar.com.marete.base.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/test")
public class TestDosController extends BaseController{


	private final Logger LOGGER = LoggerFactory.getLogger(TestDosController.class);
	private final Logger LOGGER_EXCEPTIONS = LoggerFactory.getLogger("ONLY_EXCEPCIONES");

	@RequestMapping("/testDos")
	public ModelAndView mensaje() {
		try {
			LOGGER.debug("url: /test numero: {}",2);
			super.isUserLogueado();
			//esta es la vista de retorno que necesitamos.
			super.agregarCSSExtra("test.css");
			super.agregarJsExtra("componentTest.js");
			super.modelo.put("nombre","mario");
			Integer z = 3 / 0;
			return new ModelAndView("pages/test", modelo);
		} catch (Exception e) {
			e.printStackTrace();
			LOGGER_EXCEPTIONS.error(e.getMessage());
			return null;
		}
	} 

}
