package com.fujideia.palestra.swagger.api;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;

import com.fujideia.palestra.swagger.model.User;

import io.swagger.annotations.ApiParam;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-08-27T15:14:22.549Z")

@Controller
public class UserApiController implements UserApi {

	public ResponseEntity<List<User>> userGet(
			@ApiParam(value = "login do usuário no sistema.", required = true) 
			@RequestParam(value = "login", required = true) String login
			,
			@ApiParam(value = "token de acesso ao sistema.", required = true) 
			@RequestParam(value = "pass", required = true) String pass

	) {
		User usuario = new User();
		usuario.setId("123");
		usuario.setLogin("Fujioka");
		usuario.setPass("Mais um teste");
		usuario.setPerfil("Japa");
		
		List<User> listaUsuario = new ArrayList<>();
		listaUsuario.add(usuario);
		 ResponseEntity<List<User>> retornoOperacao = new ResponseEntity<List<User>>(listaUsuario, HttpStatus.OK);
		
		
		// do some magic!
		return retornoOperacao;
	}

}
