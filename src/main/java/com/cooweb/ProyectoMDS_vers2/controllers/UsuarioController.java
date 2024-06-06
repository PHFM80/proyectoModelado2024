package com.cooweb.ProyectoMDS_vers2.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cooweb.ProyectoMDS_vers2.dao_repository.UsuarioDao;
import com.cooweb.ProyectoMDS_vers2.models.Usuario;


@RestController
public class UsuarioController {
	
	@Autowired
	private UsuarioDao usuarioDao;
	
	@RequestMapping(value = "api/usuarios")
	public List <Usuario> getUsuario () {
		 List<Usuario> user = usuarioDao.obtenerUsuarios();
		 
		 return user;
		
	}
	
	
	
	
/*	
// imprimir por pantalla un Hola mundo
	@RequestMapping(value = "mensaje")
	public String mensaje() {
		return "Hola Mundo, vers2";
		
	}
	
	// pasar una lista de personsas, desde un string
		@RequestMapping (value = "personas")
		public List <String> listarPersonas(){
			return List.of("Diego", "Juan", "Maria", "Mario");
			
		}
		
	
		// crear un solo usuario por parametros
		@RequestMapping (value = "usuarios")
		public Usuario listarUsuarios () {
			
			Usuario usuario = new Usuario();
			usuario.setNombre("Diego");
			usuario.setApellido("Vargas");
			usuario.setEmail("dvargasgodoy@gmail.com");
			usuario.setTelefono("155619965");
			
			
			return usuario; 
			
		}
		
		//harcodear el id
		@RequestMapping (value = "usuarios/{id}")
		public Usuario getUsuario (@PathVariable long id) {
			
			Usuario usuario = new Usuario();
			usuario.setId(id);
			usuario.setNombre("Diego");
			usuario.setApellido("Vargas");
			usuario.setEmail("dvargasgodoy@gmail.com");
			usuario.setTelefono("155619965");
			
			
			return usuario; 
			
		}
		
		
		// pasar una lista de personsas, desde un string
		@RequestMapping (value = "listarusuarios")
		public List <Usuario> listarVariosUsuarios (){
			
			List <Usuario> usuarios = new ArrayList <>();
			
			Usuario usuario1 = new Usuario();
			usuario1.setId(1L);
			usuario1.setNombre("Diego");
			usuario1.setApellido("Vargas");
			usuario1.setEmail("dvargasgodoy@gmail.com");
			usuario1.setTelefono("155619965");
			
			Usuario usuario2 = new Usuario();
			usuario2.setId(2L);
			usuario2.setNombre("Pablo");
			usuario2.setApellido("Flores");
			usuario2.setEmail("phfmkjghzdy@gmail.com");
			usuario2.setTelefono("155225588");
			
			Usuario usuario3 = new Usuario();
			usuario3.setId(3L);
			usuario3.setNombre("Maria");
			usuario3.setApellido("Serra");
			usuario3.setEmail("mslima@gmail.com");
			usuario3.setTelefono("155113344");
			
			Usuario usuario4 = new Usuario();
			usuario4.setId(4L);
			usuario4.setNombre("Martin");
			usuario4.setApellido("Lusteau");
			usuario4.setEmail("mlusteau@gmail.com");
			usuario4.setTelefono("155775533");
			
			Usuario usuario5 = new Usuario();
			usuario5.setId(5L);
			usuario5.setNombre("Albertitere");
			usuario5.setApellido("Fernandez");
			usuario5.setEmail("tegarq@gmail.com");
			usuario5.setTelefono("155155948");
			
			
			
			usuarios.add(usuario1);
			usuarios.add(usuario2);
			usuarios.add(usuario3);
			usuarios.add(usuario4);
			usuarios.add(usuario5);
			
			
			return usuarios;
			
		}
		
	*/	

}
