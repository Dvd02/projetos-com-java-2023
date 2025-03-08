package classes;

import interfaces.Operacao;

public class Primo implements Operacao {
	
	public double calcular(int valor) {
		if (valor <= 1) {
			return 0;
		}
		for(int i = 2; i <= Math.sqrt(valor); i++) {
			if (valor % i == 0) {
				return 0;
			}
		}
		return 1;
	};
	
	public String toPrint() {
		return "Classe: primo. ";
	};
	
	public String dados(int valor) {
		return this.toPrint() + valor +" é primo: "+ this.calcular(valor);
	}
	
}
