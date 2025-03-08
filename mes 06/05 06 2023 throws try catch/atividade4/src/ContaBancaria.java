
public class ContaBancaria {

	private Double saldo;
	private Double limite;
	private Double limiteSaque;
	private Double limiteDeposito;
	
	public ContaBancaria(Double saldo, Double limite) {
		this.saldo = saldo;
		this.limite = limite;
	}
	
	public String toString() {
		return "Saldo: "+ this.getSaldo() +"; Limite: " +this.getLimite();
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	public double getLimite() {
		return this.limite;
	}
	
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	
	public boolean sacar(double valor) throws SaqueExcedeValorDaConta {
		if (valor <= this.getSaldo()) {
			this.setSaldo(this.saldo - valor);
			System.out.println("Foi sacado "+valor+" da conta.");
			return true;
		} else {
			throw new SaqueExcedeValorDaConta();
		}
	}
	
	public void depositar(double valor) throws DepositoExecedeLimiteDaConta{
		if (this.getSaldo() + valor <= this.getLimite()) {
			System.out.println("Foi depositado "+valor+" na conta.");
			this.setSaldo(this.saldo + valor);
		} else {
			throw new DepositoExecedeLimiteDaConta();
		}
	}
}
