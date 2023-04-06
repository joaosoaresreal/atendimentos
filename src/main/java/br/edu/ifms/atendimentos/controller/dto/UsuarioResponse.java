package br.edu.ifms.atendimentos.controller.dto;

import java.util.UUID;

public class UsuarioResponse {
	private String nome;
	private String cpf;
	private String senha;
	private String endereco;
	private String email;
	private String telefone;
	
	private UUID id;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public UUID getId() {
		return id;
	}

	void setId(UUID id) {
		this.id = id;
	}

}
