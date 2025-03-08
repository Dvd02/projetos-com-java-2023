import javax.swing.JOptionPane;

public class Atividade9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float altura;
		float peso;
		double imc = 0;
		String titulo = "IMC"; 
		String mensagem = "";
		
		altura = Float.parseFloat( JOptionPane.showInputDialog(null, "Digite a sua altura em metros", titulo, 3) );
		peso = Float.parseFloat( JOptionPane.showInputDialog(null, "Digite a seu peso em kg's", titulo, 3) );
		
		imc = peso / (altura*2);
		
		mensagem = "Você esta ";
		if (imc < 18.5) {
			mensagem += "com baixo peso";
		} else if ((18.5 <= imc) && (imc < 25)) {
			mensagem += "com o peso ideal";
		} else if ((25 <= imc) && (imc < 30)) {
			mensagem += "com sobrepeso";
		} else {
			mensagem += "obeso";
		}
		
		JOptionPane.showConfirmDialog(null, mensagem, titulo, -1);
			
		
	}

}
