package Animais;

public class Animal {
	protected String nome;
	protected float comprimento;
	protected int numeroDePatas;
	protected String cor;
	protected String ambiente;
	protected float velocidadeMedia;

		
	public Animal(String nome, float comprimento, int numeroDePatas, String cor, String ambiente, float velocidadeMedia) {
		this.setNome(nome);
		this.setComprimento(comprimento);
		this.setNumeroDePatas(numeroDePatas);
		this.setCor(cor);
		this.setAmbiente(ambiente);
		this.setVelocidadeMedia(velocidadeMedia);
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getComprimento() {
		return comprimento;
	}
	public void setComprimento(float comprimento) {
		this.comprimento = comprimento;
	}
	public int getNumeroDePatas() {
		return numeroDePatas;
	}
	public void setNumeroDePatas(int numeroDePatas) {
		this.numeroDePatas = numeroDePatas;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getAmbiente() {
		return ambiente;
	}
	public void setAmbiente(String ambiente) {
		this.ambiente = ambiente;
	}
	public float getVelocidadeMedia() {
		return velocidadeMedia;
	}
	public void setVelocidadeMedia(float velocidadeMedia) {
		this.velocidadeMedia = velocidadeMedia;
	}

	public void dados() {
		String mensagem = "Nome: " + this.getNome() + "\n" +
			"Comprimento: " + this.getComprimento() + "cm\n" +
			"Patas: " + this.getNumeroDePatas() + "\n" +
			"Cor: " + this.getCor() + "\n" +
			"Ambiente: " + this.getAmbiente() + "\n" +
			"Velocidade Media: " + this.getVelocidadeMedia() + "m/s";
		
		System.out.println(mensagem);
	}

}
