package atv5;

import java.util.ArrayList;
import java.util.Collection;

import javax.swing.JOptionPane;

public class Main {
	
	Main(){
		/*
		 * ListaString lista = new ListaString();
			lista.main();
		*/
		ArrayList<String> palavras = new ArrayList<String>();
		
		String palavraInput;
		while(true) {
			palavraInput = JOptionPane.showInputDialog(null, "Digite qualquer palavra","Input de Strings", JOptionPane.QUESTION_MESSAGE);			
			if (palavraInput.equals("quit")) {
				break;}
			palavras.add(palavraInput);
		}
		
		//Collections.sort(palavras);
		
		String mensagem = "";
		for (String palavra : palavras) {
			mensagem += "\n"+palavra;
		}
		
		JOptionPane.showMessageDialog(null, mensagem,"Strings em ordema ", JOptionPane.INFORMATION_MESSAGE);
		
	}
	
	public static void main(String[] args) {
		new Main();
	}

}
