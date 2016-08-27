package com.fujideia.palestra.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * User
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", 
date = "2016-08-27T15:14:22.549Z")

public class User {
	private String id = null;

	private String login = null;

	private String pass = null;

	private String perfil = null;

	public User id(String id) {
		this.id = id;
		return this;
	}

	/**
	 * Identificador do usuário.
	 * 
	 * @return id
	 **/
	@ApiModelProperty(value = "Identificador do usuário.")
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public User login(String login) {
		this.login = login;
		return this;
	}

	/**
	 * login do usuário.
	 * 
	 * @return login
	 **/
	@ApiModelProperty(value = "login do usuário.")
	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public User pass(String pass) {
		this.pass = pass;
		return this;
	}

	/**
	 * login do usuário.
	 * 
	 * @return pass
	 **/
	@ApiModelProperty(value = "login do usuário.")
	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public User perfil(String perfil) {
		this.perfil = perfil;
		return this;
	}

	/**
	 * perfil do usuário.
	 * 
	 * @return perfil
	 **/
	@ApiModelProperty(value = "perfil do usuário.")
	public String getPerfil() {
		return perfil;
	}

	public void setPerfil(String perfil) {
		this.perfil = perfil;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		User user = (User) o;
		return Objects.equals(this.id, user.id) && Objects.equals(this.login, user.login)
				&& Objects.equals(this.pass, user.pass) && Objects.equals(this.perfil, user.perfil);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, login, pass, perfil);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class User {\n");

		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    login: ").append(toIndentedString(login)).append("\n");
		sb.append("    pass: ").append(toIndentedString(pass)).append("\n");
		sb.append("    perfil: ").append(toIndentedString(perfil)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	/**
	 * Convert the given object to string with each line indented by 4 spaces
	 * (except the first line).
	 */
	private String toIndentedString(java.lang.Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}
}
