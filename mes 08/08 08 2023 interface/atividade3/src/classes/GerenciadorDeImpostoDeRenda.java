package classes;

import interfaces.Tributavel;

public class GerenciadorDeImpostoDeRenda {
	private double valor = 0;
	
	public void adicionar(Tributavel tributo) {
		this.valor += tributo.calculaTributos();
	}
	
	public double obterTributos() {
		return valor;
	}

}
