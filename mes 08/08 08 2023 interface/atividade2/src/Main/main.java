package Main;

import classes.Divisao;
import classes.Multiplicacao;
import classes.Soma;
import classes.Subtracao;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Soma soma = new Soma();
		Subtracao subtracao = new Subtracao();
		Multiplicacao multiplicacao = new Multiplicacao();
		Divisao divisao = new Divisao();
				
		System.out.println("1 + 1 = "+ soma.calcula());
		System.out.println("1 - 1 = "+ subtracao.calcula());
		System.out.println("1 * 1 = "+ multiplicacao.calcula());
		System.out.println("1 / 1 = "+ divisao.calcula());
	}

}
