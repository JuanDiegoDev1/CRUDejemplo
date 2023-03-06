package com.app.crudcliente.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.app.crudcliente.entidad.Estudiante;
import com.app.crudcliente.servicio.EstudianteServicio;

@Controller
@SessionAttributes("estudiante")
public class EstudianteControlador {

	
	@Autowired
	private EstudianteServicio servicio;

	// ruta de la url la pagina principal
	@GetMapping({ "/estudiantes", "/" })
	public String listarEstudiantes(Model modelo) {
		// Mapea a la tabla estudiantes
		// jala la interface de estudiante servicio donde retorna toda la lista de estudiantes/
		//jala la interfaces ya implementada de listar todos los estudiantes
		modelo.addAttribute("estudiantes", servicio.listarTodosLosEstudiantes());
		return "estudiantes"; //  esto es el HTML
	}
	// Muestra el formulario
	@GetMapping("/estudiantes/nuevo")
	public String mostrarFormularioDeRegistrarEstudiante(Model modelo) {
	Estudiante estudiante = new Estudiante();
	modelo.addAttribute("estudiante",estudiante);
	return "crear_estudiante";
	
	}
	//Guarda el estudiante una vez digitado en el formulario
	@PostMapping("/estudiantes")
	public String guardarEstudiante(@ModelAttribute ("estudiante")Estudiante estudiante) {
		servicio.guardarEstudiante(estudiante);
		return"redirect:/estudiantes";
	}
}
