package Atividade1;

public class DiaDosNamorados extends CartaoWeb {
	
	public DiaDosNamorados(String destinatario) {
		super.setDestinatario(destinatario);
	}
	
	String[] mensagens = {
		"Feliz dia dos namorados ",
		"felicidades ao casal ",
		"te adoro ",
		"felicidades ",
		"namoro serio em ",
		"que dia incrivel ",
		"dia dos namorados ",
		"dia de passar com ele(a) ",
		"vc é incrive ",
		"chocolates para vc, "
	};

	public void showMessage() {
		int mensagemAletoria = (int) (Math.random() * mensagens.length);
		System.out.println(mensagens[mensagemAletoria] + super.getDestinatario());
	}
	
}
