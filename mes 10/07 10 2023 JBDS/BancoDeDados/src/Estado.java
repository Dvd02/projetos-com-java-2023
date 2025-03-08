

import javax.swing.JOptionPane;

public class Estado {
	private String nome;
	private String regiao;
	
	static public Estado criaEstadoInput() {
		String titulo = "cadastre um de estado";
		String nome = JOptionPane.showInputDialog(null, "informe o nome do estado: ", titulo, -1);
		String regiao = JOptionPane.showInputDialog(null, "informe o região do estado: ", titulo, -1);
		return new Estado(nome, regiao);
	}
	
	public Estado(String nome, String regiao) {
		this.nome = nome;
		this.regiao = regiao;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRegiao() {
		return regiao;
	}
	public void setRegiao(String regiao) {
		this.regiao = regiao;
	}
	
}
