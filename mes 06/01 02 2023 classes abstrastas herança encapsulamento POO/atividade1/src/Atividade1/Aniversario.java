package Atividade1;

public class Aniversario extends CartaoWeb {

	public Aniversario(String destinatario) {
		super.setDestinatario(destinatario);
	}
	
	String[] mensagens = {
		"Muitos anos de vida ",
		"Feliz aniversario(a) ",
		"ta ficando velho(a) ",
		"felicidades ",
		"Daqui a pocuo ja vai de vala em ",
		"Idosooo(aaaa) ",
		"Nem parece que ja tem essa idade ",
		"Olha a ovada ",
		"So mais um dia normal ",
		"Cresceu muito"
	};

	public void showMessage() {
		int mensagemAletoria = (int) (Math.random() * mensagens.length);
		System.out.println(mensagens[mensagemAletoria] + super.getDestinatario());
	}
	
}
