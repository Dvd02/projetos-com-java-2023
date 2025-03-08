package Atividade4;

public class Departamento {
	protected String codigo;
	protected int numeroDeFuncionarios;
	protected String chefeResponsavel;
	
	public Departamento(String codigo, int numeroDeFuncionarios, Funcionario chefe) {
		super();
		this.codigo = codigo;
		this.numeroDeFuncionarios = numeroDeFuncionarios;
		this.chefeResponsavel = chefe.getCpf();
	}
	
	public Departamento(String codigo, int numeroDeFuncionarios) {
		this.codigo = codigo;
		this.numeroDeFuncionarios = numeroDeFuncionarios;
	}
	
	public void dados() {
		String dados = "Codigo: " + this.getCodigo() +
					 "\nCpf do Chefe: " + this.getChefeResponsavel() +
					 "\nNumero de Funcionarios: " + this.getNumeroDeFuncionarios();
		System.out.println(dados);
	}
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public int getNumeroDeFuncionarios() {
		return numeroDeFuncionarios;
	}
	public void setNumeroDeFuncionarios(int numeroDeFuncionarios) {
		this.numeroDeFuncionarios = numeroDeFuncionarios;
	}
	public String getChefeResponsavel() {
		return chefeResponsavel;
	}
	public void setChefeResponsavel(Funcionario chefe) {
		this.chefeResponsavel = chefe.getCpf();
	}
}
