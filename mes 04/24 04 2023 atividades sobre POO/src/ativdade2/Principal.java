package ativdade2;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 1; i <= 10; i++) {
			System.out.println(   new Quadrado(i).dados()  );
			System.out.println(   new Circulo(i).dados()  );
		}
		
	}

}
