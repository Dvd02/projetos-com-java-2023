import javax.swing.JOptionPane;

public class Atividade3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float altura = 0;
		float peso = 0;
		double imc = 0;
		String titulo = "Índice de Massa Corpórea";
		String mensagem = "";
		
		peso = Float.parseFloat( JOptionPane.showInputDialog(null, "Digite o peso do individuol em kg", titulo, 3) );
		altura = Float.parseFloat( JOptionPane.showInputDialog(null, "Digite a altura do individoul em m", titulo, 3) );
		
		imc = peso / (altura * altura);
		mensagem = "Uma Pessoa com " + peso + "  kg's e a altura de  "+ altura + "  m"
			   + "\nPossui um imc de  " + imc;
		
		JOptionPane.showConfirmDialog(null, mensagem, titulo, -1);

		
	}

}
