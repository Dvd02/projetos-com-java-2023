import javax.swing.JOptionPane;

public class Atividade5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double num1;
		double num2;
		double num3;
		String titulo = "Computação de dados";
		String operacao = "";
		String mensagem = "";
		
		num1 = Double.parseDouble( JOptionPane.showInputDialog(null, "Digite o 1° numero", titulo, 3) );
		num2 = Double.parseDouble( JOptionPane.showInputDialog(null, "Digite o 2° numero", titulo, 3) );
		
		if (num1 == num2) {
			num3 = num1 + num2;
			operacao = "mais";
		} else {
			num3 = num1 * num2;
			operacao = "vezes";
		}	
		mensagem = "o 1° numero ("+ num1 +") "+ operacao +" o 2° numero ("+ num2 +") é " + num3;	

		JOptionPane.showConfirmDialog(null, mensagem, titulo, -1);
	}

}
