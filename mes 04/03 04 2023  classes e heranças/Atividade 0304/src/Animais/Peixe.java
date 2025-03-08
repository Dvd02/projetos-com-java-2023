package Animais;

public class Peixe extends Animal {
	protected String caracteristica;
	
	public Peixe(String nome, float comprimento, int numeroDePatas, String cor, String ambiente,float velocidadeMedia, String caracteristica) {
		super(nome, comprimento, numeroDePatas, cor, ambiente, velocidadeMedia);
		this.setCaracteristica(caracteristica);
	}

	public String getCaracteristica() {
		return caracteristica;
	}

	public void setCaracteristica(String caracteristica) {
		this.caracteristica = caracteristica;
	}
	
	public void dados() {
		super.dados();
		
		String mensagem = "Caracterisrica: " + this.getCaracteristica() + "\n";
		
		System.out.println(mensagem);
	}
}
