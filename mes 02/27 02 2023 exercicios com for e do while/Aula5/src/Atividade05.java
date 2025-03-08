import java.util.Scanner;

public class Atividade05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		Double total = 0.0;
		
		for (int i=1; i<=10; i++) {
			System.out.println("Digite o " + i + "° valor: ");
			total += sc.nextDouble();
		}
		
		System.out.println("O resultado da soma dos valores é: " + total);
		
		sc.close();
	}

}
