package validacoes;

import excecoes.ForaDoIntervaloException;

public class ValidaNumero {

	public static void EstaNoIntervalo(int num, int inicioDoIntervalo, int fimDoIntervalo) throws ForaDoIntervaloException{
		if (!((inicioDoIntervalo <= num) && (num <= fimDoIntervalo))) {
			throw new ForaDoIntervaloException();
		}
	}
	
}
