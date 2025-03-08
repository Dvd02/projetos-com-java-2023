
public class PrincipalContaCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cliente c1 = new Cliente("David", "111.111.111-11", 1);
		Conta ct1 = new Conta(c1);
		
		System.out.println( ct1.dados() );
		
	}

}
