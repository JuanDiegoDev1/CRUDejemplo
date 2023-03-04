package com.app.crudcliente.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.app.crudcliente.servicio.EstudianteServicio;

@Controller
@SessionAttributes("estudiante")
public class EstudianteControlador {

	
	@Autowired
	private EstudianteServicio servicio;

	@GetMapping({ "/estudiantes", "/" })
	public String listarEstudiantes(Model modelo) {
		modelo.addAttribute("estudiantes", servicio.listarTodosLosEstudiantes());
		return "estudiantes"; // nos retorna al archivo estudiantes
	}
	
}
