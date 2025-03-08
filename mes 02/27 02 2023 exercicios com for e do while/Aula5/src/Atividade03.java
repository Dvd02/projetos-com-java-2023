import java.util.Scanner;

public class Atividade03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o seu nome: ");
		String nome = sc.nextLine();
		
		for (int i=1; i<=10; i++) {
			System.out.println(nome);
		}
		
		sc.close();
	}

}
