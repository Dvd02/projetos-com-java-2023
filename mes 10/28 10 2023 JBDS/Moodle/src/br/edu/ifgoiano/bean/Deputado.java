package br.edu.ifgoiano.bean;

import java.util.Date;

public class Deputado {

	private int idDeputado;
	private String nome;
	private Date dataIngresso;
	private String partido;
	private Estado idEstado;

	public Deputado(int idDeputado, String nome, Date dataIngresso, String partido, Estado idEstado) {
		this.idDeputado = idDeputado;
		this.nome = nome;
		this.dataIngresso = dataIngresso;
		this.partido = partido;
		this.idEstado = idEstado;
	}

	public int getIdDeputado() {
		return idDeputado;
	}

	public void setIdDeputado(int idDeputado) {
		this.idDeputado = idDeputado;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataIngresso() {
		return dataIngresso;
	}

	public void setDataIngresso(Date dataIngresso) {
		this.dataIngresso = dataIngresso;
	}

	public String getPartido() {
		return partido;
	}

	public void setPartido(String partido) {
		this.partido = partido;
	}

	public Estado getIdEstado() {
		return idEstado;
	}

	public void setIdEstado(Estado idEstado) {
		this.idEstado = idEstado;
	}
	
	public String toString() {
		return nome;
	}

}
