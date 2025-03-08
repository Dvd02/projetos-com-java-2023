package Atividade1;

public class PrincipalMidias {

	public static void main(String[] args) {
		Dvd d1 = new Dvd();
		Dvd d2 = new Dvd(1, 10, "xuxa", 2);
		Dvd d3 = new Dvd(2, 10, "galinha pintadinha", 4);
		
		Cd c1 = new Cd(3, 8, "musicas dos anos 90", 5);
		Cd c2 = new Cd(4, 8, "musicas dos anos 80", 6);
		
		d1.inserirDados();
		System.out.println();
		d1.printDados();
		System.out.println();
		d2.printDados();
		System.out.println();
		d3.printDados();
		System.out.println();
		c1.printDados();
		System.out.println();
		c2.printDados();
	}

}
