package main;
import classes.Audio;
import classes.Ebook;
import classes.Midia;
import classes.Video;

public class Main {
	
	public static void atv1() {
		//instancia as variaveis
		Midia midias[] = new Midia[10];
		int dvdsGerados = 0;
		int maiorQue120 = 0;
		
		//loop de gera��o
		for (int i = 0; i < midias.length; i++) {

			//geracao aleatoria da duracao
			int duracao = 90 + (int)(Math.random()*61);

			//geracao aleatoria do formato
			String formato = "DVD";
			if ((int)(Math.random() * 2) == 1) {
				formato = "WEB";
			}
			
			//geracao da midia aleatoria com os dados aleatorios anteriores
			int midia = 1 + (int)(Math.random() * 3);
			switch (midia) {
			case 1:
				midias[i] = new Audio(duracao, formato);
				break;
			case 2:
				midias[i] = new Video(duracao,formato);
				break;
			case 3:
				midias[i] = new Ebook(formato);
				break;
			}
			
			//contagem de midias especificas
			if (120 < midias[i].getDuracao() ) {
				maiorQue120++;
			}
			if (midias[i].getFormato() == "DVD" ) {
				dvdsGerados++;
			}
			
			//mostrando a midia gerada
			System.out.println( midias[i]);
		}
		
		//mostrando os resultados finais
		System.out.println("Dvd gerados: "+ dvdsGerados);
		System.out.println("Midias com dura��o maior que 120: "+ maiorQue120);
	}
	
	public static void main(String[] args) {
		atv1();
	}

}
