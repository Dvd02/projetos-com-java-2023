import javax.swing.JOptionPane;

public class Atividade7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int matriz[][] = new int[10][10];
		String titulo = "diagonal principal preenchida";
		String mensagem = "";
		
		
		for (int linha = 0; linha < matriz.length; linha++) {
			for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
				if (linha == coluna) {
					matriz [linha][coluna] = 1;
				}
				
				mensagem += matriz[linha][coluna] + " ";
			}
			mensagem += "\n";
		}
		
		
		JOptionPane.showConfirmDialog(null, mensagem, titulo, -1);
		
	}
}
