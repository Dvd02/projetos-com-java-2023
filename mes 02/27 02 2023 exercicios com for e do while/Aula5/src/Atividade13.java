import java.util.Scanner;

public class Atividade13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		Double valor = 0.0;
		int valoresEntre100 = 0;
		
		for (int i=1; i<=20; i++) {
			System.out.println("Digite o "+ i + "° valor: ");
			valor = sc.nextDouble();
			
			if ((valor >= 0) && (valor <= 100)) {
				valoresEntre100++;
			}
		}
		
		System.out.println(valoresEntre100 + " valores estão entre 0 e 100");
		sc.close();
		
	}

}
