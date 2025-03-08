package main;

import classes.ContaCorrente;
import classes.GerenciadorDeImpostoDeRenda;
import classes.SeguroDeVida;

public class TestaTributavel {

	public static void main(String[] args) {
		ContaCorrente c1 = new ContaCorrente(1000);
		SeguroDeVida s1 = new SeguroDeVida(100);
		GerenciadorDeImpostoDeRenda g1 = new GerenciadorDeImpostoDeRenda();
		
		g1.adicionar(s1);
		g1.adicionar(c1);
		System.out.println("tributos da pessoa 1: "+ g1.obterTributos());
	}

}
