public class TesteLista {
	
	public static void main(String[] args) {
		Lista lista = new Lista(10);
		try { lista.insere(5, 2); } catch (Exception e) { e.printStackTrace(); }
		try { lista.insere(2, 9, 3); } catch (Exception e) { e.printStackTrace(); }
		try { lista.insere(10, 3); } catch (Exception e) { e.printStackTrace(); }
		try { lista.insere(4, 4, 0); } catch (Exception e) { e.printStackTrace(); }
		lista.printValores();
	}

} 