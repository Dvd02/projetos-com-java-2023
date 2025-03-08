
public class Circulo {
	double raio;
	double diametro;
	
	Circulo(double raio){
		this.raio = raio;
		this.diametro = raio*2;
	}
	
	public double area(){
		return Math.PI * (this.raio * this.raio);
	}
	
	public double perimetro(){
		return 2 * Math.PI * this.raio;
	}
}
