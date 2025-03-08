import java.util.ArrayList;

import javax.swing.JOptionPane;

public class ListaTelefonica {
	private ArrayList<Pessoa> lista = new ArrayList<Pessoa>();
	private int inicioLista = 0;
	
	public ArrayList<Pessoa> getLista() {
		return lista;
	}

	public int getInicioLista() {
		return inicioLista;
	}

	public void setInicioLista(int inicioLista) {
		this.inicioLista = inicioLista;
	}
	
	public String renderizaLista() {
		String mensagem = "Lista de pessoas (Total: " +(this.getLista().size())+"):\n"+
				"----------{"+this.getInicioLista()+" a "+(this.getInicioLista()+9)+"}----------";
		
		for (int i = this.getInicioLista(); i < this.getInicioLista()+10; i++) {
			if(this.getLista().size() <= i) {
				break;}
			mensagem += "\n("+i+") "+ this.getLista().get(i).getNome() +": "+ this.getLista().get(i).getTelefone();
		}
		
		return mensagem;
	}
	
	public void addPessoa() {
		String nome = JOptionPane.showInputDialog(null, this.renderizaLista()+"\n-----------------------------\nInforme o nome da nova pessoa","Adição a lista", JOptionPane.INFORMATION_MESSAGE);
		String numero = JOptionPane.showInputDialog(null, this.renderizaLista()+"\n("+this.getLista().size()+") "+nome+":\n-----------------------------\nInforme o numero do(a) "+nome,"Adição a lista", JOptionPane.INFORMATION_MESSAGE);
		this.getLista().add(new Pessoa(nome, numero));
	}
	
	public void removePessoa() {
		int id = Integer.parseInt( JOptionPane.showInputDialog(null, this.renderizaLista()+"\n-----------------------------\nInforme o ID da pessoa","Remoção por id da lista", JOptionPane.INFORMATION_MESSAGE) );
		if ((0 <= id) && (id < this.getLista().size())){
			this.getLista().remove(id);
		}
	}
	
	public void alterarPessoa() {
		int id = Integer.parseInt( JOptionPane.showInputDialog(null, this.renderizaLista()+"\n-----------------------------\nInforme o ID da pessoa","Alteração por id da lista", JOptionPane.INFORMATION_MESSAGE) );
		if ((0 <= id) && (id < this.getLista().size())){
			String nome = JOptionPane.showInputDialog(null, "Informe o novo nome da pessoa","Alteração por id da lista", JOptionPane.INFORMATION_MESSAGE);
			String numero = JOptionPane.showInputDialog(null, "Informe o novo numero da pessoa","Alteração por id da lista", JOptionPane.INFORMATION_MESSAGE);
			this.getLista().set(id,new Pessoa(nome, numero));
		}
	}
	
	public void alterarInicioLista(int valor) {
		if ((0 <= this.getInicioLista()+valor) && (this.getInicioLista()+valor < this.getLista().size())) {
			this.setInicioLista(this.getInicioLista()+valor);
		}	
	}
	
	public void main() {
		String mensagem;
		while(true) {
			mensagem = this.renderizaLista();
			mensagem += "\n-----------------------------";
			
			String[] opcoes = { "Adicionar", "Remover", "Mudar","<",">"};
			int escolha = JOptionPane.showOptionDialog(
			    null,
			    mensagem,
			    "lista telefonica",
			    JOptionPane.DEFAULT_OPTION,
			    JOptionPane.WARNING_MESSAGE,
			    null,
			    opcoes,
			    opcoes[0]);
			
			if(escolha == JOptionPane.CLOSED_OPTION){
				break;
			}
			
			switch (opcoes[escolha]) {
			case "Adicionar":
				this.addPessoa();
				break;
			case "Remover":
				this.removePessoa();
				break;
			case "Mudar":
				this.alterarPessoa();
				break;
			case "<":
				this.alterarInicioLista(-10);
				break;
			case ">":
				this.alterarInicioLista(10);
				break;
			}
			
		}
		
	}

	
	
	
	
	
	
	
	
}
