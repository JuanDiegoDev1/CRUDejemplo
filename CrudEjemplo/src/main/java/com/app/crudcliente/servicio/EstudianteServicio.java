package com.app.crudcliente.servicio;

import java.util.List;

import com.app.crudcliente.entidad.Estudiante;

public interface EstudianteServicio {
	
	// interface de listar(la implementacion esta en EstudianteServicioImpl)
	public List<Estudiante> listarTodosLosEstudiantes();
	
	// interface de guardar ( la implementacion esta en EstudianteServicioImpl)
	public Estudiante guardarEstudiante(Estudiante estudiante);

}
