package Animais;

public class Mamifero extends Animal {
	protected String alimento;
	
	public Mamifero(String nome, float comprimento, int numeroDePatas, String cor, String ambiente,float velocidadeMedia, String alimento) {
		super(nome, comprimento, numeroDePatas, cor, ambiente, velocidadeMedia);
		this.setAlimento(alimento);
	}

	public String getAlimento() {
		return alimento;
	}

	public void setAlimento(String alimento) {
		this.alimento = alimento;
	}
	
	public void dados() {
		super.dados();
		
		String mensagem = "Alimento: " + this.getAlimento() + "\n";
		
		System.out.println(mensagem);
	}
}
