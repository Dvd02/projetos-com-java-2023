
public class PrincipalFuncionarioGerente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Gerente g1 = new Gerente("luiz", "0", 1000);
		Funcionario f1 = new Funcionario("David", "1", 1000);

		System.out.println(
			f1.getNome() + "\n" + 
			f1.getCpf() + "\n" +
			f1.getSalario() + "\n" + 
			f1.getBonificacao()
		);
		
		System.out.println(  f1.dados()  );
		
		System.out.println();

		System.out.println(  g1.dados()  );
	}

}
