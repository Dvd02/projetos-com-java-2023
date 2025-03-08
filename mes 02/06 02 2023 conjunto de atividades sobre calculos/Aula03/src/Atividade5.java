import javax.swing.JOptionPane;

public class Atividade5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float salario1 = 0;
		float salario2 = 0;
		float salario3 = 0;
		float salario4 = 0;
		float salario5 = 0;
		float mediaSalarial = 0;
		String titulo = "Media dos salarios de 5 meses";
		String mensagem = "";
		
		salario1 = Float.parseFloat( JOptionPane.showInputDialog(null, "digite o valor do 1° salario", titulo, 3) );
		salario2 = Float.parseFloat( JOptionPane.showInputDialog(null, "digite o valor do 2° salario", titulo, 3) );
		salario3 = Float.parseFloat( JOptionPane.showInputDialog(null, "digite o valor do 3° salario", titulo, 3) );
		salario4 = Float.parseFloat( JOptionPane.showInputDialog(null, "digite o valor do 4° salario", titulo, 3) );
		salario5 = Float.parseFloat( JOptionPane.showInputDialog(null, "digite o valor do 5° salario", titulo, 3) );
		
		mediaSalarial = (salario1 + salario2 + salario3 + salario4 + salario5) / 5;
		mensagem = "A media dos seguintes salarios:\n"
				+ "1° salario: " +  salario1 + "\n"
				+ "2° salario: " + salario2 + "\n"
				+ "3° salario: " + salario3 + "\n"
				+ "4° salario: " + salario4 + "\n"
				+ "5° salario: " + salario5 + "\n"
				+ "é igual a  " + mediaSalarial;
		
		JOptionPane.showConfirmDialog(null, mensagem, titulo, -1);
	}

}
