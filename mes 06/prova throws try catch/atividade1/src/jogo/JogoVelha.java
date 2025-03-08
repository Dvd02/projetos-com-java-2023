package jogo;

import validacoes.Validacoes;

public class JogoVelha {
	
	char P1Symbol;
	char P2Symbol;
	
	public static final int P1 = 1;
	public static final int P2 = 2;
	public char mesa[][] = new char[3][3];
	
	public JogoVelha (char P1Symbol, char P2Symbol) {
		this.P1Symbol = P1Symbol;
		this.P2Symbol = P2Symbol;
	}
	
	public void iniciar() {
		mesa = new char[3][3];
		for (int i = 0; i < mesa.length; i++) {
			for (int j = 0; j < mesa[i].length; j++) {
				mesa[i][j] = '#';
			}
			
		}
	}
	
	public void toPrint() {
		String mensagem = ".---.---.---.\n"+"";
		for (int i = 0; i < mesa.length; i++) {
			mensagem += "| ";
			for (int j = 0; j < mesa[i].length; j++) {
				mensagem += mesa[i][j] + " | "; 
			}
			mensagem += "\n";
			
			if (i+1 < mesa.length) {
				mensagem +="|---+---+---|\n"; 
			}
		}
        mensagem += "'---'---'---'\n";	
        
		System.out.println(mensagem);
	}

	public void lance (int linha, int coluna, int jogada) {
		
		try {
			Validacoes.posicaoValida(linha, coluna);
			Validacoes.posicaoPreenchida(linha, coluna, mesa);
			Validacoes.jogadorValido(jogada);
		} catch (Exception e) {
			System.out.println( e.toString() );
			return;
		}
			
		char simbolo = '#';
		if (jogada == 1) {
			simbolo = P1Symbol;
		} else if (jogada == 2) {
			simbolo = P2Symbol;
		}
		
		mesa[linha][coluna] =  simbolo;
		
		toPrint();
		int resultado = checkWinner();
		if (resultado == 0) {
			System.out.println("jogo empatado");
		} else if (resultado == 1 || resultado == 2) {
			System.out.println("jogador "+ resultado +" venceu");
		}
	}
	
	public int checkWinner() {
		// inicia as variaveis para ver quem ganhou
		char jogadores[] = {P1Symbol,P2Symbol};
		boolean achouVencedor = false;
		int venceu = 0;
		
		for (int i = 0; i < jogadores.length; i++) { //loop para testar para os dois jogadores
			
			for (int j = 0; j < mesa.length; j++) { //loop para testar as 3 linhas/colunas
				if (((mesa[j][0] == jogadores[i]) && (mesa[j][1] == jogadores[i]) && (mesa[j][2] == jogadores[i])) ||  //testa linha
			       ((mesa[0][j] == jogadores[i]) && (mesa[1][j] == jogadores[i]) && (mesa[2][j] == jogadores[i])) ){   //testa coluna
					venceu = i+1;
					achouVencedor = true;
					break;
				}
			}
			
			if ( ((mesa[0][0] == jogadores[i]) && (mesa[1][1] == jogadores[i]) && (mesa[2][2] == jogadores[i])) || //diagonal principal
			     ((mesa[0][2] == jogadores[i]) && (mesa[1][1] == jogadores[i]) && (mesa[2][0] == jogadores[i])) ){ //diagonal secundaria
				venceu = i+1;
				achouVencedor = true;
				break;
			}
			
			if (achouVencedor) { //para se ja tiver encontrado um vencedor
				break;
			}
		}
		
		//testa se ainda tem espaços vagos
		boolean tabuleiroComLugarVago = false;
		for (int i = 0; i < mesa.length; i++) {
			for (int j = 0; j < mesa[i].length; j++) {
				if (mesa[i][j] == '#') {
					tabuleiroComLugarVago = true;
				}
			}	
		}
		//testa se ainda tem espaços vagos e se ninguem ganhou
		if (tabuleiroComLugarVago && venceu == 0) {
			return -1;
		}
		
		return venceu; //-1 : espaços vagos ainda    0: empate   1: jogador 1 venceu     2: jogador 2 venceu
	}
	
}

