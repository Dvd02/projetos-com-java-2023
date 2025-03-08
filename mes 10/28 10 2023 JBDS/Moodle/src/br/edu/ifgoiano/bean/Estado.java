package br.edu.ifgoiano.bean;

public class Estado {

	private int idEstado;
	private String nome;
	private String regiao;

	public Estado(int idEstado, String nome, String regiao) {
		this.idEstado = idEstado;
		this.nome = nome;
		this.regiao = regiao;
	}

	public int getIdEstado() {
		return idEstado;
	}

	public void setIdEstado(int idEstado) {
		this.idEstado = idEstado;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRegiao() {
		return regiao;
	}

	public void setRegiao(String regiao) {
		this.regiao = regiao;
	}

}
