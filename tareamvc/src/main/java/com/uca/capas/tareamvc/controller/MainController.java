package com.uca.capas.tareamvc.controller;

import java.time.LocalDate;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

	@RequestMapping("/estudiante")
	public @ResponseBody String estudiante() {
		String nombre="Diego";
		String apellido="Vega";
		String carne="00148816";
		String carrera="Ingenieria informatica";
		String yearCarrera="Cuarto año";
		
		return  "Estudiante: " + "<br>" + "<br>" +
				"Nombre y Apellido: " + nombre+ " "+apellido +"<br>" +
				"Carné de estudiante: "+ carne + "<br>" +
				"Carrera: " + carrera + "<br>" +
				"Año cursado: " + yearCarrera;
	}
	
	@RequestMapping("/calendario")
	public @ResponseBody String calendario(HttpServletRequest request){
		
		Integer dia = Integer.parseInt(request.getParameter("dia"));
		Integer mes = Integer.parseInt(request.getParameter("mes"));
		Integer year = Integer.parseInt(request.getParameter("year"));
		
		String date= dia + "/" + mes + "/"+ year;
		
		String Day =LocalDate.of(year, mes, dia).getDayOfWeek().toString();
		return "El día de la fecha " + date + " es: "+ Day;
	}
}
