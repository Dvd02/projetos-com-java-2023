import java.util.Scanner;

public class Atividade04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o seu nome: ");
		String nome = sc.nextLine();

		System.out.println("Digite a quantidade de vezes que quer imrprir seu nome(um valor inteiro): ");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.println(nome);
		}
		
		sc.close();
		
	}

}
