package Atividade2;

public class Zoologico {
	Animal jaulas[] = new Animal[10];
	
	public void animais() {
		for (int i=0; i<jaulas.length; i++) {
			jaulas[i] = new Animal(i+1+"° animal",0,"au au", "correu");
			
			jaulas[i].emitirSom();
			jaulas[i].movimentar();
			System.out.println();
		}
	}
	
}
