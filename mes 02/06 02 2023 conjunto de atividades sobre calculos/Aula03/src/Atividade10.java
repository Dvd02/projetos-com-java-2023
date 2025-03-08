import javax.swing.JOptionPane;

public class Atividade10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double precoNormal;
		double precoComAcresimo = 0;
		int formaDePagamento;
		String titulo = "Valor de pagamento"; 
		String mensagem = "";
		
		precoNormal = Float.parseFloat( JOptionPane.showInputDialog(null, "Digite o valor do produto", titulo, 3) );
		formaDePagamento = Integer.parseInt( JOptionPane.showInputDialog(null, "Digite a forma de pagamento\n" +
																				"1 - A vista no dinheiro\n" +
																				"2 - a vista no cartão\n" +
																				"3- em duas vezes\n" + 
																				"4 - em quatro vezes", titulo, 3) );
		
		if (formaDePagamento == 1) {
			precoComAcresimo = precoNormal - precoNormal * 0.10;
		} else if (formaDePagamento == 2) {
			precoComAcresimo = precoNormal - precoNormal * 0.15;
		} else if (formaDePagamento == 3) {
			precoComAcresimo = precoNormal;
		} else if (formaDePagamento == 4) {
			precoComAcresimo = precoNormal + precoNormal * 0.10;
		}
		
		mensagem = "o valor final da compra é " + precoComAcresimo;
		JOptionPane.showConfirmDialog(null, mensagem, titulo, -1);
		
	}

}
