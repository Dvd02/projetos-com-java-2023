import java.util.Scanner;

public class Atividade17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		Double total = 0.0;
		Double valor1 = 0.0;
		int valor2 = 0;
		
		System.out.println("digite um valor qualquer: ");
		valor1 = sc.nextDouble();
		
		System.out.println("Digite um valor inteiro: ");
		valor2 = sc.nextInt();
		
		for (int i = 1; i <= valor2; i++) {
			total += valor1;
		}
		
		System.out.println("o resultado de "+ valor1 +" * "+ valor2 +" é " + total);
		sc.close();
		
	}

}
