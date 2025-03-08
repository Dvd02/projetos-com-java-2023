package classes;

import interfaces.Tributavel;

public class SeguroDeVida implements Tributavel {
	private double valor;
	
	public SeguroDeVida(double valor) {
		this.setValor(valor);
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public double calculaTributos() {
		return 42;
	}
}


