import javax.swing.JOptionPane;

public class Atividade8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sexo;
		float altura;
		double pesoIdeal = 0;
		String titulo = "Peso ideal"; 
		String mensagem = "";
		
		sexo = Integer.parseInt( JOptionPane.showInputDialog(null, "Digite o valor conforme seu sexo:\n1 - Masculino\n2 - Feminino", titulo, 3) );
		altura = Float.parseFloat( JOptionPane.showInputDialog(null, "Digite a sua altura em metros", titulo, 3) );
	
		if (sexo == 1) {
			pesoIdeal = (72.7 * altura) - 58;
		} else if (sexo == 2) {
			pesoIdeal = (62.1 * altura) - 44.7; 
		}
		
		mensagem = "O seu peso ideal é " + pesoIdeal + " kg's";
		
		JOptionPane.showConfirmDialog(null, mensagem, titulo, -1);
			
	}

}
