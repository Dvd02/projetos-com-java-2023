public class Lista {

	private int[] valores;
	
	public Lista() {
		valores = new int[5];
	}
	
	public Lista(int tamanho) {
		valores = new int[tamanho];
	}
	
	public void insere(int pos, int valor) throws Exception {
		valores[pos] = valor;
	}
	
	public void insere(int pos, int valor, int valor2) throws Exception {
		valores[pos] = valor / valor2;
	}
	
	public void printValores() {
		String valoresString = "";
		for(int i = 0; i < valores.length; i++) {
			if (i+1 == valores.length) {
				valoresString += valores[i] + ".";
			} else {
				valoresString += valores[i] + ", ";
			}
		}
		System.out.println(valoresString);
	}
}