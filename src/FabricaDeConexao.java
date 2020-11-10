import java.sql.DriverManager;
import java.sql.Connection;

public class FabricaDeConexao {
	public static Connection getConnection() {
		try {
			return DriverManager.getConnection("jdbc:mysql://localhost/sistema?serverTimezone=UTC", "root", "");
		} catch(Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	public static void main(String[] args) {
		FabricaDeConexao.getConnection();
	}
}
