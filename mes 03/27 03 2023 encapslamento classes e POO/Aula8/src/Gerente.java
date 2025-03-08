
public class Gerente extends Funcionario {
	Gerente(String nome, String cpf, double salario) {
		super(nome, cpf, salario);
	}

	@Override
	public double getBonificacao() {
		return salario * 0.15;
	}	
}
