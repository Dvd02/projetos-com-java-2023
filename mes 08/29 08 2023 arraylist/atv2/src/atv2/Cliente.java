package atv2;

public class Cliente {
	private int id; 
	private int idade;
	private String nome;
	private String telefone;
	 
	public Cliente(int id, String nome, int idade,  String telefone) {
		this.setId(id);
		this.setIdade(idade);
		this.setNome(nome);
		this.setTelefone(telefone);
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	 
}
