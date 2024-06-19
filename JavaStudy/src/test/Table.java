package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import database.DBConnector;
import test.model.DBTable;    

public class Table {
	
	static DBConnector connecter = new DBConnector("HR", "1234");
	Date d = new Date();
	SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	
	public static List<DBTable> getAccessDate(String startDate, String endDate) {
		List<DBTable> list = new ArrayList<>();
		String sql = "SELECT * FROM accessRecord "
				+ "WHERE acc_date >= ? AND acc_date <= ? ORDER BY acc_date";
		
		try (
			Connection conn = connecter.getConnection();			
			PreparedStatement pstmt = conn.prepareStatement(sql);
		) {
			pstmt.setString(1, startDate);
			pstmt.setString(2, endDate);
			
			try (
				ResultSet rs = pstmt.executeQuery();
			) {
				while(rs.next()) {
					DBTable db = new DBTable(rs);
					list.add(db);
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		for (DBTable db : list) {
			System.out.println(db);
		}
		
		return list;
	}

	public static void main(String[] args) {
		new TableExample();
		getAccessDate("2024-01-01", "2024-03-30");

	}
}

class TableExample {
	JFrame f;

	TableExample() {
		f = new JFrame();
		String data[][] = new String[9][3];
		String column[] = { "ID", "계정", "접속일" };
		
		JTable jt = new JTable(data, column);
		jt.setBounds(10, 40, 300, 300);
		JScrollPane sp = new JScrollPane(jt);
		jt.setRowHeight(20);
		
		f.add(sp);
		
		f.setLayout(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(300, 400);
		f.setVisible(true);
	}
}