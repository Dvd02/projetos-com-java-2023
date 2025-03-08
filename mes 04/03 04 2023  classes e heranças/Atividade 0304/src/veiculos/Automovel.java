package veiculos;

public class Automovel extends Terrestre {
	protected String cor;
	protected int numeroPortas;
	protected String placa;
	
	
	
	public Automovel(int capacidade, int numeroRodas, int numeroPortas, String cor, String placa) {
		this.setCapacidade(capacidade);
		this.setNumeroRodas(numeroRodas);
		this.setNumeroPortas(numeroPortas);
		this.setCor(cor);
		this.setPlaca(placa);
	}
	
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public int getNumeroPortas() {
		return numeroPortas;
	}
	public void setNumeroPortas(int numeroPortas) {
		this.numeroPortas = numeroPortas;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public void print() {
		String mensagem = "Tipo: Automovel\n" + 
			"Capacidade: " + this.getCapacidade() + "\n" +
			"Numero de rodas: " + this.getNumeroRodas() + "\n" +
			"Numero de Portas: " + this.getNumeroPortas() + "\n" +
			"Cor: " + this.getCor() + "\n" +
			"Placa: " + this.getPlaca() + "\n";
		
		System.out.println(mensagem);
	}
	
}
