import javax.swing.JOptionPane;

public class Atividade1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float raio = 0;
		double area = 0;
		double perimetro = 0;
	    double PI = 3.14;
		String mensagem = "";
		
		raio = Float.parseFloat( JOptionPane.showInputDialog(null, "Digite o tamanho do raio de um circulo em cm", "Calcular area de um circulo", 3) );
		 
		area = PI * (raio * raio);
		perimetro = 2 * PI * raio;
		mensagem = "Um circulo com raio de  " + raio 
				   + "\nPossui a area de  " + area + "  cm²"
				   + "\nPossui o perimetro de  " + perimetro + "  cm";
			
		JOptionPane.showConfirmDialog(null, mensagem, "Calcular area de um circulo", -1);
		
	}

}
