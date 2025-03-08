import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.JOptionPane;

public class AvaliandoResumos {
	private HashMap<Integer, ArrayList<Avaliacao>> categorias = new HashMap<Integer, ArrayList<Avaliacao>>();
	
	// criando as categorias
	AvaliandoResumos() {
		categorias.put(0, new ArrayList<Avaliacao>());
		categorias.put(1, new ArrayList<Avaliacao>());
		categorias.put(2, new ArrayList<Avaliacao>());
		categorias.put(3, new ArrayList<Avaliacao>());
		categorias.put(4, new ArrayList<Avaliacao>());
	}
	
	
	
	// input para os resumos
	public Resumo criandoResumoInput(String nomeDoResumo) {
		String titulo = JOptionPane.showInputDialog(null, "Informe o titulo do "+nomeDoResumo+" resumo", "Criando Reusmo", -1);
		String descricao = JOptionPane.showInputDialog(null, "Informe a descrição do "+nomeDoResumo+" resumo", "Criando Reusmo", -1);;
		String orientador = JOptionPane.showInputDialog(null, "Informe o orientador do "+nomeDoResumo+" resumo", "Criando Reusmo", -1);;

		ArrayList<String> autores = new ArrayList<String>();
		while(true) {
			String autor = JOptionPane.showInputDialog(null, "Informe os autores do Resumo\n\".\" para sair", "Criando Reusmo", -1); 
			if (autor.equals(".") || autor == null) {
				break;}
			autores.add(autor);
		}

		return new Resumo(titulo, descricao, orientador, autores);
	}
	
	
	
	// input para avaliacoes
	public Avaliacao avaliandoResumoInput(Resumo resumo, String nomeDoResumo) {
		String avaliador1 = JOptionPane.showInputDialog(null, "Informe o avaliador 1 do "+nomeDoResumo+" resumo", "Criando Avaliacao", -1);
		String avaliador2 = JOptionPane.showInputDialog(null, "Informe o avaliador 2 do "+nomeDoResumo+" resumo", "Criando Avaliacao", -1);
		
		String[] opcoes = { "ACEITO", "REVISAO", "REJEITADO"};
		String respostaAvaliador1 = JOptionPane.showInputDialog(null, "Informe a resposta do avaliador 1 sobre o "+nomeDoResumo+" resumo ", "Criando Avaliacao", -1, null, opcoes, opcoes[0]).toString();
		String respostaAvaliador2 = JOptionPane.showInputDialog(null, "Informe a resposta do avaliador 2 sobre o "+nomeDoResumo+" resumo ", "Criando Avaliacao", -1, null, opcoes, opcoes[0]).toString();
		
		return new Avaliacao(resumo, avaliador1, avaliador2, respostaAvaliador1, respostaAvaliador2);
	}
	
	
	// categorizando avaliacoes
	public void categorizandoAvaliacoesInput(Avaliacao avaliacao, String nomeDoResumoAvaliacao) {
		String[] opcoes2 = { "Linguagens e Suas Tecnologias", "Ciências Exatadas e da Terra", "Ciências biologicas", "Ciências Humanas", "Educação"};
		int categoria = JOptionPane.showOptionDialog(null, "Informe a categoria do "+nomeDoResumoAvaliacao+" Resumo/Avaliacao", "Criando Avaliacao", -1, -1, null, opcoes2, opcoes2[0]);

		this.categorias.get(categoria).add(avaliacao);
	}
	

	
	// inicio da prova, adicionando quantos resumos e avaliacoes quiser
	public void adicionandoResumosEAvaliacoesInput() {
		int quantidadeDeResumos = Integer.parseInt( JOptionPane.showInputDialog(null, "Digite quantos resumos gostaria de revisar", "Quantidade de Resumo", -1) );
		
		for(int i = 1; i <= quantidadeDeResumos; i++) {
			Resumo resumo = this.criandoResumoInput(i+"º");
			Avaliacao avaliacao = this.avaliandoResumoInput(resumo, i+"º");
			this.categorizandoAvaliacoesInput(avaliacao, i+"º");
		}
	}
	
	
	
	// primeiro ponto
	public String projetosAvaliadosPorUmAvaliadorEspecifico(String avaliador){
		String projetosAvalidosPeloAvaliador = "";
		for (int i = 0; i < categorias.size(); i++) {
			ArrayList<Avaliacao> avaliacoes = categorias.get(i);
			for (int j = 0; j < avaliacoes.size(); j++) {
				if (avaliacoes.get(j).getAvaliador1().equals(avaliador) || avaliacoes.get(j).getAvaliador2().equals(avaliador)) {
					projetosAvalidosPeloAvaliador += avaliacoes.get(j).toString();
				}
			}
		}
		return projetosAvalidosPeloAvaliador;
	}
	public void exibirProjetosAvaliadosPorUmAvaliadorEspecificoInput() {
		String avaliador = JOptionPane.showInputDialog(null, "escolha o avaliador que quer ver os projetos avaliados", "escolhendo avaliador", -1);
		String mensagem = this.projetosAvaliadosPorUmAvaliadorEspecifico(avaliador);
		JOptionPane.showMessageDialog(null, mensagem, "Projetos avaliados pelo "+ avaliador, -1);	
	}
	
	
	
