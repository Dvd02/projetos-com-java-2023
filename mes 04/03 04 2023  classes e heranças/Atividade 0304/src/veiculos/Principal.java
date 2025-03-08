package veiculos;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Automovel a1 = new Automovel(5, 4, 2, "preto", "FAF-7325");
		
		Automovel a2 = new Automovel(4, 5, 3, "rosa", "OWO-0034");
		
		Barco b1 = new Barco();
		b1.setCapacidade(7);
		b1.setTipoMotor("eletrico");
		
		a1.print();
		a2.print();
		b1.print();
	}

}
