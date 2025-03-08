

package br.edu.ifgoiano.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import br.edu.ifgoiano.javadb.Database;

public class ProjetoDAO {
	
	public Database db;

	public ProjetoDAO() {
		db = new Database();
	}
	
	public ArrayList<String> findByNome(String nome){
		ArrayList<String> r = new ArrayList<String>();
		try {
			String sql = "select voto from projetos where nome = ?";
			Connection c = db.connect();
			PreparedStatement smt = c.prepareStatement(sql);
			smt.setString(1, nome);
			ResultSet rs = smt.executeQuery();
			while(rs.next()) {
				r.add(rs.getString("voto"));
			}
		}catch(Exception ex) {
			ex.printStackTrace();
			return null;
		}
		return r;
	}

}
