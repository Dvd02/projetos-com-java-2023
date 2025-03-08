
import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		// inicia as variaveis
		int QuantidadeDePessoasIntrevistadas = 5;
		Pessoa pessoas[] = new Pessoa[QuantidadeDePessoasIntrevistadas];
		String nome = "";
		int idade = 0;
		String estadoCivil = "";

		// loop da entrevista
		for (int i = 0; i < pessoas.length; i++) {
			try {
				// coleta os dados
				nome = JOptionPane.showInputDialog("Informe o nome do "+(i+1)+"º entrevistado");
				idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade do "+(i+1)+"º entrevistado"));
				estadoCivil = JOptionPane.showInputDialog("Informe o estado civil do "+(i+1)+"º entrevistado [S, C, V, D, O]").toUpperCase();
				
				// valida os dados
				Valida.idade(idade);
				Valida.ec(estadoCivil);
				
				// se nn der erro até agora ele adiciona a pessoa a lista
				pessoas[i] = new Pessoa(nome, idade, estadoCivil);
			} catch (Exception e) {
				// mostra o erro
				e.printStackTrace();
			}
		}
		
		
		// loop para mostrar quem foi entrevistado
		String mensagem = "";
		for (int i = 0; i < pessoas.length; i++) {
			try { 
				mensagem += pessoas[i].toString() +"\n";
			} catch (Exception e) { 
				mensagem += "sem registro de pessoa\n"; 
			}
		}
		System.out.println(mensagem);
	}
}























