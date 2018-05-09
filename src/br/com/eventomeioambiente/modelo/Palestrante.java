package br.com.eventomeioambiente.modelo;

import java.io.Serializable;

public class Palestrante implements Serializable {
	private static final long serialVersionUID = 1L;
	private int idPalestrante;
	private String nome;
	private String descricao;
	private String curriculo;
	
	public int getIdPalestrante() {
		return idPalestrante;
	}
	public void setIdPalestrante(int idPalestrante) {
		this.idPalestrante = idPalestrante;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getCurriculo() {
		return curriculo;
	}
	public void setCurriculo(String curriculo) {
		this.curriculo = curriculo;
	}
}
