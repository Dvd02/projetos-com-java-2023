package classes;

public class Conta {
	private double saldo;

	public Conta(double saldo) {
		this.saldo = saldo;
	}
	
	public double obterSaldo() {
		return saldo;
	}
	
	public void depositar(double valor) {
		if (0 < valor) {
			this.saldo += valor;
		}
	}
	
	public void sacar(double valor) {
		if ((0 < valor) && (valor <= this.obterSaldo())) {
			this.saldo -= valor;
		}
	}
}
