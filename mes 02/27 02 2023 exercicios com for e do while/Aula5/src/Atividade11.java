import java.util.Scanner;

public class Atividade11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		Double valor = 0.0;
		int valoresMaioresQue18 = 0;
		
		for (int i=1; i<=20; i++) {
			System.out.println("Digite o "+ i + "° valor: ");
			valor = sc.nextDouble();
			
			if (valor >= 8) {
				valoresMaioresQue18++;
			}
		}
		
		System.out.println(valoresMaioresQue18 + " valores são maiores que 9");
		sc.close();
		
	}

}
