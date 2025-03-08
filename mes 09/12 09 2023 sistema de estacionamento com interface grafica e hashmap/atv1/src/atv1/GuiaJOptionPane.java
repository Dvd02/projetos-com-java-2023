
package atv1;

import javax.swing.JOptionPane;

public class GuiaJOptionPane {

	public static void jOptionPaneMensagem() {
		String mensagem = "texto";
		String titulo = "mensagem";
		JOptionPane.showMessageDialog(null, mensagem, titulo, JOptionPane.PLAIN_MESSAGE);;
	}
	
	public static void jOptionPaneInputTexto() {
		String mensagem = "digite algo";
		String titulo = "input texto";
		String resposta = JOptionPane.showInputDialog(null, mensagem, titulo, JOptionPane.PLAIN_MESSAGE);
		
		String mensagem2 = "retorna uma String do q foi digitado: |"+resposta+"|\n(null se for fechado/cancelado)";
		JOptionPane.showMessageDialog(null, mensagem2, titulo, JOptionPane.PLAIN_MESSAGE);;
	}
	
	public static void jOptionPaneInputSelecione() {
		String mensagem = "escolha algo";
		String titulo = "input selecione";
		String[] opcoes = { "Opcao 1", "Opcao 2", "Opcao 3"};
		Object resposta = JOptionPane.showInputDialog(null, mensagem, titulo, JOptionPane.PLAIN_MESSAGE, null, opcoes, opcoes[0]);
		
		String mensagem2 = "retorna um Objeto do q foi selecionado: |"+resposta+"|\n(null se for fechado/cancelado)";
		JOptionPane.showMessageDialog(null, mensagem2, titulo, JOptionPane.PLAIN_MESSAGE);;
	}
	
	public static void jOptionPaneBotoes(){
		String mensagem = "escolha algo";
		String titulo = "botoes";
		String[] opcoes = { "Opcao 1", "Opcao 2", "Opcao 3"};
		int escolha = JOptionPane.showOptionDialog(null, mensagem, titulo, JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opcoes, opcoes[0]);
		
		String mensagem2 = "retorna um int do index da escolha: |"+escolha+"|\n(-1 se for fechado/cancelado)";
		JOptionPane.showMessageDialog(null, mensagem2, titulo, JOptionPane.PLAIN_MESSAGE);;
	}
	
	public static void jOptionPaneTiposDeIcon() {
		String titulo = "tipos de icon";
		JOptionPane.showMessageDialog(null, "vazia (-1 ou JOptionPane.PLAIN_MESSAGE)",               titulo, JOptionPane.PLAIN_MESSAGE, null);;
		JOptionPane.showMessageDialog(null, "erro [X] (0 ou JOptionPane.ERROR_MESSAGE)",             titulo, JOptionPane.ERROR_MESSAGE, null);;
		JOptionPane.showMessageDialog(null, "informacao [i] (1 ou JOptionPane.INFORMATION_MESSAGE)", titulo, JOptionPane.INFORMATION_MESSAGE, null);;
		JOptionPane.showMessageDialog(null, "aviso [!] (2 ou JOptionPane.PLAIN_MESSAGE)",            titulo, JOptionPane.WARNING_MESSAGE, null);;
		JOptionPane.showMessageDialog(null, "questao [?] (3 ou JOptionPane.QUESTION_MESSAGE)",       titulo, JOptionPane.QUESTION_MESSAGE, null);;
	}
	
	GuiaJOptionPane(){
		GuiaJOptionPane.jOptionPaneMensagem();
		GuiaJOptionPane.jOptionPaneBotoes();
		GuiaJOptionPane.jOptionPaneInputSelecione();
		GuiaJOptionPane.jOptionPaneInputTexto();
		GuiaJOptionPane.jOptionPaneTiposDeIcon();
	}
	
	public static void main(String[] args) {
		new GuiaJOptionPane();
	}
	
}
