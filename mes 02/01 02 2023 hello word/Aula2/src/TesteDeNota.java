import javax.swing.JOptionPane;

public class TesteDeNota {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float nota = 0;
		String mensagem = "";
		
		nota = Float.parseFloat( JOptionPane.showInputDialog(null, "Digite a nota do aluno", "Teste de nota", 3) );
		
		if (nota > 6) {
			mensagem = "Aluno aprovado";
		} else if (nota < 2) {
			mensagem = "Aluno reprovado";
		} else {
			mensagem = "Aluno de recuperacao";
		}
		
		JOptionPane.showConfirmDialog(null, mensagem, "Teste de nota", -1);
	}

}
