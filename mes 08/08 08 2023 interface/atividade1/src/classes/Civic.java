package classes;

import interfaces.Motor;
import interfaces.Transmissao;
import interfaces.Veiculo;

public class Civic implements Veiculo,Motor,Transmissao {
	private int rpm;
	private double potencia;
	private String tipoTransmissao;
	private double peso;
	private String tipo;
		
	Civic(int rpm, double potencia, String tipoTransmissao, double peso, String tipo){
		this.rpm = rpm;
		this.potencia = potencia;
		this.tipoTransmissao = tipoTransmissao;
		this.tipo = tipo;
	}
	
	public int getRPM() {
		return this.rpm;
	};
	public double getPotencia() {
		return this.potencia;
	};
	
	public String getTipoTransmissao() {
		return this.tipoTransmissao;
	};
	
	public double getPeso(){
		return this.peso;
	};
	public String getTipo() {
		return this.tipo;
	};
	
	public String Dados() {
		String msn =  "RPM: " + this.getRPM() + 
					"\nPotencia: " + this.getPotencia() +
					"\nTipo transmissão: " + this.getTipoTransmissao() +
					"\npeso: "+ this.getPeso() +" kg" +
					"\ntipo: " + this.getTipo();
		return msn;
	}
}
