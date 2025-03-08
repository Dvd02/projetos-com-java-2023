import javax.swing.JOptionPane;

public class Atividade4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float celsius = 0;
		double kelvin = 0;
		double fahrenheit = 0;
		String titulo = "Conversor de temperatuda";
		String mensagem = "";
		
		celsius = Float.parseFloat( JOptionPane.showInputDialog(null, "digite a temperatura em celcius", titulo, 3) );
		
		fahrenheit = celsius * 1.8 + 32; 
		kelvin = celsius + 273.15;
		mensagem = celsius + " °C  corresponde a: \n"
			   + fahrenheit + " °F \n"
			   + kelvin + " °k";
		
		JOptionPane.showConfirmDialog(null, mensagem, titulo, -1);
		
	}

}
