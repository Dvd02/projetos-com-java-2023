import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double  valor;
		int     idade;
		String  nome;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o seu nome: ");
		nome = sc.nextLine();
		
		System.out.print("Digite sua idade: ");
		idade = sc.nextInt();
		
		System.out.print("Digite seu salario: ");
		valor = sc.nextDouble();
		
		System.out.println("O funcionario " + nome + " tem " + 
				idade + " anos e recebe um salario de " + valor + " reais");
		
		sc.close();
	}

}
