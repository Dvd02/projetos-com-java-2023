package atv1;

import java.util.HashMap;

import javax.swing.JOptionPane;

public class Estacionamento {
	private HashMap<String, Carro> estacionados = new HashMap<String, Carro>();
	
	public Estacionamento() {
		for (int i = 1; i <= 10; i++) {
			estacionados.put( String.valueOf(i) , null);
		}
	}
	
	public void adicionarCarroInput() {
	}
	
	public void adicionarCarro(String posiscao, Carro carro) {
		if (estacionados.get(posiscao) == null) {
			estacionados.replace(posiscao, carro);}
	}
	
	public void removeCarro(String posiscao) {
		if (!(estacionados.get(posiscao) == null)) {
			estacionados.replace(posiscao, null);}
	}
	

	public void main() {
		while(true) {
			String mensagem = "Carros estacionados: " + estacionados.entrySet().toString();
			String titulo = "Principal";
			String[] opcoes = { "Estacionar", "Retirar Carro", "Ver dados de um carro", "Sair"};
			int escolha = JOptionPane.showOptionDialog(null, mensagem, titulo, JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opcoes, opcoes[0]);
	
			if(escolha == 0) {
				String posicao = JOptionPane.showInputDialog(null, "informa o numero de uma vaga", "estacionando um carro", -1);
				if (estacionados.get(posicao) == null) {
					Carro carro = Carro.criaCarroInput();
					estacionados.replace(posicao, carro);
				}
				
			} else if (escolha == 1) {
				String posicao = JOptionPane.showInputDialog(null, "informa o numero de uma vaga", "removendo um carro", -1);
				if (!(estacionados.get(posicao) == null)) {
					estacionados.replace(posicao, null);}
				
			} else if (escolha == 2) {
				String posicao = JOptionPane.showInputDialog(null, "informa o numero de uma vaga", "vendo um carro", -1);
				JOptionPane.showMessageDialog(null, estacionados.get(posicao).dados(), "vendo um carro", -1);
				
			} else {
				break;
			}
		}
	}
	
}
