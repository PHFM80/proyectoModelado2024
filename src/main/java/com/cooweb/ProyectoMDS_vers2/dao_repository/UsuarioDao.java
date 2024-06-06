package com.cooweb.ProyectoMDS_vers2.dao_repository;

import java.util.List;

import com.cooweb.ProyectoMDS_vers2.models.Usuario;

import jakarta.transaction.Transactional;


@Transactional
public interface UsuarioDao {

	List<Usuario> obtenerUsuarios();
	
	
}
