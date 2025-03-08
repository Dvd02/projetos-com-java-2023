package prova;

public class Principal {

	public static void main(String[] args) {
		
		Homem homens[] = new Homem[5];
		Mulher mulheres[] = new Mulher[5];
		
		mulheres[0] = new Mulher("Ana",     "01/01/2000", 50, 1.70);
		mulheres[1] = new Mulher("Clara",   "03/04/2000", 60, 1.65);
		mulheres[2] = new Mulher("Julia",   "24/03/2000", 105, 1.72);
		mulheres[3] = new Mulher("Manuela", "17/08/2000", 80, 1.6);
		mulheres[4] = new Mulher("Maria",   "30/06/2000", 90, 1.9);
		
		homens[0] = new Homem("João",     "04/05/2000", 55, 1.72);
		homens[1] = new Homem("Carlos",   "16/02/2000", 67, 1.77);
		homens[2] = new Homem("Manuel",   "28/09/2000", 115, 1.85);
		homens[3] = new Homem("Henrique", "15/11/2000", 94, 1.83);
		homens[4] = new Homem("Marcos",   "07/03/2000", 82, 1.92);
		
		System.out.println("             MULHERES            ");
		System.out.println("---------------------------------");
		for (int i = 0; i < 5; i++) {
			System.out.println( mulheres[i].toString2() );
			System.out.println("---------------------------------");
		}
		
		System.out.println("\n\n\n");

		System.out.println("       HOMENS     ");
		System.out.println("---------------------------------");
		for (int i = 0; i < 5; i++) {
			System.out.println( homens[i].toString2() );
			System.out.println("---------------------------------");
		}
		
	}

}
