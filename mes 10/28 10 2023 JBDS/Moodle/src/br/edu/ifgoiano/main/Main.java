package br.edu.ifgoiano.main;

import br.edu.ifgoiano.dao.DeputadoDAO;
import br.edu.ifgoiano.dao.ProjetoDAO;

public class Main {

	public static void main(String[] args) {
		DeputadoDAO deputado = new DeputadoDAO();
		int estado = 1;
		System.out.println("deputados do estado "+ estado +": "+ deputado.findByEstado(estado));
		
		ProjetoDAO projeto = new ProjetoDAO();
		String nomeProjeto = "asfaltar";
		System.out.println("votos do projeto "+ nomeProjeto +": "+ projeto.findByNome(nomeProjeto));
	}

}
