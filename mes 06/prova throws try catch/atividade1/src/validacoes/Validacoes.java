package validacoes;

import excessoes.JogadorException;
import excessoes.PosicaoInvalidaException;
import excessoes.PosicaoPreenchidaExcepetion;

public class Validacoes {

	public static void jogadorValido(int jogador) throws JogadorException {
		if (!(jogador == 1 || jogador == 2)) {
			throw new JogadorException( String.valueOf(jogador) );
		}
	}
	
	public static void posicaoValida(int linha, int coluna) throws PosicaoInvalidaException {
		if (!((0 <= linha && linha <= 2) && (0 <= coluna && coluna <= 2))) {
			throw new PosicaoInvalidaException( linha +";"+ coluna );
		}
	}
	
	public static void posicaoPreenchida(int linha, int coluna, char matriz[][]) throws PosicaoPreenchidaExcepetion {		
		if (matriz[linha][coluna] != '#') {
			throw new PosicaoPreenchidaExcepetion( linha +";"+ coluna +":"+ matriz[linha][coluna] );
		}
	}
	
}
