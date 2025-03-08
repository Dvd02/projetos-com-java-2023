import javax.swing.JOptionPane;

public class Atividade0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float numero = 0;
		float dobro = 0;
		String titulo = "Dobro do numero";
		String mensagem = "";
		
		numero = Float.parseFloat( JOptionPane.showInputDialog(null, "Digite um numero", titulo, 3) );
		
		dobro = 2 * numero;
		mensagem = "o dobro de  " + numero + "  é  " + dobro;
		
		JOptionPane.showConfirmDialog(null, mensagem, titulo, -1);
		
	}

}
