import javax.swing.JOptionPane;

public class Atividade2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float altura = 0;
		float base = 0;
		double hipotenusa = 0;
		double perimetro = 0;
		float area = 0;
		String mensagem = "";
		
		altura = Float.parseFloat( JOptionPane.showInputDialog(null, "Digite a altura do triangulo em cm", "Calcular area de um triangulo retangulo", 3) );
		base = Float.parseFloat( JOptionPane.showInputDialog(null, "Digite a base do triangulo em cm", "Calcular area de um triangulo retangulo", 3) );
		 
		area = (base * altura) / 2;
		hipotenusa = Math.sqrt( (base * base) + (altura * altura) );
		perimetro = altura + base + hipotenusa;
		mensagem = "Um triangulo com a base de  " + base + "  e a altura de  "+ altura 
			   + "\nPossui a area de  " + area + "  cm²"
			   + "\nPossui o perimetro de  " + perimetro + "  cm";
		
		JOptionPane.showConfirmDialog(null, mensagem, "Calcular area de um triangulo retangulo", -1);
	
		
	}

}
