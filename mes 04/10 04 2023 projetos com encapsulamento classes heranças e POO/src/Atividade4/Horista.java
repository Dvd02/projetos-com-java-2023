package Atividade4;

public class Horista extends Funcionario {
	protected double taxaHora;

	public Horista(String nome, String endereco, String telefone, String cpf, String dataNascimento, String dataAdmisao, Departamento departamento,  double taxaHora) {
		super(nome, endereco, telefone, cpf, dataNascimento, dataAdmisao, departamento);
		this.taxaHora = taxaHora;
	}
	
	public Horista(String nome, String endereco, String telefone, String cpf, String dataNascimento, String dataAdmisao, double taxaHora) {
		super(nome, endereco, telefone, cpf, dataNascimento, dataAdmisao);
		this.taxaHora = taxaHora;
	}

	public void dados() {
		super.dados();
		String dados = "Taxa a hora: " + this.getTaxaHora();
		System.out.println(dados);
	}
	
	public double getTaxaHora() {
		return taxaHora;
	}

	public void setTaxaHora(double taxaHora) {
		this.taxaHora = taxaHora;
	}	
}
