package Atividade1;

public class Natal extends CartaoWeb {

	public Natal(String destinatario) {
		super.setDestinatario(destinatario);
	}
	
	String[] mensagens = {
		"feliz natal ",
		"otima ceia de natal ",
		"dia especial ",
		"nascimento de jesus ",
		"vou te dar um presente incrivel ",
		"um natal iluminado ",
		"tenha a bença da luz ",
		"é pave ou pa comer? K K K K ",
		"estamos perto do fim do ano em ",
		"a comida do natal estava incrivel "
	};

	public void showMessage() {
		int mensagemAletoria = (int) (Math.random() * mensagens.length);
		System.out.println(mensagens[mensagemAletoria] + super.getDestinatario());
	}
	
}
