import java.util.ArrayList;

public class Resumo {
	private String titulo;
	private String descricao;
	private String orientador;
	private ArrayList<String> autores;
	
	public Resumo(String titulo, String descricao, String orientador, ArrayList<String> autores) {
		this.titulo = titulo;
		this.descricao = descricao;
		this.orientador = orientador;
		this.autores = autores;
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getOrientador() {
		return orientador;
	}
	public void setOrientador(String orientador) {
		this.orientador = orientador;
	}
	public ArrayList<String> getAutores() {
		return autores;
	}
	public void setAutores(ArrayList<String> autores) {
		this.autores = autores;
	}
	
	public String toString() {
		return "Titulo: " + this.getTitulo()
			+"\nDescricao: " + this.getDescricao()
			+"\nOrientador: " + this.getOrientador()
			+"\nAutores: " + this.getAutores();
	}
	
}
