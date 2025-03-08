package principal;

import java.util.Scanner;
import excecoes.ImparException;
import validacoes.ValidaNumero;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 10; i++) {
			try {
				System.out.print("Digite o "+(i+1)+"° numero: ");
				int num = sc.nextInt();
				ValidaNumero.par(num);
			}catch(ImparException e){
				System.out.println( e.toString() ); 
			}
		}
		sc.close();
	}
	
}

