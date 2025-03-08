package Atividade2;

public class Animal {
	protected String nome;
	protected String som;
	protected String movimento;
	protected int idade;
	
	public Animal(String nome, int idade, String som, String movimento) {
		this.setNome(nome);
		this.setIdade(idade);
		this.setSom(som);
		this.setMovimento(movimento);
	}
	
	public void emitirSom() {
		System.out.println(this.getNome() + " falou " + this.getSom() + ".");
	}
	
	public void movimentar() {
		System.out.println(this.getNome() + " " + this.getMovimento());
	}
	
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return this.idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getSom() {
		return this.som;
	}
	public void setSom(String som) {
		this.som = som;
	}
	public String getMovimento() {
		return this.movimento;
	}
	public void setMovimento(String movimento) {
		this.movimento = movimento;
	}

}
