import java.util.Scanner;

public class Atividade14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		Double valor = 0.0;
		int valoresEntre0e100 = 0;
		int valoresEntre101e200 = 0;
		int valoresMaiorQue200 = 0;
		
		for (int i=1; i<=20; i++) {
			System.out.println("Digite o "+ i + "° valor: ");
			valor = sc.nextDouble();
			
			if ((valor >= 0) && (valor <= 100)) {
				valoresEntre0e100++;
			} else if ((valor >= 101) && (valor <= 200)) {
				valoresEntre101e200++;
			} else if (valor > 200) {
				valoresMaiorQue200++;
			}
		}
		
		System.out.println(valoresEntre0e100 + " valores estão entre 0 e 100");
		System.out.println(valoresEntre101e200 + " valores estão entre 101 e 200");
		System.out.println(valoresMaiorQue200 + " valores são maiores que 200");
		sc.close();
		
	}

}
