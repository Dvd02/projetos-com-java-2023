import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Connection conexao = DriverManager.getConnection("jdbc:postgresql://localhost/aula","postgres", "sysdba");
			System.out.println("conectado!");
			conexao.close();
		} catch (Exception e) { //SQLExeption
			e.printStackTrace();
		}
	}

}
