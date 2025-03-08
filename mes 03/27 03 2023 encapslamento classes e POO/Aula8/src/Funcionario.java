
public class Funcionario {

	// ====== iniciação =================
	protected String nome;
	protected String cpf;
	protected double salario;
	
	// ====== constructor ===============
	Funcionario(String nome, String cpf, double salario){
		this.nome = nome;
		this.cpf = cpf;
		this.salario = salario;
	}

	// ====== funções getters ===========
	public double getBonificacao() {
		return salario * 0.1;
	}
	
	public String getNome() {
		return this.nome;
	}

	public String getCpf() {
		return this.cpf;
	}
	
	public double getSalario() {
		return this.salario;
	}
	
	public String dados() {
		return  "Nome       : " + this.getNome() + "\n" + 
				"CPF        : " + this.getCpf() + "\n" +
				"Salario    : " + this.getSalario() + "\n" + 
				"Bonificacao: " + this.getBonificacao();
	}
	
	
	// ====== funções setters ===========
	public void setNome(String novoNome){
		this.nome = novoNome;
	}

	public void setCpf(String novoCpf){
		this.cpf = novoCpf;
	}

	public void setSalario(double novoSalario){
		this.salario = novoSalario;
	}
}
 