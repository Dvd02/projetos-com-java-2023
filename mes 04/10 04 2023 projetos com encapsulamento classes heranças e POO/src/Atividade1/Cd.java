package Atividade1;

import java.util.Scanner;

public class Cd extends Midia {
	protected int nMusicas;

	public Cd() {};
	
	public Cd(int codigo, double preco, String nome, int nMusicas) {
		super(codigo, preco, nome);
		this.setNmusicas(nMusicas);
	}
	
	public String getTipo() {
		return "Tipo: CD\n";
	};
	
	public int getNmusicas() {
		return this.nMusicas;
	}

	public void setNmusicas(int nMusicas) {
		this.nMusicas = nMusicas;
	};
	
	public String getDetalhes() {
		return  super.getDetalhes() + "\n" +
				"Numero de Musicas: " + this.getNmusicas();
	}
	
	public void inserirDados() {
		super.inserirDados();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Infome o numero de Musicas: ");
		this.setNmusicas( sc.nextInt() );
		
		sc.close();
	}
}