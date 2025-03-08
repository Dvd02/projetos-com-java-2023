package validacoes;

import excecoes.MenorQueZeroAbsolutoEmFahrenheit;

public class ValidaNumero {

	public static void menorQueZeroAbsolutoEmFahrenheit(double num) throws MenorQueZeroAbsolutoEmFahrenheit{
		double zeroAbsolutoEmFahrenheit = -459.67;
		if (num < zeroAbsolutoEmFahrenheit) {
			throw new MenorQueZeroAbsolutoEmFahrenheit();
		}
	}
	
}
