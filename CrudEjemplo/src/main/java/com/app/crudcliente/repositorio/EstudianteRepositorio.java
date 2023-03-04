package com.app.crudcliente.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.crudcliente.entidad.Estudiante;


public interface EstudianteRepositorio extends JpaRepository<Estudiante,Integer> {

}
