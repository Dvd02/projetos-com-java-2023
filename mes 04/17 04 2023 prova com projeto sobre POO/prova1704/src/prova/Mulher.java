package prova;

public class Mulher extends PessoaIMC {
	public Mulher(String nome, String dataNascimento, double peso, double altura) {
		super(nome, dataNascimento, peso, altura);
	}
	
	public String resultIMC() {
		String dados = "";
		
		double imc = this.calcularIMC();
		if (imc < 19) {
			dados = "Abaixo do peso ideal";
		} else if ((19 <= imc) &&(imc <= 25.8)) {
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
