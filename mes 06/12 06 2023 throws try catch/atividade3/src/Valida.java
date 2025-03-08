
public class Valida {
	public Valida() {}
	
	public static void idade(int idade) throws IdadeException {
		if (idade < 18) {
			throw new IdadeException(idade);
		}
	}

	public static void ec(String ec) throws EcInvalidoException {
		if ( !(ec.equals("S") || ec.equals("C") || ec.equals("V") || ec.equals("D") || ec.equals("O")) ) {
			throw new EcInvalidoException(ec);
		}
	}
}
