package pessoa;

public class Cliente extends Pessoa {
	private int codigo;

	public void imprimirDados() {
		String mensagem =  "Codigo: " + getCodigo()
						+"\nNome: " + super.getNome()
						+"\nData de nascimento: " + super.getNascimento();
		
		System.out.println(mensagem);
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
}
