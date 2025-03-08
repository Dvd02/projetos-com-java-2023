package validacoes;

import excecoes.ImparException;

public class ValidaNumero {

	public static void par(int num) throws ImparException{
		if (num%2 != 0) {
			throw new ImparException(num);
		}
	}
	
}
