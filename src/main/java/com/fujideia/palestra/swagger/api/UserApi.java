package com.fujideia.palestra.swagger.api;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.fujideia.palestra.swagger.model.User;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", 
date = "2016-08-27T15:14:22.549Z")

@Api(value = "user", description = "the user API")
public interface UserApi {

	@ApiOperation(value = "User types", 
			notes = "Esse endpoint retorna informações a respeito do usuário em um sistema. ", response = User.class, responseContainer = "List", tags = {
			"User", })
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Um array de dados para representar o usuário", 
					response = User.class),
			@ApiResponse(code = 200, message = "Unexpected error", 
			response = User.class) })
	@RequestMapping(value = "/user", produces = { "application/json" }, method = RequestMethod.GET)
	ResponseEntity<List<User>> userGet(
			@ApiParam(value = "login do usuário no sistema.", required = true) 
			@RequestParam(value = "login", required = true) String login
			,
			@ApiParam(value = "token de acesso ao sistema.", required = true) 
			@RequestParam(value = "pass", required = true) String pass

	);

}
