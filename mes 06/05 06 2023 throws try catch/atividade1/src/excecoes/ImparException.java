package excecoes;

public class ImparException extends Exception{
	
	private int num;
	
	public ImparException(int num){
		this.num = num;
	}
	  
	@Override
	public String toString() {
		return "Numero impar exception [" + num + "]";
	}

}
