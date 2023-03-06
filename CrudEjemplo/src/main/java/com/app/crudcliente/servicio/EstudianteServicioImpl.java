package com.app.crudcliente.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.crudcliente.entidad.Estudiante;
import com.app.crudcliente.repositorio.EstudianteRepositorio;

@Service
public class EstudianteServicioImpl implements EstudianteServicio {

	@Autowired
	private EstudianteRepositorio repositorio;
	
	// lista los datos con la palabra clave(finAll)
	@Override
	public List<Estudiante> listarTodosLosEstudiantes() {
		return repositorio.findAll();
	}
	
    // guarda los datos  con la palabra clave (save)
	@Override
	public Estudiante guardarEstudiante(Estudiante estudiante) {
		
		return repositorio.save(estudiante);
	}
}
