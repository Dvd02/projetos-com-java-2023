import javax.swing.JOptionPane;

public class bonus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int quantidadeValores = 0;
		float media = 0;
		String titulo = "valor superior a media de valores";
		String mensagem = "";
		
		quantidadeValores = Integer.parseInt( JOptionPane.showInputDialog(null, "digite a quantidade de valore que dejesa informa", "media de valores", 3) );
		float valor[] = new float [quantidadeValores];
				
				
		for (int c = 0; c < quantidadeValores; c++) {
			valor[c] = Float.parseFloat( JOptionPane.showInputDialog(null, "digite o valor do "+ (c+1) +"°", titulo, 3) );
			media += valor[c];
		}
		media /=  quantidadeValores;
		
		mensagem += "media dos valores: " + media + "\n\nOs valores maiores que a media são:\n";

		for (int c = 0; c < quantidadeValores; c++) {
			if (valor[c] > media) {
				mensagem += valor[c] + "\n";
			}
		}
		
		JOptionPane.showConfirmDialog(null, mensagem, titulo, -1);
	}

}
