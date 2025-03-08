package atv1;

import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.JOptionPane;

public class EstadosCidades {
	private final HashMap<String, ArrayList<String>> ESTADOS = new HashMap<String, ArrayList<String>>();

	public HashMap<String, ArrayList<String>> getEstados() {
		return ESTADOS;
	}
	
	public String adicionaEstadoInput() {
		String estado = JOptionPane.showInputDialog(null, this.getEstados().keySet() +"\n\".\" PARA SAIR", "Estados", 3);
		return this.adicionaEstado(estado);
	}
	
	public String adicionaEstado(String estado){
		if ((!estado.equals(".")) && (!this.getEstados().containsKey(estado))) {
			this.getEstados().put(estado, new ArrayList<String>());}
		
		return estado;
	}
	
	public boolean adicionaCidadeInput(String estado) {
		String cidade = JOptionPane.showInputDialog(null, this.getEstados().get(estado)  +"\n\".\" PARA SAIR", "Cidades de "+ estado, 3);
		return adicionaCidade(estado, cidade);
	}
	
	public boolean adicionaCidade(String estado, String cidade) {
		if ((cidade.equals(".")) || (!this.getEstados().keySet().contains(estado))) {
			return false;}
		
		this.getEstados().get(estado).add(cidade);	
		return true;
	}

	
	public void testeInput() {
		while (true) {
			String estadoAdicionado = this.adicionaEstadoInput();
			if (estadoAdicionado.equals(".")) {
				break;}
			
			while (true) {
				boolean cidadeAdicionada = this.adicionaCidadeInput(estadoAdicionado);
				if (!cidadeAdicionada) {
					break;}
			}
		}
				
		JOptionPane.showConfirmDialog(null, this, "Estados e Cidades", 0, 1);
	}
	
	public void teste() {
		this.adicionaEstado("1");
		this.adicionaCidade("1", "2");
		this.adicionaCidade("1", "3");
		this.adicionaCidade("1", "4");

		this.adicionaEstado("a");
		this.adicionaCidade("a", "b");
		this.adicionaCidade("a", "c");
		this.adicionaCidade("a", "d");
		
		JOptionPane.showConfirmDialog(null, this, "Estados e Cidades", 0, 1);
	}
	
	public String toString() {
		return this.getEstados().entrySet().toString().replaceAll("], ", "]]\n[").replaceAll("=", ": ").replaceAll("]]]", "]]");
	}

}
