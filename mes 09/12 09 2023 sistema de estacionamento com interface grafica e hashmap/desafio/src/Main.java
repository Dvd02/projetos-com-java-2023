
public class Main {

	public static void main(String[] args) {
		int altura = 20;
		for(int i = altura; i > 0; i--) {
			System.out.println(" ".repeat(i) + "/"+ " ".repeat((altura-i)*2) +"\\");
		}
	}

}
