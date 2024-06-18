package database.dbpool;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

public class MyConnectionPool {
	List<Myconnection> pool = new ArrayList<>();
	
	public MyConnectionPool(int size) {
		for (int i = 0; i < size; ++i) {
			pool.add(new Myconnection("jdbc:oracle:thin:@127.0.0.1:1521:XE", "HR", "1234"));
		}
	}
	
	public Myconnection borrowConnection() {
		for (Myconnection conn : pool) {
			if (!conn.using) {
				// 사용가능한 연결을 발견하면 사용주응로 표시하고 리턴
				conn.use();
				return conn;
			}
		}
		System.out.println("모든 커넥션이 사용중 임다");
		return null;
	}

}
