package artigo;

import java.util.Scanner;

public class EnumsJava {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String planeta;
		
		System.out.println("Para qual planeta deseja viajar?");
		planeta = entrada.next().toUpperCase(); 
		
		entrada.close();
		
		ClasseTesteEnum pl = new ClasseTesteEnum(planeta);
		pl.viajarPlaneta();
	}
	
}