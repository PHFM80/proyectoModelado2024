package com.cooweb.ProyectoMDS_vers2.dao_repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.cooweb.ProyectoMDS_vers2.models.Usuario;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;




@Repository
@Transactional
public class UsuarioDaoImp implements UsuarioDao{
	
	@PersistenceContext
	private EntityManager entityManager;

	
	@Override
	public List<Usuario> obtenerUsuarios() {
	
		String query= "from Usuario";
		List<Usuario> resultado = entityManager.createQuery(query).getResultList();
		
		
		
	return resultado;
}
	

	
	
	

}
