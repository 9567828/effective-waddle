package database.dbpool;

import java.io.Closeable;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Myconnection implements Closeable {
	Connection conn;
	boolean using;
	
	// 새로운 연결이 생길 때 비밀번호와 아이디를 전달한다
	public Myconnection(String url, String user, String password) {
		try {
			conn = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public Connection getConnection() {
		return conn;
	}
	
	public void use() {
		using = true;
	}
	
	public void relase () {
		using = false;
	}
	
	public boolean check() {
		return using;
	}
	
	public PreparedStatement prepareStatement(String sql) throws SQLException {
		return conn.prepareStatement(sql);
	}

	@Override
	public void close() throws IOException {
		// 유징이를 닫는다
		using = false;
	}

}
