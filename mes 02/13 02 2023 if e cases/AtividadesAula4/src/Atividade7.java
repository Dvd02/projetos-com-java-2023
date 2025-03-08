import javax.swing.JOptionPane;

public class Atividade7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double num;
		double num2;
		String titulo = "Computação de dados";
		String operacao = ""; 
		String mensagem = "";
		
		num = Double.parseDouble( JOptionPane.showInputDialog(null, "Digite um numero", titulo, 3) );

		if (num%2 == 0) {
			num2 = num + 5;
			operacao += "5";
		} else {
			num2 = num + 8;
			operacao += "8";
		}
		mensagem = "o numero ("+ num +") mais "+ operacao +" é " + num2;
		
		JOptionPane.showConfirmDialog(null, mensagem, titulo, -1);
		
	}

}
