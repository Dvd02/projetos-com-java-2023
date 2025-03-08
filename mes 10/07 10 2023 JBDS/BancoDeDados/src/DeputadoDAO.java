import java.sql.Date;
import java.sql.PreparedStatement;

public class DeputadoDAO {
	/*
		-- INSERT INTO deputado (nome, data_ingresso, partido, idestado) VALUES ( ? , ? , ?, ?);
		-- UPDATE deputado SET nome = ?, data_ingresso = ?, partido = ?, idestado = ? WHERE id = ?;
		-- DELETE FROM deputado WHERE id = ?
	*/

	public boolean insert(Deputado deputado) {
		try {
			String sql = "INSERT INTO deputado (nome, data_ingresso, partido, idestado) VALUES ( ? , ? , ? , ? )";
			PreparedStatement p = ConnectionFactory.getConnection().prepareStatement(sql);
			p.setString(1, deputado.getNome());
			p.setDate(2,  deputado.getDataIngressao());
			p.setString(3, deputado.getPartido());
			p.setInt(4, deputado.getIdEstado());
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
			String sql = "DELETE FROM deputado WHERE id = ?";
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
	
	public boolean update(int id, Deputado deputado){
		try {
			String sql = "UPDATE deputado SET nome = ?, data_ingresso = ?, partido = ?, idestado = ? WHERE id = ?";
			PreparedStatement p = ConnectionFactory.getConnection().prepareStatement(sql);
			p.setString(1, deputado.getNome());
			p.setDate(2, deputado.getDataIngressao());
			p.setString(3, deputado.getPartido());
			p.setInt(4, deputado.getIdEstado());
			p.setInt(5, id); 
			p.execute();
			p.close();
			ConnectionFactory.close();
			return true;
		}catch(Exception ex) {
			return false;
		}
	}

}
