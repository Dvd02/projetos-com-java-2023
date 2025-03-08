
public class Cliente {
	// ====== instancia as variaveis ==========
	private String nome;
	private String cpf;
	private int numero;

	
	// ===== constructor ======================
	Cliente (String nome, String cpf, int numero) {
		this.nome = nome;
		this.cpf = cpf;
		this.numero = numero;
	}
	
	
	// ====== funções getters =================
	public String nome() {
		return this.nome;
	}
	public String cpf() {
		return this.cpf;
	}
	public int numero() {
		return this.numero;
	}
	
	public String dados() {
		return  "nome do cliente:   " + this.nome  + "\n" +
				"cpf do cliente:    " + this.cpf  + "\n" +
				"numero do cliente: " + this.numero + "\n"; 
	}
	
	
	// ====== funções setters =================
	public void alteraNome(String novoNome) {
		this.nome = novoNome;
	}
	public void alteraCpf(String novoCpf) {
		this.cpf = novoCpf;
	}
	public void alteraNumero(int novoNumero) {
		this.numero = novoNumero;
	}
}
