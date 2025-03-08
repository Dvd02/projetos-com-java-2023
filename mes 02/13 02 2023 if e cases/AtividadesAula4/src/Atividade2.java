import javax.swing.JOptionPane;

public class Atividade2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num1;
		double num2;
		double num3;
		String titulo = "Teste de valores";
		String mensagem = "";
		
		num1 = Float.parseFloat( JOptionPane.showInputDialog(null, "Digite o 1° valor", titulo, 3) );
		num2 = Float.parseFloat( JOptionPane.showInputDialog(null, "Digite o 2° valor", titulo, 3) );
		num3 = Float.parseFloat( JOptionPane.showInputDialog(null, "Digite o 3° valor", titulo, 3) );
		
		mensagem ="A soma do 1° valor ("+ num1 +") e do 2° valor ("+ num2 +") ";
		if (num1 + num2 > num3) {
			mensagem += "não ";
		}
		mensagem += "é menor que o 3° valor ("+ num3 +")";
		
		JOptionPane.showConfirmDialog(null, mensagem, titulo, -1);
	
	}

}
