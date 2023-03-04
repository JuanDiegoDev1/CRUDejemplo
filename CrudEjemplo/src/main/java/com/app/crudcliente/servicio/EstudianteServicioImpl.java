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
	
	
	@Override
	public List<Estudiante> listarTodosLosEstudiantes() {
		return repositorio.findAll();
	}
	
	

}
