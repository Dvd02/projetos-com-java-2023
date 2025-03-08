

public class Diretor extends Pessoa {
	private double valorFuncao;

	Diretor(String matricula, String nome, double salario, double valorFuncao) {
		super(matricula, nome, salario);
		this.valorFuncao = valorFuncao;
	}

	public double getValorFuncao() {
		return this.valorFuncao;
	}
	
	@Override
	public double getSalario() {
		return super.getSalario() + this.getValorFuncao();
	}
	

	public String dados() {
		String mensagem = super.dados()
				+"\nValor função: "+ this.getValorFuncao();
		return mensagem;
	}
	
}
