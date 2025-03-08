import java.util.Scanner;

public class Atividade06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int totalIdades = 0;
		
		for (int i=1; i<=20; i++) {
			System.out.println("Digite a idade da "+ i + "° pessoa (em anos): ");
			totalIdades += sc.nextInt();
		}
		
		System.out.println("A soma das idades é " + totalIdades);
		sc.close();
		
	}

}
