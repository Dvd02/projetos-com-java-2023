
public class EcInvalidoException extends Exception {
	private String ec;

	public EcInvalidoException(String ec) {
		this.ec = ec;
	}

	@Override
	public String toString() {
		return "Estado civil invalido exception [" + ec + "]";
	}
}
