package principal;

import jogo.JogoVelha;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JogoVelha jogo = new JogoVelha('o', 'x');
		
		jogo.iniciar();
		
		jogo.lance(0, 0, 2); jogo.lance(0, 1, 1); jogo.lance(0, 2, 1);
		jogo.lance(1, 0, 1); jogo.lance(1, 1, 2); jogo.lance(1, 2, 2);
		jogo.lance(2, 0, 1); jogo.lance(2, 1, 2); jogo.lance(2, 2, 1);
		
		System.out.println("--------------------------\n");
		jogo.iniciar();
		jogo.lance(0, 0, 1); jogo.lance(0, 1, 1); jogo.lance(0, 2, 1);
		

		System.out.println("--------------------------\n");
		jogo.iniciar();
		jogo.lance(0, 0, 2); jogo.lance(1, 1, 2); jogo.lance(2, 2, 2);
		

		System.out.println("--------------------------\n");
		jogo.iniciar();
		jogo.lance(0, 0, 1); jogo.lance(0, 0, 1);
		

		System.out.println("--------------------------\n");
		jogo.iniciar();
		jogo.lance(0, -1, 1);
		

		System.out.println("--------------------------\n");
		jogo.iniciar();
		jogo.lance(0, 0, -1);
	}

}
