
public class Carro {

	//instancia as variaveis
	String cor;
	String modelo;
	double velocidadeMaxima;
	double velocidadeAtual;
	boolean ligado;
	Motor motor;
	
	//construtor com parametros e inicia as variaveis
	public Carro(String tipMot, double velMax) {
		this.motor = new Motor();
		this.motor.tipoMotor = tipMot;
		this.velocidadeMaxima = velMax;
		this.velocidadeAtual = 0;
		this.ligado = false;
	}
	
	//funções
	public void ligaCarro() {
		if (!ligado) {
			this.ligado = true;
		}
	}
	
	public void acelera(double velocidade) {
		if (velocidade >= 0) {
			this.velocidadeAtual += velocidade;
		}
	}
	
	public int pegaMarcha() {
		int marcha = -1;
		if ((1 <= this.velocidadeAtual) && (this.velocidadeAtual <= 40)){
			marcha = 1;
		} else if ((40 < this.velocidadeAtual) && (this.velocidadeAtual <= 60)) {
			marcha = 2;
		} else if (60 < this.velocidadeAtual) {
			marcha =3 ;
		}
		return marcha;
	}
	
}
