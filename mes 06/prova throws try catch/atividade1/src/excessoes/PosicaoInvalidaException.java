package excessoes;

public class PosicaoInvalidaException  extends Exception {
	private String mensagem;

	public PosicaoInvalidaException(String mensagem) {
		this.mensagem = mensagem;
	}

	@Override
	public String toString() {
		return "posic�o invalida exception ["+mensagem+"]";
	}
}
