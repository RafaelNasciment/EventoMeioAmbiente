package br.com.eventomeioambiente.modelo;

import java.io.Serializable;
import java.sql.Time;
import java.util.Date;

public class Palestra implements Serializable {
	private static final long serialVersionUID = 1L;

	private int id_palestra;
	private int tipo;
	private String tema;
	private Time horario;
	private int qnt_vagas;
	private String descricao;
	private Date data;
	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	public String getTema() {
		return tema;
	}
	public void setTema(String tema) {
		this.tema = tema;
	}
	public Time getHorario() {
		return horario;
	}
	public void setHorario(Time horario) {
		this.horario = horario;
	}
	public int getQnt_vagas() {
		return qnt_vagas;
	}
	public void setQnt_vagas(int qnt_vagas) {
		this.qnt_vagas = qnt_vagas;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
}
