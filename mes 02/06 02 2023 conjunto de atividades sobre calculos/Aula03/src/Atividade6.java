import javax.swing.JOptionPane;

public class Atividade6 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float salario[] = new float[5];
		float mediaSalarial = 0;
		String titulo = "Media dos salarios de 5 meses";
		String mensagem = "A media dos seguintes salarios:\n";
		
		for (int c = 0; c < salario.length; c++) {
			salario[c] = Float.parseFloat( JOptionPane.showInputDialog(null, "digite o valor do "+ (c+1) +"° salario", titulo, 3) );
			mediaSalarial += salario[c];
			
			mensagem += (c+1)+"° salario: " +  salario[c] + "\n";
		}
		mediaSalarial /=  5;
		mensagem += "é igual a  " + mediaSalarial;
		
		JOptionPane.showConfirmDialog(null, mensagem, titulo, -1);
	}

}
