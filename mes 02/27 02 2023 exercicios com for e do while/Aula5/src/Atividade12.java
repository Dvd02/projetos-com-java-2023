import java.util.Scanner;

public class Atividade12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		Double valor = 0.0;
		int valoresPares = 0;
		
		for (int i=1; i<=20; i++) {
			System.out.println("Digite o "+ i + "° valor: ");
			valor = sc.nextDouble();
			
			if (valor%2 == 0) {
				valoresPares++;
			}
		}
		
		System.out.println(valoresPares + " valor(es) são maiores pares");
		sc.close();
		
	}

}
