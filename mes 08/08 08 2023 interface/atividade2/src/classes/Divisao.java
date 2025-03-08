package classes;

import interfaces.OperacaoMatematica;

public class Divisao implements OperacaoMatematica {
	public int calcula() {
		return calcula(1);
	};

	public int calcula(int a) {
		return calcula(a, 1);
	};
	
	public int calcula(int a, int b) {
		return a / b;
	};
}
