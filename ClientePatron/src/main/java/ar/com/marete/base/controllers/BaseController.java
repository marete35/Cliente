package ar.com.marete.base.controllers;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ar.com.marete.config.Constantes;

public class BaseController {

	private static Logger logger = LoggerFactory.getLogger(BaseController.class);
	private ArrayList<String> archivosJs = new ArrayList<String>();
	private ArrayList<String> archivosCss = new ArrayList<String>();
	protected Map<String, Object> modelo = new HashMap<String, Object>();
	
	/**
	 * Agrega al head de la vista actual un include a la hoja .css pasada por parametro.
	 * @param archivo: el nombre con extension de la hoja a incluir ej:styles.css
	 */
	protected void agregarCSSExtra(String archivo) {
		if(!this.archivosCss.contains(archivo)) {
			archivo += "?="+Calendar.getInstance().getTimeInMillis();
			this.archivosCss.add(archivo);
		}
	}

	/**
	 * Agrega al head de la vista actual un include al archivo .js pasado por parametro
	 * @param archivo: el nombre con extension del archivo .js a incluir ej: funciones.js
	 */
	protected void agregarJsExtra(String archivo) {
		if(!this.archivosJs.contains(archivo)) {
			archivo += "?v="+Calendar.getInstance().getTimeInMillis();
			this.archivosJs.add(archivo);
		}
	}
	
	/** 
	 * Metodo para cargar los Assets particulares de cada pagina.
	 */
	protected void cargarAssetsExtra() {
		String linkCSS="";
		String linkJs="";
		
		for(String s: this.archivosCss) {
			linkCSS += "<link href=\"/"+Constantes.CONTEXTO+"/resources/css/" + s + "\" rel=\"stylesheet\" />\n";
		}
		
		for(String s:this.archivosJs) {
			linkJs += "\n<script src=\"/"+Constantes.CONTEXTO+"/resources/js/" + s + "\"></script>\n";
		}
		this.modelo.put("adicionlaCSS", linkCSS);
		this.modelo.put("adicionalJs", linkJs);
	}
	
	protected void isUserLogueado() {
		logger.debug("Es Base Controller");
	}

}
