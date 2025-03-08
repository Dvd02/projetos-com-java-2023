

import java.sql.Date;

import javax.swing.JOptionPane;

public class Deputado {
	private String nome;
	private Date dataIngressao;
	private String partido;
	private int idEstado;
	
	static public Deputado criaDeputadoInput() {
		String titulo = "cadastre um de deputado";
		String nome = JOptionPane.showInputDialog(null, "informe o nome do deputado: ", titulo, -1);
		int ano = Integer.parseInt( JOptionPane.showInputDialog(null, "informe o ano da data de ingressão do deputado: ", titulo, -1) );
		int mes = Integer.parseInt( JOptionPane.showInputDialog(null, "informe o (numero do) mes da data de ingressão do deputado: ", titulo, -1) );
		int dia = Integer.parseInt( JOptionPane.showInputDialog(null, "informe o (numero do) dia da data de ingressão do deputado: ", titulo, -1) );
		String partido = JOptionPane.showInputDialog(null, "informe o partido do deputado: ", titulo, -1);
		int idEstado = Integer.parseInt( JOptionPane.showInputDialog(null, "informe o id do estado do deputado: ", titulo, -1) );
		
		Date dataIngressao = new Date(ano-1900, mes-1, dia); 
		return new Deputado(nome, dataIngressao, partido, idEstado);
	}
	
	public Deputado(String nome, Date dataIngressao, String partido, int idEstado) {
		this.nome = nome;
		this.dataIngressao = dataIngressao;
		this.partido = partido;
		this.idEstado = idEstado;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getDataIngressao() {
		return dataIngressao;
	}
	public void setDataIngressao(Date dataIngressao) {
		this.dataIngressao = dataIngressao;
	}
	public String getPartido() {
		return partido;
	}
	public void setPartido(String partido) {
		this.partido = partido;
	}
	public int getIdEstado() {
		return idEstado;
	}
	public void setIdEstado(int idEstado) {
		this.idEstado = idEstado;
	}
}
