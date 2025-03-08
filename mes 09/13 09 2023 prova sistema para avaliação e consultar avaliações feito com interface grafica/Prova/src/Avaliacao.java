
public class Avaliacao {
	private Resumo trabalho;
	private String avaliador1;
	private String avaliador2;
	private String respostaAvaliador1;
	private String respostaAvaliador2;

	public Avaliacao(Resumo trabalho, String avaliador1, String avaliador2, String respostaAvaliador1,String respostaAvaliador2) {
		this.trabalho = trabalho;
		this.avaliador1 = avaliador1;
		this.avaliador2 = avaliador2;
		this.respostaAvaliador1 = respostaAvaliador1;
		this.respostaAvaliador2 = respostaAvaliador2;
	}
	
	public Resumo getTrabalho() {
		return trabalho;
	}
	public void setTrabalho(Resumo trabalho) {
		this.trabalho = trabalho;
	}
	public String getAvaliador1() {
		return avaliador1;
	}
	public void setAvaliador1(String avaliador1) {
		this.avaliador1 = avaliador1;
	}
	public String getAvaliador2() {
		return avaliador2;
	}
	public void setAvaliador2(String avaliador2) {
		this.avaliador2 = avaliador2;
	}
	public String getRespostaAvaliador1() {
		return respostaAvaliador1;
	}
	public void setRespostaAvaliador1(String respostaAvaliador1) {
		this.respostaAvaliador1 = respostaAvaliador1;
	}
	public String getRespostaAvaliador2() {
		return respostaAvaliador2;
	}
	public void setRespostaAvaliador2(String respostaAvaliador2) {
		this.respostaAvaliador2 = respostaAvaliador2;
	}
	
	public String toString() {
		return  "----------{ Resumo }----------"
			+"\n" + this.getTrabalho() 
			+"\n---------{ Avaliação }---------"
			+"\nAvaliador 1: " + this.getAvaliador1()
			+"\nResposta do Avaliador 1: " + this.getRespostaAvaliador1()
			+"\nAvaliador 2: " + this.getAvaliador2()
			+"\nResposta do Avaliador 2: " + this.getRespostaAvaliador2()
			+"\n--------------------------------\n\n";
	}
}
