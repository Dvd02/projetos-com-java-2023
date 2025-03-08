package prova;

public class Homem extends PessoaIMC {
	
	public Homem(String nome, String dataNascimento, double peso, double altura) {
		super(nome, dataNascimento, peso, altura);
	}
	
	public String resultIMC() {
		String dados = "";
		
		double imc = this.calcularIMC();
		if (imc < 20.7) {
			dados = "Abaixo do peso ideal";
		} else if ((20.7 <= imc) &&(imc <= 26.4)) {
			dados = "Peso Ideal";
		} else {
			dados = "Acima do peso";
		}
		
		return dados;
	}
	
	public String toString2() {
		String dados =  super.toString2() +
					"\nResultado IMC: " + this.resultIMC();
		return dados;
	}
	
}
