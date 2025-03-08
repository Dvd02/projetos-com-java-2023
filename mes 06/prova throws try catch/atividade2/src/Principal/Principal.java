package Principal;

import java.util.Scanner;
import Validacoes.Valida;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite um volume em litros: ");
		
		Double volume = sc.nextDouble();
		Double volumeEmMl = volume * 1000;
		Double volumeEmMl25Porcento = volumeEmMl * 0.25;
		Double volumeEmMl75Porcento = volumeEmMl * 0.75;
		Double mlEntre25E75Porcento = 0.00;
		boolean chegouAos25Porceto = false;
		boolean chegouAos75Porceto = false;
		int segundos = 0;
		
		for (int ml = 0; ml < volumeEmMl; ml+=1) {
			if (!chegouAos25Porceto) {
				try {
					Valida.preenchidos(ml, volumeEmMl25Porcento, "25%");
				} catch (Exception e) {
					chegouAos25Porceto = true;
					System.out.println( e.toString() );
				}
			}
			
			if ((volumeEmMl25Porcento <= ml) && (ml < volumeEmMl75Porcento)) {
				segundos += 2;
				mlEntre25E75Porcento += 1;
			}
			
			if (!chegouAos75Porceto) {
				try {
					Valida.preenchidos(ml, volumeEmMl75Porcento, "75%");
				} catch (Exception e) {
					chegouAos75Porceto = true;
					System.out.println( e.toString() );
				}
			}
		}
		
		System.out.println("o enchimento entre 25% e 75% foi de "+segundos+" segundos e usou "+mlEntre25E75Porcento+" ml.");
		sc.close();
	}
}


