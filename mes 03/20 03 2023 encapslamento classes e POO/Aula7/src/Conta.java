
class Conta {
	// ====== instancia as variaveis ==========
	private double saldo;
	private double limite;
	private Cliente titular;
	

	// ===== constructor ======================
	Conta (Cliente titular){
		this.titular = titular;
		this.saldo = 0;
		this.limite = 1000;
	}
	
	
	// ====== fun��es getters =================
	public Cliente titular(){
		return this.titular;
	}
	
	public double saldo() {
		return this.saldo;
	}
	
	public double limite() {
		return this.limite;
	}
	
	public String dados() {
		return  "DADOS DA CONTA\n" + 
				"saldo: " + this.saldo + "\n" +
				"limite: " + this.limite  + "\n" +
				this.titular.dados();
	}
	
	
	// ====== fun��es setters =================
	public void alteraCliente(Cliente novoTitular) {
		this.titular = novoTitular;
	}
	
	public void alteraSaldo(double novoSaldo) {
		this.saldo = novoSaldo;
	}
	
	public void alteraLimite(double novoLimite) {
		this.limite = novoLimite;
	}
}
