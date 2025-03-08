package atv1;

import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JOptionPane;

public class Main {

	Main(){
		ArrayList<Integer> lista = new ArrayList<Integer>();
		String mensagem = "Os numeros digitados foram: ";
		
		for (int i = 0; i < 5; i++) {
			lista.add( Integer.parseInt( JOptionPane.showInputDialog(null, "Digite o "+(i+1)+"° numero: ","Input de numeros", JOptionPane.QUESTION_MESSAGE) ) );			
			mensagem += lista.get(i) + (i == 4 ? "." : ", ");
		}
		
		JOptionPane.showMessageDialog(null, mensagem,"Input de numeros", JOptionPane.INFORMATION_MESSAGE);
	}
	
	public static void main(String[] args) {
		new Main();
	}

}
