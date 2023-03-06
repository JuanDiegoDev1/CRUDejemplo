package com.app.crudcliente.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.crudcliente.entidad.Estudiante;

// lo que hace esta linea de codigo es usar los metodos de JpaRepository 
public interface EstudianteRepositorio extends JpaRepository<Estudiante,Integer> {

}
