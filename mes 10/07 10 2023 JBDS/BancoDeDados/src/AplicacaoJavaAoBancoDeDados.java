import javax.swing.JOptionPane;

public class AplicacaoJavaAoBancoDeDados {

	public void menuEstado() {
		EstadoDAO estadoDAO = new EstadoDAO();
		Estado estado;
		int idEstado;
		
		String titulo = "Manipulando dados dos Estados";
		String mensagem = "O que gostaria de mexer: ";
		String[] opcoes = { "Registar Estado", "Excluir Estado", "Alterar Estado","Sair"};
		int escolha = JOptionPane.showOptionDialog(null, mensagem, titulo, JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opcoes, opcoes[0]);
	
		switch (escolha) {
		case 0:
			//JOptionPane.showMessageDialog(null, "registar...", titulo, -1);
			estado = Estado.criaEstadoInput();
			estadoDAO.insert(estado);
			//JOptionPane.showMessageDialog(null, "estado adicionado.", titulo, -1);
			break;
			
		case 1:
			//JOptionPane.showMessageDialog(null, "excluir...", titulo, -1);
			idEstado =  Integer.parseInt( JOptionPane.showInputDialog(null, "informe o id do estado a ser removido: ", titulo, -1) );
			estadoDAO.remove(idEstado);
			//JOptionPane.showMessageDialog(null, "estado removido.", titulo, -1);
			break;
			
		case 2:
			//JOptionPane.showMessageDialog(null, "alterar...", titulo, -1);
			idEstado =  Integer.parseInt( JOptionPane.showInputDialog(null, "informe o id do estado a ser alterado: ", titulo, -1) );
			estado = Estado.criaEstadoInput();
			estadoDAO.update(idEstado, estado);
			//JOptionPane.showMessageDialog(null, "estado alterado.", titulo, -1);
			break;
			
		default:
			//JOptionPane.showMessageDialog(null, "fechando...", titulo, -1);
			break;
		}
	}
	
	

	public void menuDeputado() {
		DeputadoDAO deputadoDAO = new DeputadoDAO();
		Deputado deputado;
		int idDeputado;
		
		String titulo = "Manipulando dados dos Deputados";
		String mensagem = "O que gostaria de mexer: ";
		String[] opcoes = { "Registar Deputados", "Excluir Deputados", "Alterar Deputados","Sair"};
		int escolha = JOptionPane.showOptionDialog(null, mensagem, titulo, JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opcoes, opcoes[0]);
	
		switch (escolha) {
		case 0:
			//JOptionPane.showMessageDialog(null, "registar...", titulo, -1);
			deputado = Deputado.criaDeputadoInput();
			deputadoDAO.insert(deputado);
			//JOptionPane.showMessageDialog(null, "deputado adicionado.", titulo, -1);
			break;
			
		case 1:
			//JOptionPane.showMessageDialog(null, "excluir...", titulo, -1);
			idDeputado =  Integer.parseInt( JOptionPane.showInputDialog(null, "informe o id do deputado a ser removido: ", titulo, -1) );
			deputadoDAO.remove(idDeputado);
			//JOptionPane.showMessageDialog(null, "deputado removido.", titulo, -1);
			break;
			
		case 2:
			//JOptionPane.showMessageDialog(null, "alterar...", titulo, -1);
			idDeputado =  Integer.parseInt( JOptionPane.showInputDialog(null, "informe o id do deputado a ser alterado: ", titulo, -1) );
			deputado = Deputado.criaDeputadoInput();
			deputadoDAO.update(idDeputado, deputado);
			//JOptionPane.showMessageDialog(null, "deputado alterado.", titulo, -1);
			break;
			
		default:
			//JOptionPane.showMessageDialog(null, "fechando...", titulo, -1);
			break;
		}
	}
	
	
	public void menu() {
		while (true) {
			String titulo = "Banco de dados ao java";
			String mensagem = "O que gostaria de mexer: ";
			String[] opcoes = { "Estado", "Deputado", "Sair"};
			int escolha = JOptionPane.showOptionDialog(null, mensagem, titulo, JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opcoes, opcoes[0]);
			
			switch (escolha) {
			case 0:
				this.menuEstado();
				break;
			case 1:
				this.menuDeputado();
				break;
			default:
				//JOptionPane.showMessageDialog(null, "fechado...", titulo, -1);
				return;
			}
		}
	}

}
