import java.util.Scanner;

public class Atividade15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		Double valor = 0.0;
		Double total = 0.0;
		
		do {
			total += valor;
			
			System.out.println("Digite um valor positivo: ");
			valor = sc.nextDouble();
		} while (valor >= 0);
		
		System.out.println("A soma total dos valore é: " + total);
		sc.close();
		
	}

}
