
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Carro gol = new Carro("ifgoiano12V", 180.0);
		gol.cor = "prata";
		gol.modelo = "gol quadrado";
		
		gol.ligaCarro();
		System.out.println("o carro esta a: "+ gol.velocidadeAtual +" km/h, usando a marcha "+ gol.pegaMarcha());
		gol.acelera(30);
		System.out.println("o carro esta a: "+ gol.velocidadeAtual +" km/h, usando a marcha "+ gol.pegaMarcha());
	}

}
