
public class PrincipalFuncionarioGerente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Funcionario funcionario = new Funcionario();
		Gerente gerente = new Gerente();

		System.out.println(funcionario.getNome());
		System.out.println(funcionario.getCpf());
		System.out.println(funcionario.getSalario());
		System.out.println(funcionario.getBonificacao());
		
		System.out.println(gerente.getNome());
		System.out.println(gerente.getCpf());
		System.out.println(gerente.getSalario());
		System.out.println(gerente.getBonificacao());
		
	}
}
