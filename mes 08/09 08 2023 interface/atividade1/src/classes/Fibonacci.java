
package classes;

import interfaces.Operacao;

public class Fibonacci implements Operacao {
	
	public double calcular(int valor) {
		
		if (valor <= 0) {
			return 0;
		} else if (valor == 1) {
			return 1;
		}
		
		int prev = 0;
		int current = 1;
		
		for(int i = 2; i <= valor; i++) {
			int temp = current;
			current = current + prev;
			prev = temp;
		}
		
		return current;
	};
	
	public String toPrint() {
		return "Classe: fibonacci. ";
	};
	
	public String dados(int valor) {
		return this.toPrint() + "O " + valor +"° termo escolhido é : "+ this.calcular(valor);
	}
	
}
