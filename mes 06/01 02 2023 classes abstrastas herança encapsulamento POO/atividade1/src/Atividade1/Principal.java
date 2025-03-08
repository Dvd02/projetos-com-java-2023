package Atividade1;

public class Principal {

	public static void main(String[] args) {

		CartaoWeb[] cartoes = {
			new Natal("julia"),
			new Aniversario("marcela"),
			new DiaDosNamorados("clara")
		};
		
		for (int i = 0; i < cartoes.length; i++) {
			cartoes[i].showMessage();
		}
		
	}
}
