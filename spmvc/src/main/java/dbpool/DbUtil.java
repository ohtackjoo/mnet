package dbpool;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbUtil {
	public static Connection getConnection() throws Exception {
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con
		=DriverManager.getConnection("jdbc:oracle:thin:@//192.168.0.11:1521/orcl", 
				"exam_manager", "exam_manager!");
		
		return con;
	}
	
}
