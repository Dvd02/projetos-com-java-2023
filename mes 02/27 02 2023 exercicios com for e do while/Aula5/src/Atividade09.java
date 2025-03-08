import java.util.Scanner;

public class Atividade09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String nome = "";
		String nomeDaPessoaMaisNova = "";
		int menorIdade = 0;
		int idade = 0;
		
		for (int i=1; i<=10; i++) {
			System.out.print("\nDigite o nome da "+ i +"° pessoa: ");
			nome = sc.next();

			System.out.print("Digite a idade da "+ i +"° pessoa ("+ nome +"): ");
			idade = sc.nextInt();
			
			if (i == 1) {
				menorIdade = idade;
				nomeDaPessoaMaisNova = nome;
			}
			
			if (idade < menorIdade) {
				menorIdade = idade;
				nomeDaPessoaMaisNova = nome;
			}
		}
		
		System.out.println("\nA pessoa mais nova é o(a) "+ nomeDaPessoaMaisNova);
		sc.close();
		
	}

}
