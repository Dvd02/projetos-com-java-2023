package excessoes;

public class PosicaoPreenchidaExcepetion  extends Exception {
	private String mensagem;

	public PosicaoPreenchidaExcepetion(String mensagem) {
		this.mensagem = mensagem;
	}

	@Override
	public String toString() {
		return "posic�o ja preenchida exception ["+mensagem+"]";
	}
}
