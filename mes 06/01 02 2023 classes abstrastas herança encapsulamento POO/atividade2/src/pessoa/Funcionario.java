package pessoa;

public class Funcionario extends Pessoa {

	private Double salario;
	
	public void imprimirDados() {
		String mensagem =  "Nome: " + super.getNome()
						+"\nData de nascimento: " + super.getNascimento()
						+"\nSalario: R$" + this.getSalario()
						+"\nImposto: R$" + this.calcularImposto();
		
		System.out.println(mensagem);
	}
	
	public double calcularImposto() {
		return this.getSalario() * 0.03;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

}
