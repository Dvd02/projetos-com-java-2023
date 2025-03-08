
import java.sql.PreparedStatement;

public class EstadoDAO {

	public boolean insert(Estado estado) {
		try {
			String sql = "INSERT INTO estado (nome, regiao) VALUES (?, ?)";
			PreparedStatement p = ConnectionFactory.getConnection().prepareStatement(sql);
			p.setString(1, estado.getNome());
			p.setString(2, estado.getRegiao());
			p.execute();
			p.close();
			ConnectionFactory.close();
			return true;
		}catch(Exception ex) {
			ex.printStackTrace();
			return false;
		}
	}
	
	public boolean remove(int id) {
		try {
			String sql = "DELETE FROM estado WHERE id = ?";
			PreparedStatement p = ConnectionFactory.getConnection().prepareStatement(sql);
			p.setInt(1, id); 
			p.execute();
			p.close();
			ConnectionFactory.close();
			return true;
		}catch(Exception ex) {
			return false;
		}
	}
	
	public boolean update(int id, Estado estado){
		try {
			String sql = "UPDATE estado SET nome = ?, regiao = ?  WHERE id = ?";
			PreparedStatement p = ConnectionFactory.getConnection().prepareStatement(sql);
			p.setString(1, estado.getNome());
			p.setString(2, estado.getRegiao());
			p.setInt(3, id); 
			p.execute();
			p.close();
			ConnectionFactory.close();
			return true;
		}catch(Exception ex) {
			return false;
		}
	}
	
}
