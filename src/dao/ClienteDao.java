package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.ClienteModel;

public class ClienteDao {
	
	private Connection connection;
	
	public ClienteDao() {
		this.connection = new ConnectionFactory().getConnection();		
	}
	
	public void adicionar(ClienteModel cliente) throws SQLException {
		try {
			String sql = "insert into tbCliente"
					+ "(nomeCli,idadeCli,cpfCli)"
					+ " values(?,?,?)";
			
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1, cliente.getNome());
			stmt.setInt(2, cliente.getIdade());
			stmt.setString(3, cliente.getCpf());
			
			stmt.execute();
			stmt.close();
		}
		catch (SQLException e) {
			System.out.println("Erro: " + e);
		}
		finally{
			connection.close();
		}		
	}
}