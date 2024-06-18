package database.quiz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector1 {
	
	private static String drivepath = "oracle.jdbc.driver.OracleDriver";
	private static String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
	private static String user = "dbpractice";
	private static String password = "1234";
	
	static {
		try {
			Class.forName(drivepath);
			System.out.println("드라이브 연결 성공");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이브 못 찾음");
		}
	}
	
	public static Connection getConnection() throws SQLException {
		return DriverManager.getConnection(url, user, password);
	}
	
	

}
