package br.com.eventomeioambiente.modelo;

import java.io.Serializable;
import java.sql.Time;
import java.util.Date;

public class Minicurso implements Serializable {
	private static final long serialVersionUID = 1L;

	private int idPalestra;
	private int tipo;
	private String tema;
	private Time horario;
	private int qntVagas;
	private String descricao;
	private Date data;
	private Palestrante palestrante;
	
	public Palestrante getPalestrante() {
		return palestrante;
	}
	public void setPalestrante(Palestrante palestrante) {
		this.palestrante = palestrante;
	}
	public int getIdPalestra() {
		return idPalestra;
	}
	public void setIdPalestra(int idPalestra) {
		this.idPalestra = idPalestra;
	}
	public int getQntVagas() {
		return qntVagas;
	}
	public void setQntVagas(int qntVagas) {
		this.qntVagas = qntVagas;
	}
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
