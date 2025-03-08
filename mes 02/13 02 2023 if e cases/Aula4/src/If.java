import java.util.Scanner;

public class If {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int idade;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a sua idade: ");
		idade = sc.nextInt();
		
		if (idade >= 18) {
			System.out.println("Maior de idade");
		} else {
			System.out.println("Menor de idade");
		} 
		
		sc.close();
		
	}

}
