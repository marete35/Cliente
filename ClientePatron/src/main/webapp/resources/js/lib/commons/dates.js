
/**
 * Archivo que facilita el manejo de las fechas mediante la libreria momentjs.
 * Autor: Marete Ramones.
 */

/**
 * Funcion que retorno el dia de hoy.
 */
function getToday(){
	return moment().format("DD/MM/YYYY");
}

/**
 * Funcion que determina si date1 es menor que date2
 * @param date1 formato: DD/MM/YYYY
 * @param date2 formato: DD/MM/YYYY
 * @example Ejemplo original de la libreria moment: moment('2010-10-20').isBefore('2010-10-21'); // true
 */
function isBefore(date1,date2){
	var d1 = getDateEnglish(date1);
	var d2 = getDateEnglish(date2);
	return moment(d1).isBefore(d2); 
}

/**
 * Funcion que determina si date1 es igual a date2
 * @param date1 formato: DD/MM/YYYy
 * @param date2 formato: DD/MM/YYYY
 * @example Ejemplo original de la libreai moment: moment('2010-10-20').isSame('2010-10-20'); //true
 */
function isSame(date1,date2){
	var d1 = getDateEnglish(date1);
	var d2 = getDateEnglish(date2);
	return moment(d1).isSame(d2);
}


/**
 * Funcion que determina si una date1 es mayor date2
 * @param date1 formato: DD/MM/YYYY
 * @param date2 formato: DD/MM/YYYY
 * @example Ejemplo original de la libreria moment: moment('2010-10-20').isAfter('2010-10-19'); // true
 */
function isAfter(date1,date2){
	var d1 = getDateEnglish(date1);
	var d2 = getDateEnglish(date2);
	return moment(d1).isAfter(d2); 
}

/**
 * Funcion que determina si date1 es igual o menor a date2
 * @param date1 formato: DD/MM/YYYY
 * @param date2 formato: DD/MM/YYYY
 * @example Ejemplo original de la libreria momento: moment('2010-10-20').isSameOrBefore('2010-10-21');  // true
 */
function isSameOrBefore(date1,date2){
	var d1 = getDateEnglish(date1);
	var d2 = getDateEnglish(date2);
	return moment(d1).isSameOrBefore(d2); 
}

/**
 * Funcion que determina si date1 es igual o mayor a date2
 * @param date1 formato: DD/MM/YYYY
 * @param date2 formato: DD/MM/YYYY
 * @example Ejemplo original de la libreria momento: moment('2010-10-20').isSameOrAfter('2010-10-19'); // true
 */
function isSameOrAfter(date1,date2){
	var d1 = getDateEnglish(date1);
	var d2 = getDateEnglish(date2);
	return moment(d1).isSameOrAfter(d2); 
}

/**
 * Funcion que determina si date1 se encuentra dentro del rango de fechas
 * teniendo en cuenta la inclusividad. 
 * @param date1 formato: DD/MM/YYYY
 * @param date2 formato: DD/MM/YYYY
 * @param date3 formato: DD/MM/YYYY
 * @param date4 inclusivity: '()'   '[)'   '()'  '(]'   '[]'
 *  moment('2016-10-30').isBetween('2016-10-30', '2016-12-30', null, '()'); //false
 *  moment('2016-10-30').isBetween('2016-10-30', '2016-12-30', null, '[)'); //true
 *	moment('2016-10-30').isBetween('2016-01-01', '2016-10-30', null, '()'); //false
 *	moment('2016-10-30').isBetween('2016-01-01', '2016-10-30', null, '(]'); //true
 *	moment('2016-10-30').isBetween('2016-10-30', '2016-10-30', null, '[]'); //true
 */
function isBetween(date1,date2,date3,inclusivity){
	var d1 = getDateEnglish(date1);
	var d2 = getDateEnglish(date2);
	var d3 = getDateEnglish(date3);
	return moment(d1).isBetween(d2,d3,null,inclusivity);
}


/****
 *Función para sumar días a una fecha base 
 * con formato de fecha ddd DD/MM/YYYY -> Vie 23/02/2018
 **/
function addDate(baseDate, daysToAdd){
	
	moment.updateLocale('en', {
	    weekdaysShort : ["Dom", "Lun", "Mar", "Mié", "Jue", "Vie", "Sáb"]
	});
	
	return moment(baseDate).add(daysToAdd,"days").format("ddd")+" "+moment(baseDate).add(daysToAdd,"days").format("DD/MM/YYYY");
}

