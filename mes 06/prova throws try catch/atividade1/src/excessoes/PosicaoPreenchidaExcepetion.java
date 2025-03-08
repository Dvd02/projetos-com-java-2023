package excessoes;

public class PosicaoPreenchidaExcepetion  extends Exception {
	private String mensagem;

	public PosicaoPreenchidaExcepetion(String mensagem) {
		this.mensagem = mensagem;
	}

	@Override
	public String toString() {
		return "posicão ja preenchida exception ["+mensagem+"]";
	}
}
