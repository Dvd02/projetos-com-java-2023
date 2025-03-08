package veiculos;

public class Aviao extends Aereo {
	
	public void print() {
		String mensagem = "Tipo: Aviao\n" + 
			"Capacidade: " + this.getCapacidade() + "\n" +
			"Altitude Maxima: " + this.getAltitudeMx() + "\n";
		
		System.out.println(mensagem);
	}
	
}
