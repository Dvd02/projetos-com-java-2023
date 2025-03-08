

public class Servidor extends Pessoa {
	private int cargaHoraria;

	Servidor(String matricula, String nome, double salario, int cargaHoraria) {
		super(matricula, nome, salario);
		this.cargaHoraria = cargaHoraria;
	}

	public int getCargaHoraria() {
		return this.cargaHoraria;
	}
	
	public String dados() {
		String mensagem = super.dados()
				+"\nCarha horaria: "+ this.getCargaHoraria();
		return mensagem;
	}
}
