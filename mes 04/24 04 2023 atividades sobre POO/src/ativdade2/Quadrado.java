package ativdade2;

public class Quadrado extends FormaGeometrica {

	private double lado;
	
	public Quadrado(double lado) {
		this.setLado(lado);
	}
	
	public String dados() {
		return  "Quadrado com lado "+ this.getLado() + "\n" +
				"  Area     : " + this.area() + "\n" +
				"  Perimetro: " + this.comprimento() + "\n";
	}
	
	public double area() {
		return Math.pow(this.getLado(), 2);
	}

	public double comprimento() {
		return this.getLado()*4;
	}
	
	public double getLado() {
		return lado;
	}
	public void setLado(double lado) {
		this.lado = lado;
	}
}
