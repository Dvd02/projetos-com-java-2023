package pessoa;

public class Gerente extends Funcionario {

	private String area;
	
	public void imprimirDados() {
		super.imprimirDados();
		String mensagem =  "Area: " + this.getArea();
		System.out.println(mensagem);
	}
	
	public double calcularImposto() {
		return this.getSalario() * 0.05;
	}
	
	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

}
