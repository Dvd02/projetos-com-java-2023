package atv2;

public class Musica {
	private String nome;
	private String banda;
	private String album;
	private int duracao;
	
	public Musica(String nome, String banda, String album, int duracao) {
		this.nome = nome;
		this.banda = banda;
		this.album = album;
		this.duracao = duracao;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getBanda() {
		return banda;
	}
	public void setBanda(String banda) {
		this.banda = banda;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	public int getDuracao() {
		return duracao;
	}
	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}
	
	public String toString() {
		return this.getNome();
	}
	
	public String dados() {
		return this.getNome() + " - " + this.getAlbum() + " - " + this.getBanda() + " - " + this.getDuracao();
	}
}
