package com.easyauto.usuario;

public class Usuario {

	private int idUsuario;
	private String email;
	private String senha;
	
	//Setters
	public void setIdUsuario(int idUsuario) {
	    this.idUsuario = idUsuario;
	}
	
	public void setEmail(String email) {
	    this.email = email;
	}
	
	public void setSenha(String senha) {
	    this.senha = senha;
	}
	
	//Getters
	public int getIdUsuario() {
	    return this.idUsuario;
	}
	
	public String getEmail() {
	    return this.email;
	}
	
	public String getSenha() {
	    return this.senha;
	}
	
	//Methods
	boolean cadastrar() {
		if(this.getEmail() != null && this.getSenha() != null) {
			return true;	
		}
		return false;
	}
	
	boolean editar(int idUsuario) {
		if(this.getIdUsuario() == 0) {
			return true;	
		}
		return false;
	}
	
	boolean login() {
		if(!this.email.isEmpty() && !this.senha.isEmpty()) {
			return true;	
		}
		return false;
	}
	
	boolean recuperarSenha() {
		if(!this.email.isEmpty()) {
			return true;	
		}
		return false;
	}

}

