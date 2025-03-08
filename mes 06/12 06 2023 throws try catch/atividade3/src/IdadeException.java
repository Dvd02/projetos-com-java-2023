
public class IdadeException extends Exception {
	private int idade;

	public IdadeException(int idade) {
		this.idade = idade;
	}

	@Override
	public String toString() {
		return "Menor de idade exception [" + idade + "]";
	}
}
