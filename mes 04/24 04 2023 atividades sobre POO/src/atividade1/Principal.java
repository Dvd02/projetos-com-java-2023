package atividade1;

public class Principal {

	public static void main(String[] args) {
		
		System.out.println("soma: " +           new Soma().calcular(6, 4)           );
		System.out.println("divisao: " +        new Divisao().calcular(6, 4)        );
		System.out.println("subtracao: " +      new Subtracao().calcular(6, 4)      );
		System.out.println("multiplicacao: " +  new Multiplicacao().calcular(6, 4)  );

	}

}
