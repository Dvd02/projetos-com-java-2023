import javax.swing.JOptionPane;

public class Atividade4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double num;
		String titulo = "Par ou impar";
		String mensagem = "";
		
		num = Double.parseDouble( JOptionPane.showInputDialog(null, "Digite um numero", titulo, 3) );
		
		mensagem = "o numero ("+ num +") é ";
		if (num%2 == 0) {
			mensagem += "par";
		} else {
			mensagem += "impar";
		}
		
		JOptionPane.showConfirmDialog(null, mensagem, titulo, -1);
		
	}

}
