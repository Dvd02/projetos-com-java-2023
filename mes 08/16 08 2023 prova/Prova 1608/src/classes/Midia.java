package classes;
import interfaces.MidiaInterface;

public class Midia implements MidiaInterface {
	private String tipo;
	private int duracao;
	private String formato;
	
	public Midia(String tipo, int duracao, String formato) {
		this.tipo = tipo;
		this.duracao = duracao;
		this.formato = formato;
	}
	
	public String getTipo() {
		return tipo;
	}
	public int getDuracao() {
		return duracao;
	}
	public String getFormato() {
		return formato;
	}
	
	public String toString() {
		return  "Tipo: " + this.getTipo() + "\n" +
				"Duracao: "+ this.getDuracao() + "\n" + 
				"Formato: "+ this.getFormato() + "\n" +
				"--------------------";
	}
	
}
