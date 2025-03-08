import javax.swing.JOptionPane;

public class Atividade6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num;
		double num2;
		String titulo = "Multiplicação de numeros";
		String operacao = "";
		String mensagem = "";
		
		num = Double.parseDouble( JOptionPane.showInputDialog(null, "Digite um numero", titulo, 3) );

		if (num >= 0) {
			num2 = num * 2;
			operacao = "dobro";
		} else {
			num2 = num * 3;
			operacao = "triplo";
		}	
		mensagem = "o "+ operacao +" do numero ("+ num +") é "+ num2;
		
		JOptionPane.showConfirmDialog(null, mensagem, titulo, -1);
	}

}
