package atv2;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class ListaClientes {
	private ArrayList<Cliente> lista = new ArrayList<Cliente>();

	public ArrayList<Cliente> getLista(){
		return this.lista;
	}
	
	public void adicionarCliente() {
		while(true) {
			int id = Integer.parseInt( JOptionPane.showInputDialog(null, "Digite o id do cliente","Adicionar cliente", JOptionPane.QUESTION_MESSAGE) );
			
			if(id < 0) {
				break;}
			
			String nome = JOptionPane.showInputDialog(null, "Digite o nome do cliente ("+id+")","Adicionar cliente", JOptionPane.QUESTION_MESSAGE) ;
			int idade = Integer.parseInt( JOptionPane.showInputDialog(null, "Digite o a idade do(a) "+nome+" ("+id+")","Adicionar cliente", JOptionPane.QUESTION_MESSAGE) );
			String telefone = JOptionPane.showInputDialog(null, "Digite o tefefone do(a) "+nome+" ("+id+")","Adicionar cliente", JOptionPane.QUESTION_MESSAGE);
			
			this.getLista().add(new Cliente(id, nome, idade, telefone));
		}
	}
	
	public String clientes(){
		String mensagem = "---------------------------";
		for (int i = 0; i < this.getLista().size(); i++) {
			Cliente clienteAtual = this.getLista().get(i);
			mensagem +=  "\nID: " + clienteAtual.getId()
						+"\nNome: " + clienteAtual.getNome()
						+"\nIdade: " + clienteAtual.getIdade()
						+"\nTelefone: " + clienteAtual.getTelefone()
						+"\n---------------------------";
		}
		return mensagem;
	}
	
	public void main() {
		this.adicionarCliente();
		JOptionPane.showMessageDialog(null, this.clientes(),"Lista de clientes", JOptionPane.INFORMATION_MESSAGE);
	}
	
}
