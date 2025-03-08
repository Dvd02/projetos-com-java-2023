package atv1;

import javax.swing.JOptionPane;

public class Carro {
	private String cor;
	private String marca;
	private String modelo;
	private String placa;
	
	public static Carro criaCarroInput() {
		String cor = JOptionPane.showInputDialog(null, "informe a cor do carro", "Criando Carro", -1);
		String marca = JOptionPane.showInputDialog(null, "informe a marca do carro", "Criando Carro", -1);
		String modelo = JOptionPane.showInputDialog(null, "informe a modelo do carro", "Criando Carro", -1);
		String placa = JOptionPane.showInputDialog(null, "informe a placa do carro", "Criando Carro", -1);
		return new Carro(cor, marca, modelo, placa);
		
	}
	
	public Carro(String cor, String marca, String modelo, String placa) {
		this.cor = cor;
		this.marca = marca;
		this.modelo = modelo;
		this.placa = placa;
	}
	
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	public String toString() {
		return this.getPlaca();
	}
	
	public String dados() {
		return "Placa: " + this.getPlaca() +
			"\nModelo: " + this.getModelo() +
			"\nMarca: " + this.getMarca() +
			"\nCor: " + this.getCor();
	}
	
}
