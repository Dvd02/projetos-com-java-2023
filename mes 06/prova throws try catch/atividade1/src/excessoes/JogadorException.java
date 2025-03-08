package excessoes;

public class JogadorException  extends Exception {
	private String mensagem;

	public JogadorException(String mensagem) {
		this.mensagem = mensagem;
	}

	@Override
	public String toString() {
		return "jogador invalido ["+mensagem+"]";
	}
}
