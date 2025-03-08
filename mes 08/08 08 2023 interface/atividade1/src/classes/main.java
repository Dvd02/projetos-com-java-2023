package classes;

public class main {

	public static void main(String[] args) {
		Civic carro1 = new Civic(3000,150,"Manual",1500,"terrestre");
		Gol carro2 = new Gol(2500,200,"Automatica",1700,"terrestre");
		
		System.out.println( carro1.Dados() );
		System.out.println("--------------------");
		System.out.println( carro2.Dados() );
	}

}
