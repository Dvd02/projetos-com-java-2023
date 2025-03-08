package prova;

public class PessoaIMC extends Pessoa {
	private double peso;
	private double altura;

	public PessoaIMC(String nome, String dataNascimento, double peso, double altura) {
		super(nome, dataNascimento);
		this.setPeso(peso);
		this.setAltura(altura);
	}
	
	public String toString2() {
		String dados = super.toString2() +
					"\nPeso: " + this.getPeso() + " kg" + 
					"\nAltura: " + this.getAltura() +" m";
		return dados;
	}

	public double calcularIMC() {
		return (this.getPeso() / Math.pow(this.getAltura(), 2));
	}
	
	public double getPeso() {
		return peso;
	}
	
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public double getAltura() {
		return altura;
	}
	
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
}
