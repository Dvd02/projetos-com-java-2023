package Atividade3;

public class Peca {
	protected String nome;
	protected double custo;
	protected double lucro;
	
	public Peca(String nome, double custo, double lucro) {
		this.nome = nome;
		this.custo = custo;
		this.lucro = lucro;
	}

	public double calcularPreco() {
		return this.getCusto() - this.getLucro();
	}
	
	public void exibicao() {
		String dados=   "Nome:  " + this.getNome() + 
					  "\nCusto: " + this.getCusto() +
					  "\nLucro: " + this.getLucro() +
					  "\nPreço: " + this.calcularPreco();
		System.out.println(dados);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getCusto() {
		return custo;
	}

	public void setCusto(double custo) {
		this.custo = custo;
	}

	public double getLucro() {
		return lucro;
	}

	public void setLucro(double lucro) {
		this.lucro = lucro;
	}
	
}
