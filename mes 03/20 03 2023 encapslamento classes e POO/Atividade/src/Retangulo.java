
public class Retangulo {
	double base;
	double altura;
	
	Retangulo(double base, double altura){
		this.base = base;
		this.altura = altura;
	}
	
	public double area(){
		return this.altura * this.base;
	}
	
	public double perimetro(){
		return (2 * this.altura) + (2 * this.base);
	}
}
