
public class Pessoa {
	private String nome;
	private int idade;
	private String estadoCivil;

	public Pessoa() {
	}

	public Pessoa(String nome, int idade, String estadoCivil) {
		this.nome = nome;
		this.idade = idade;
		this.estadoCivil = estadoCivil;
	}
	
	public String toString() {
		return  "Nome: "+ this.getNome() +"; "+
				"Idade: "+ this.getIdade() + " anos; "+
				"Estado Civiu: "+ this.getEstadoCivil() + ".";
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
}
