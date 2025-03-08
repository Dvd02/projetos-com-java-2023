package atv2;

import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;

public class CategoriasDeMusica {
	private final HashMap<String, ArrayList<Musica>> lista = new HashMap<String, ArrayList<Musica>>();
	
	public void main() {
		while (true) {
			String categoriaAdicionada = JOptionPane.showInputDialog(null, "informe uma categoria para ser adiconada:\n\".\" PARA SAIR", "Categorias", -1);
			if (categoriaAdicionada.equals(".")) {
				break;
			} else if (!lista.containsKey(categoriaAdicionada)) {
				lista.put(categoriaAdicionada, new ArrayList<Musica>());
			}
			
			while (true) {
				int numeroDaMusicaNaCategoria = (lista.get(categoriaAdicionada).size()+1);
				
				String nome = JOptionPane.showInputDialog(null, "Nome da "+ numeroDaMusicaNaCategoria +"º Musica: \n\".\" PARA SAIR", "Musicas de "+ categoriaAdicionada, -1);
				if (nome == ".") {break;}
				
				String banda = JOptionPane.showInputDialog(null, "Banda da "+ numeroDaMusicaNaCategoria +" º Musica: \n\".\" PARA SAIR", "Musicas de "+ categoriaAdicionada, -1);
				if (banda == ".") {break;}
				
				String album = JOptionPane.showInputDialog(null, "Album da "+ numeroDaMusicaNaCategoria +"º Musica: \n\".\" PARA SAIR", "Musicas de "+ categoriaAdicionada, -1);
				if (album == ".") {break;}
				
				String duracao = JOptionPane.showInputDialog(null, "Duracao da "+ numeroDaMusicaNaCategoria +"º Musica: \n\".\" PARA SAIR", "Musicas de "+ categoriaAdicionada, -1);
				if (duracao == ".") {break;}
				
				Musica novaMusica = new Musica(nome, banda, album, Integer.parseInt(duracao));
				lista.get(categoriaAdicionada).add(novaMusica);
			}
		}
		
		JOptionPane.showConfirmDialog(null, lista.entrySet().toString().replaceAll("], ", "]]\n[").replaceAll("=", ": ").replaceAll("]]]", "]]"), "Categorias e musicas", -1);		
	}

	public HashMap<String, ArrayList<Musica>> getLista() {
		return this.lista;
	}
	
	public String adicionaCategoriaInput() {
		String categoria = JOptionPane.showInputDialog(null, this.getLista().keySet() +"\n\".\" PARA SAIR", "Categorias", 3);
		if (categoria == null || categoria == ".") {return null;}
		
		return this.adicionaCategoria(categoria);
	}
	
	public String adicionaCategoria(String categoria){
		if (!this.getLista().containsKey(categoria)) {
			this.getLista().put(categoria, new ArrayList<Musica>());}
		
		return categoria;
	}
	
	public boolean adicionaMusicaInput(String categoria) {
		String nome = JOptionPane.showInputDialog(null, this.getLista().get(categoria)  +"\nNome da Nova Musica: \n\".\" PARA SAIR", "Musicas de "+ categoria, 3);
		if (nome == null || nome == ".") {return false;}
		
		String banda = JOptionPane.showInputDialog(null, this.getLista().get(categoria)  +"\nBanda da Nova Musica: \n\".\" PARA SAIR", "Musicas de "+ categoria, 3);
		if (banda == null || banda == ".") {return false;}
		
		String album = JOptionPane.showInputDialog(null, this.getLista().get(categoria)  +"\nAlbum da Nova Musica: \n\".\" PARA SAIR", "Musicas de "+ categoria, 3);
		if (album == null || album == ".") {return false;}
		
		String duracao = JOptionPane.showInputDialog(null, this.getLista().get(categoria)  +"\nDuracao da Nova Musica: \n\".\" PARA SAIR", "Musicas de "+ categoria, 3);
		if (duracao == null || duracao == ".") {return false;}
		
		Musica musica = new Musica(nome, banda, album, Integer.parseInt(duracao));
		return adicionaMusica(categoria, musica);
	}
	
	public boolean adicionaMusica(String categoria, Musica musica) {
		if (!this.getLista().keySet().contains(categoria)) {
			return false;}
		
		this.getLista().get(categoria).add(musica);	
		return true;
	}
	
	public void preSetDeCondiguracoesDeLista() {
		this.adicionaCategoria("sexo");
		this.adicionaMusica("sexo", new Musica("musica1", "album", "a melhor do mundo", 130));
		this.adicionaMusica("sexo", new Musica("musica2", "album", "a melhor do mundo", 5));
		this.adicionaCategoria("sexo2");
		this.adicionaMusica("sexo2", new Musica("musica1", "album", "a melhor do mundo", 130));
		this.adicionaMusica("sexo2", new Musica("musica2", "album", "a melhor do mundo", 5));
	}
	
	public void configurandoListaInput() {
		while (true) {
			String categoriaAdicionada = this.adicionaCategoriaInput();
			if (categoriaAdicionada.equals(null)) {
				break;}
			
			while (true) {
				boolean musicaAdicionada = this.adicionaMusicaInput(categoriaAdicionada);
				if (!musicaAdicionada) {
					break;}
			}
		}
	}
	
	public String listaDasCategoriasENomesDasMusicas() {
		return this.getLista().entrySet().toString().replaceAll("], ", "]]\n[").replaceAll("=", ": ").replaceAll("]]]", "]]");
	}
	
	public void exibirListaDasCategoriasENomesDasMusicas() {
		JOptionPane.showConfirmDialog(null, this.listaDasCategoriasENomesDasMusicas(), "Categorias e musicas", -1, 1);	
	}
	
	public String listaDeDadosDasMusicasDeUmaCategoria(String categoria) {
		ArrayList<Musica> categoriaAtual =  this.getLista().get(categoria);
		String mensagem = "Nome - Banda - Album - Duracao";
		for(Musica musicaAtual : categoriaAtual) {
			mensagem += "\n"+musicaAtual.dados();
		}
		return mensagem;
	}
	
	public void exibirListaDeDadosDasMusicasDasCategorias() {
		for (String categoria : this.getLista().keySet()) {
			JOptionPane.showConfirmDialog(null, this.listaDeDadosDasMusicasDeUmaCategoria(categoria), "Musicas de "+ categoria, 0, 1);
		}
	}
	
	public void testeInput() {
		this.configurandoListaInput();
		this.exibirListaDasCategoriasENomesDasMusicas();
		this.exibirListaDeDadosDasMusicasDasCategorias();
	}
	
	public void teste() {
		this.preSetDeCondiguracoesDeLista();
		this.exibirListaDasCategoriasENomesDasMusicas();
		this.exibirListaDeDadosDasMusicasDasCategorias();
	}

}
