package br.com.eventomeioambiente.modelo;

import java.io.Serializable;



public class Aluno implements Serializable{
	private static final long serialVersionUID = 1L;
	private int id_aluno;
	private String matricula;
	private String senha;
	private String cpf;
	private String nome;
	private String email;
	private String telefone;
	private int qrcode;
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
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
	public int getQrcode() {
		return qrcode;
	}
	public void setQrcode(int qrcode) {
		this.qrcode = qrcode;
	}
		
}