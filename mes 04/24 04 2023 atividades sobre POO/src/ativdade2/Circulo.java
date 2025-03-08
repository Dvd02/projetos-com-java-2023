package ativdade2;

public class Circulo extends FormaGeometrica {

	private double raio;
	
	public Circulo(double raio) {
		this.setRaio(raio);
	}
	
	public String dados() {
		return  "Circulo com raio "+ this.getRaio() + "\n" +
				"  Area     : " + this.area() + "\n" +
				"  Perimetro: " + this.comprimento() + "\n";
	}
	
	public double area() {
		return Math.PI * Math.pow(this.getRaio(), 2);
	}

	public double comprimento() {
		return this.getRaio()*2;
	}
	
	public double getRaio() {
		return raio;
	}
	public void setRaio(double raio) {
		this.raio = raio;
	}
}
