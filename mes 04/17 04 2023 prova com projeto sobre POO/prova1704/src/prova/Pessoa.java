package prova;

public class Pessoa {
	private String nome;
	private String dataNascimento;
	
	public Pessoa(String nome, String dataNascimento) {
		this.setNome(nome);
		this.setDataNascimento(dataNascimento);
	}

	public String toString2() {
		String dados =    "Nome: " + this.getNome() +
						"\nData de Nascimento: " + this.getDataNascimento();
		return dados;
	}
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
}
