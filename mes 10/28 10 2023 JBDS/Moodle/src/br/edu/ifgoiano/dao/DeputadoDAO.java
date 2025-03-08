package br.edu.ifgoiano.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import br.edu.ifgoiano.bean.Deputado;
import br.edu.ifgoiano.bean.Estado;
import br.edu.ifgoiano.javadb.Database;

public class DeputadoDAO {
	
	public Database db;

	public DeputadoDAO() {
		db = new Database();
	}
	
	public ArrayList<Deputado> findByEstado(int estado){
		ArrayList<Deputado> r = new ArrayList<Deputado>();
		try {
			String sql = "SELECT * FROM deputado WHERE idestado = ?";
			Connection c = db.connect();
			PreparedStatement smt = c.prepareStatement(sql);
			smt.setInt(1, estado);
			ResultSet rs = smt.executeQuery();
			while(rs.next()) {
				Deputado d = new Deputado(rs.getInt("id"), 
					rs.getString("nome"),
					rs.getDate("data_ingresso"),
					rs.getString("partido"),
					new Estado(rs.getInt("idestado"), null, null));
				r.add(d);
			}
		}catch(Exception ex) {
			ex.printStackTrace();
			return null;
		}
		return r;
	}

}
