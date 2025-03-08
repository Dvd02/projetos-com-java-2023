public class Pessoa implements PessoaInterface {
	private String matricula;
	private String nome;
	private double salario;
	
	Pessoa(String matricula, String nome, double salario){
		this.matricula = matricula;
		this.nome = nome;
		this.salario = salario;
	}

	public String getMatricula() {
		return matricula;
	}
	public String getNome() {
		return nome;
	}
	public double getSalario() {
		return salario;
	}
	
	public String dados() {
		String mensagem =  "Nome: "+ this.getNome()
						+"\nMatricula: "+ this.getMatricula()
						+"\nSalario: "+ this.getSalario();
		return mensagem;
	}
	
}
