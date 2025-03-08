package Exceptions;

public class AlertaExecpetion extends Exception {
	private String mensagem;

	public AlertaExecpetion(String mensagem) {
		this.mensagem = mensagem;
	}

	@Override
	public String toString() {
		return mensagem;
	}
}
