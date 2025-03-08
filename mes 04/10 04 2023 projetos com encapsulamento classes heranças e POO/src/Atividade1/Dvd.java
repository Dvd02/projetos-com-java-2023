package Atividade1;

import java.util.Scanner;

public class Dvd extends Midia {
	protected int nFaixas;

	public Dvd() {};
	
	public Dvd(int codigo, double preco, String nome, int nFaixas) {
		super(codigo, preco, nome);
		this.setNfaixas(nFaixas);
	}
	
	public String getTipo() {
		return "Tipo: DVD\n";
	};
	
	public int getNfaixas() {
		return nFaixas;
	}

	public void setNfaixas(int nFaixas) {
		this.nFaixas = nFaixas;
	};
	
	public String getDetalhes() {
		return  super.getDetalhes() + "\n" +
				"Numero de faixas: " + this.getNfaixas();
	}
	
	public void inserirDados() {
		super.inserirDados();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Infome o numero de faixas: ");
		this.setNfaixas( sc.nextInt() );
		
		sc.close();
	}
}
