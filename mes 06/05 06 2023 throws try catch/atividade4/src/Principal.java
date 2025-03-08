
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContaBancaria cb1 = new ContaBancaria(100.00, 500.00);
		
		System.out.println( cb1.toString() );
		
		try { cb1.depositar(100.00); } catch (Exception e) { e.printStackTrace(); }
		System.out.println( cb1.toString() );
		try { cb1.sacar(200.00); } catch (Exception e) { e.printStackTrace(); }
		System.out.println( cb1.toString() );
		try { cb1.depositar(1000.00); } catch (Exception e) { e.printStackTrace(); }
		System.out.println( cb1.toString() );	
		try { cb1.sacar(1000.00); } catch (Exception e) { e.printStackTrace(); }
		System.out.println( cb1.toString() );
		
	}

}
