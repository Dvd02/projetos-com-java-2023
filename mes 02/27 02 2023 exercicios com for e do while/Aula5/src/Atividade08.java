import java.util.Scanner;

public class Atividade08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int idade = 0;
		int quantidadeDeMaiores = 0;
		
		for (int i=1; i<=20; i++) {
			System.out.println("Digite a idade da "+ i + "° pessoa (em anos): ");
			idade = sc.nextInt();
			
			if (idade >= 18) {
				quantidadeDeMaiores++;
			}
		}
		
		System.out.println(quantidadeDeMaiores + " pessoa(s) são maiores de idade");
		sc.close();
		
	}

}
