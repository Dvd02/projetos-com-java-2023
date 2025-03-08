package Atividade4;

public class Funcionario{
	protected String nome;
	protected String endereco;
	protected String telefone;
	protected String cpf;
	protected String dataNascimento;
	protected String dataAdmisao;
	protected String numeroDeDepartamento;
	
	public Funcionario(String nome, String endereco, String telefone, String cpf, String dataNascimento, String dataAdmisao, Departamento departamento) {
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
		this.dataAdmisao = dataAdmisao;
		this.numeroDeDepartamento = departamento.getCodigo();
	}
	
	public Funcionario(String nome, String endereco, String telefone, String cpf, String dataNascimento, String dataAdmisao) {
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
		this.dataAdmisao = dataAdmisao;
	}
	
	public void dados() {
		String dados = "CPF:  "+ this.getCpf() +
					 "\nNome: " + this.getNome() + 
					 "\nEndereço: " + this.getEndereco() +
					 "\nTelefone: " + this.getTelefone() +
					 "\nDepartamento: " + this.getNumeroDeDepartamento() +
					 "\nData Admisão:    " + this.getDataAdmisao() +
					 "\nData Nascimento: " + this.getDataNascimento();
		System.out.println(dados);
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getDataAdmisao() {
		return dataAdmisao;
	}
	public void setDataAdmisao(String dataAdmisao) {
		this.dataAdmisao = dataAdmisao;
	}
	public String getNumeroDeDepartamento() {
		return numeroDeDepartamento;
	}
	public void setNumeroDeDepartamento(Departamento departamento) {
		this.numeroDeDepartamento = departamento.getCodigo();
	}

}
