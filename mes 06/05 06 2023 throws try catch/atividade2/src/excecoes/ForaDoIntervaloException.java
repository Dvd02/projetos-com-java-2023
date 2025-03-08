package excecoes;

public class ForaDoIntervaloException extends Exception {
	
	public ForaDoIntervaloException() {}

	@Override
	public String toString() {
		return "Numero fora do intervalo exception";
	}
	
}
