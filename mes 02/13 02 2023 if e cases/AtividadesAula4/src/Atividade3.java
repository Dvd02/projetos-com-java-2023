import javax.swing.JOptionPane;

public class Atividade3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nome;
		int sexo;
		int estadoCivil;
		String titulo = "Dados Pessoais";
		String mensagem = "";
		
		nome = JOptionPane.showInputDialog(null, "Digite o seu nome", titulo, 3);
		sexo = Integer.parseInt( JOptionPane.showInputDialog(null, "Digite o valor conforme seu sexo:\n1 - Masculino\n2 - Feminino", titulo, 3) );
		estadoCivil = Integer.parseInt( JOptionPane.showInputDialog(null, "Digite o valor conforme seu estado civil:\n1 - Solteiro\n2 - Casado\n3 - Viuvo", titulo, 3) );
	
		mensagem = "Nome: " + nome
				+ "\nSexo (1 - Masculino, 2 - Feminino):  " + sexo
				+ "\nEstado civil (1 - Solteiro, 2 - Casado, 3 - Viuvo):  " + estadoCivil;
		
		if ((sexo == 2) && (estadoCivil == 2)) {
			int tempoDeCasada;
			tempoDeCasada = Integer.parseInt( JOptionPane.showInputDialog(null, "Digite quantos anos você esta casada", titulo, 3) );	
			mensagem += "\nTempo de casada: " + tempoDeCasada + "  anos";
		}
		
		JOptionPane.showConfirmDialog(null, mensagem, titulo, -1);
		
	}

}
