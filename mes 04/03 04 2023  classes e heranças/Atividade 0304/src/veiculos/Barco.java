package veiculos;

public class Barco extends Aquatico {
	protected String tipoMotor;

	public String getTipoMotor() {
		return tipoMotor;
	}

	public void setTipoMotor(String tipoMotor) {
		this.tipoMotor = tipoMotor;
	}
	
	public void print() {
		String mensagem = "Tipo: Barco\n" + 
			"Capacidade: " + this.getCapacidade() + "\n" +
			"Tipo motor: " + this.getTipoMotor() + "\n";
		
		System.out.println(mensagem);
	}
	
}
