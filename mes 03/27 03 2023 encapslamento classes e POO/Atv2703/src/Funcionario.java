
public class Funcionario {
	protected String nome;
	protected String cpf;
	protected double salario;

	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String novoNome){
		this.nome = novoNome;
	}

	public void setCpf(String novoCpf){
		this.cpf = novoCpf;
	}
	
	public String getCpf() {
		return this.cpf;
	}
	
	public double getSalario() {
		return this.salario;
	}

	public void setSalario(double novoSalario){
		this.salario = novoSalario;
	}
	
	public double getBonificacao() {
		return salario / 10;
	}
}
 