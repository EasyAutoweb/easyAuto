package com.easyauto.usuario;

public class PessoaFisica extends Usuario{

	private String nome;
	private String sobrenome;
	private String cpf;
	private String telefone;
	private String celular;
	private String dt_nasc;

	//Setters
	public void setNome(String nome) {
	    this.nome = nome;
	}
	
	public void setSobrenome(String sobrenome) {
	    this.sobrenome = sobrenome;
	}
	
	public void setCpf(String cpf) {
	    this.nome = cpf;
	}
	
	public void setTelefone(String telefone) {
	    this.telefone = telefone;
	}
	
	public void setCelular(String celular) {
	    this.nome = celular;
	}
	
	public void setDtNasc(String dt_nasc) {
	    this.nome = dt_nasc;
	}
	
	
	//Getters
	public String getNome(String nome) {
	    return this.nome;
	}
	
	public String getSobrenome(String sobrenome) {
	    return this.sobrenome;
	}
	
	public String getCpf(String cpf) {
	    return this.cpf;
	}
	
	public String getTelefone(String telefone) {
	    return this.telefone;
	}
	
	public String getCelular(String celular) {
	    return this.celular;
	}
	
	public String getDtNasc(String dt_nasc) {
	    return this.dt_nasc;
	}
	
}
