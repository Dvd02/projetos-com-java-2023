package principal;

import java.util.Scanner;

import validacoes.ValidaNumero;
import excecoes.MenorQueZeroAbsolutoEmFahrenheit;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite uma temperatura em fahrenheit: ");
		double num = sc.nextInt();
		toCelsius(num);
		
		sc.close();
	}
	
	public static void toCelsius(double fahrenheit) {
		try {
			ValidaNumero.menorQueZeroAbsolutoEmFahrenheit(fahrenheit);
			double celsius = 5 * (fahrenheit - 32) / 9; 
			
			System.out.println("celsius: " + celsius);
		} catch (MenorQueZeroAbsolutoEmFahrenheit e) {
			e.printStackTrace();
			System.exit(0);
		}
		
	}
}

