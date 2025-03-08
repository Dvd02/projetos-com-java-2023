
public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pessoa p1 = new Pessoa("01", "joao", 4000);
		Servidor p2 = new Servidor("02", "marcos", 2000, 20);
		Diretor p3 = new Diretor("03", "silva", 7000,750);
		
		System.out.println( p1.dados() );
		System.out.println("--------------------");
		System.out.println( p2.dados() );
		System.out.println("--------------------");
		System.out.println( p3.dados() );

	}

}
