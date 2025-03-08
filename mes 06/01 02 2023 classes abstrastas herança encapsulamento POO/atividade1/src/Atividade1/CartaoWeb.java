package Atividade1;

public abstract class CartaoWeb {

	private String destinatario;
	
	public abstract void showMessage();

	public String getDestinatario() {
		return destinatario;
	}

	public void setDestinatario(String destinatario) {
		this.destinatario = destinatario;
	}
}
