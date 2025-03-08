import java.util.Scanner;

public class Atividade16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int CrescenteOuDecresente = 0;
		int valor = 0;
		
		System.out.println("1 - crescente, 2 - decrescente: ");
		CrescenteOuDecresente = sc.nextInt();
		
		System.out.println("Digite um valor inteiro: ");
		valor = sc.nextInt();
		
		switch (CrescenteOuDecresente) {
			case 1:
				for (int i=Math.min(0, valor); i<=Math.max(0, valor); i++) {
					System.out.print(i + "; ");
				}
				break;
			case 2:
				for (int i=Math.max(0, valor); i>=Math.min(0, valor); i--) {
					System.out.print(i + "; ");
				} 
				break;
		}
		
		sc.close();
		
	}

}