	// segundo ponto
	public String projetosDuplamenteAceitos() {
		String projetosDuplamenteAceitos = "";
		for (int i = 0; i < categorias.size(); i++) {
			ArrayList<Avaliacao> avaliacoes = categorias.get(i);
			for (int j = 0; j < avaliacoes.size(); j++) {
				if (avaliacoes.get(j).getRespostaAvaliador1().equals("ACEITO") && avaliacoes.get(j).getRespostaAvaliador2().equals("ACEITO") ) {
					projetosDuplamenteAceitos += avaliacoes.get(j).toString();
				}
			}
		}
		return projetosDuplamenteAceitos;
	}
	public void exibirProjetosDuplamenteAceitos() {
		JOptionPane.showMessageDialog(null, this.projetosDuplamenteAceitos(), "projetos Duplamente Aceitos", -1);
	}
	
	
	
	// terceiro ponto
	public String todosOsDadosDosResumoEAvaliacoesDeUmaCategoriaEspecifica(int categoria){
		ArrayList<Avaliacao> categoriaEscolhida = categorias.get(categoria);
		String todosOsResumosDaCategoriaEscolhida = "";
		for (int i = 0; i < categoriaEscolhida.size(); i++) {
			todosOsResumosDaCategoriaEscolhida += categoriaEscolhida.get(i);			
		}
		return todosOsResumosDaCategoriaEscolhida;
	}
	public void exibirTodosOsDadosDosResumoEAvaliacoesDeUmaCategoriaEspecificaInput(){
		String[] opcoes2 = { "Linguagens e Suas Tecnologias", "Ciências Exatadas e da Terra", "Ciências biologicas", "Ciências Humanas", "Educação"};
		int categoria = JOptionPane.showOptionDialog(null, "Informe a categoria que quer ver os projetos", "Vendo categoria", -1, -1, null, opcoes2, opcoes2[0]);
		
		String mensagem = this.todosOsDadosDosResumoEAvaliacoesDeUmaCategoriaEspecifica(categoria);
		JOptionPane.showMessageDialog(null, mensagem, "Projetos da categoria "+ opcoes2[categoria], -1);
	}
	
	
	
	//dados de base para testes
	public void adicionandoResumosEAvaliacoes() {
		this.categorias.get(0).add(new Avaliacao(new Resumo("titulo",   "descricao", "p1", new ArrayList<String>()), "p2", "p3", "ACEITO", "ACEITO"));
		this.categorias.get(1).add(new Avaliacao(new Resumo("titulo2", "descricao2", "p1", new ArrayList<String>()), "p4", "p5", "ACEITO", "ACEITO"));
		this.categorias.get(2).add(new Avaliacao(new Resumo("titulo3", "descricao3", "p1", new ArrayList<String>()), "p6", "p6", "REJEITADO", "REJEITADO"));
		this.categorias.get(3).add(new Avaliacao(new Resumo("titulo4", "descricao4", "p1", new ArrayList<String>()), "p6", "p6", "REJEITADO", "REJEITADO"));
		this.categorias.get(4).add(new Avaliacao(new Resumo("titulo5", "descricao5", "p1", new ArrayList<String>()), "p7", "p8", "REVISAO", "REVISAO"));
		this.categorias.get(4).add(new Avaliacao(new Resumo("titulo6", "descricao6", "p1", new ArrayList<String>()), "p9", "p10", "REVISAO", "REVISAO"));
	}
	
	
	
	// central para verificar os resumos e avaliacoes
	public void menu() {
		while(true) {
			String mensagem =  "Escolha oque dejesa realizar:"
							+"\n0 - Sair"
							+"\n1 - Ver Projetos Avaliados Por Um Avaliador Especifico"
					 		+"\n2 - Ver Projetos Duplamente Aceitos"
					 		+"\n3 - Ver Todos Os Dados Dos Resumo E Avaliacoes De Uma Categoria Especifica";
			String[] opcoes = { "0", "1", "2", "3"};
			int escolha = JOptionPane.showOptionDialog(null, mensagem, "Menu", -1, -1, null, opcoes, opcoes[0]);
			
			if (escolha == 1) {
				this.exibirProjetosAvaliadosPorUmAvaliadorEspecificoInput();
			} else if (escolha == 2) {
				this.exibirProjetosDuplamenteAceitos();
			} else if (escolha == 3) {
				this.exibirTodosOsDadosDosResumoEAvaliacoesDeUmaCategoriaEspecificaInput();
			} else {
				break;
			}
		}
	}
	
	
	
	// metodo principal
	public void main() {
		//this.adicionandoResumosEAvaliacoesInput();
		this.adicionandoResumosEAvaliacoes();
		this.menu();
	}
	
	
	
}
