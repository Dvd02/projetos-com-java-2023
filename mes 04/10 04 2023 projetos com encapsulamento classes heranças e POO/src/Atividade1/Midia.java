package Atividade1;

import java.util.Scanner;

public class Midia {
	protected int codigo;
	protected double preco;
	protected String nome;
	
	public Midia() {}
	
	public Midia(int codigo, double preco, String nome) {
		this.codigo = codigo;
		this.preco = preco;
		this.nome = nome;
	}
	

	public String getTipo() {
		return "Tipo: Midia\n";
	};
	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	};
	
	public String getDetalhes() {
		return  "Nome: " + this.getNome() + "\n" +
				"Preço: " + this.getPreco() + "\n" +
				"Codigo: " + this.getCodigo();
	};
	
	public void printDados() {
		System.out.println( this.getTipo() +
							this.getDetalhes()  );
	};
	
	public void inserirDados() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o nome: ");
		this.setNome( sc.next() );
		
		System.out.println("Infome o preço: ");
		this.setPreco( sc.nextDouble() );
		
		System.out.println("Infome o codigo: ");
		this.setCodigo( sc.nextInt() );
		
	}

}
