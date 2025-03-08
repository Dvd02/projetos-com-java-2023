package Atividade4;

public class Mensalista extends Funcionario {
	protected double salario;

	public Mensalista(String nome, String endereco, String telefone, String cpf, String dataNascimento, String dataAdmisao, Departamento departamento,  double salario) {
		super(nome, endereco, telefone, cpf, dataNascimento, dataAdmisao, departamento);
		this.salario = salario;
	}
	
	public Mensalista(String nome, String endereco, String telefone, String cpf, String dataNascimento, String dataAdmisao, double salario) {
		super(nome, endereco, telefone, cpf, dataNascimento, dataAdmisao);
		this.salario = salario;
	}
	
	public void dados() {
		super.dados();
		String dados = "salario: " + this.getSalario();
		System.out.println(dados);
	}
	
	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
}
