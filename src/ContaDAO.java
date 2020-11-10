import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ContaDAO {
	public void inserir(Conta c) throws SQLException {
		Connection conexao = FabricaDeConexao.getConnection();
		String sql = "insert into conta (titular, numero, agencia, limite, saldo) values (?,?,?,?,?)";
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setString(1, c.getTitular());
		stmt.setInt(2, c.getConta());
		stmt.setInt(3, c.getAgencia());
		stmt.setDouble(4, c.getLimite());
		stmt.setDouble(5, c.getSaldo());
		stmt.execute();
		stmt.close();
		conexao.close();
	}
	
	public void listagem() throws SQLException {
		Connection conexao = FabricaDeConexao.getConnection();
		String sql = "select * from conta";
		PreparedStatement stmt = conexao.prepareStatement(sql);
		ResultSet resultado = stmt.executeQuery();
		while(resultado.next()) {
			System.out.println("Dados do Registro");
			System.out.println(resultado.getString("titular"));
			System.out.println(resultado.getInt("numero"));
			System.out.println(resultado.getInt("agencia"));
			System.out.println(resultado.getDouble("limite"));
			System.out.println(resultado.getDouble("saldo"));
			System.out.println();
		}
		resultado.close();
		stmt.close();
		conexao.close();
	}
	
	public void atualiza(Conta c, int id) throws SQLException {
		Connection conexao = FabricaDeConexao.getConnection();		
		String sql = "UPDATE conta SET titular = ?, numero = ?, agencia = ?, limite = ?, saldo = ? WHERE id = ?";
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setString(1, c.getTitular());
		stmt.setInt(2, c.getConta());
		stmt.setInt(3, c.getAgencia());
		stmt.setDouble(4, c.getLimite());
		stmt.setDouble(5, c.getSaldo());
		stmt.setInt(6, id);
		stmt.execute();
		stmt.close();
		conexao.close();
	}
	
	public void exclui(int id) throws SQLException {
		Connection conexao = FabricaDeConexao.getConnection();
		String sql = "DELETE FROM conta WHERE id = ?";
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setInt(1, id);
		stmt.execute();
		stmt.close();
		conexao.close();
	}
	
	public static void main(String[] args) {
		/*
		CREATE TABLE conta (
			id int(100) NOT NULL AUTO_INCREMENT,
			titular VARCHAR(100),
		    numero INT(100),
		    agencia INT(100),
		    limite DOUBLE,
			saldo DOUBLE,
		    PRIMARY KEY(id)
		);
		*/
		
		//Conta c = new Conta("titular", 1, 2, 10.0, 10.0); ORIGINAL ALTERADO
		Conta c1 = new Conta("titular1", 1, 2, 10.0, 10.0);
		Conta c2 = new Conta("titular2", 2, 3, 12.0, 14.0);
		Conta c3 = new Conta("titular3", 3, 4, 14.0, 18.0);
		Conta c4 = new Conta("titular4", 4, 5, 16.0, 22.0);
		Conta c5 = new Conta("titular5", 5, 6, 18.0, 26.0);
		ContaDAO dao = new ContaDAO();
		try {
			//dao.inserir(c);
			//dao.inserir(c1);
			//dao.inserir(c2);
			//dao.inserir(c3);
			//dao.inserir(c4);
			//dao.inserir(c5);
			//dao.atualiza(c1, 1);
			//dao.exclui(5);
			dao.listagem();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
