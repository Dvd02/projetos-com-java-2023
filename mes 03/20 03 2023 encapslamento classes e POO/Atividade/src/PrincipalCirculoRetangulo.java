
public class PrincipalCirculoRetangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Retangulo r1 = new Retangulo(2,3);
		Circulo c1 = new Circulo(2);
		
		System.out.println("area r1: " + r1.area() );
		System.out.println("perimetro r1: " + r1.perimetro() );
		
		System.out.println();
		
		System.out.println("area c1: " + c1.area() );
		System.out.println("perimetro c1: " + c1.perimetro() );
	}

}
