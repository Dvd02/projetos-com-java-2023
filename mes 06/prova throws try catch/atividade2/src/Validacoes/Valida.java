package Validacoes;

import Exceptions.AlertaExecpetion;

public class Valida {
	public static void preenchidos(int preenchimentoAtual, double preenchimentoMinimo, String mensagem) throws AlertaExecpetion {
		if (preenchimentoMinimo <= preenchimentoAtual) {
			throw new AlertaExecpetion("O recipiente preencheu [" + mensagem + "]");
		}
	
	}
}
