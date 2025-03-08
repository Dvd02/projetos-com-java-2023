
import javax.swing.JOptionPane;

public class Main2 {
	
	public static void basicoAltura(int altura){
		//int altura = 20;
		for(int i = altura; i > 0; i--) {
			System.out.println(" ".repeat(i) + "/"+ " ".repeat((altura-i)*2) +"\\");
		}
	}
	
	public static void basicoLargura(int largura){
		//int largura = 40;
		for(int i = largura; i > 0; i-=2) {
			System.out.println(" ".repeat(i/2) + "/"+ " ".repeat(largura-i) +"\\");
		}
	}
	
	public static void avancado(int altura1OuLargura2, int tamanho){
		String mensagem = "";
		for(int i = tamanho; i > 0; i -= altura1OuLargura2) {
			mensagem += " ".repeat(i/altura1OuLargura2) + "/"+ " ".repeat((tamanho-i)*2/altura1OuLargura2) +"\\\n";
		}
		System.out.println(mensagem);
		//JOptionPane.showMessageDialog(null, mensagem.replaceAll(" ","  "), "piramide", JOptionPane.PLAIN_MESSAGE);
	}
	
	public static void main(String[] args) {
		
		System.out.println("altura 20:");
		Main2.basicoAltura(20);
		System.out.println("------------------------------------------");
		
		System.out.println("largura 20:");
		Main2.basicoLargura(20);
		System.out.println("------------------------------------------");
		
		System.out.println("altura 6:");
		Main2.avancado(1, 6);
		System.out.println("------------------------------------------");
		
		System.out.println("largura 6:");
		Main2.avancado(2, 6);
		System.out.println("------------------------------------------");
	}

}
