import java.util.Scanner;

public class Atividade10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um valor: ");
		Double valor = sc.nextDouble();
		
		for (int i=1; i<=10; i++) {
			System.out.println(i + " * " + valor + " = " + i*valor);	
		}
		sc.close();
		
	}

}
