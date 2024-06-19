package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import database.DBConnector;
import test.model.DBTable;    

public class Table {
	
	static DBConnector connecter = new DBConnector("hr", "1234");
	static Scanner sc = new Scanner(System.in);
	
	public static List<DBTable> getAccessDate(int startDate) {
		
		List<DBTable> list = new ArrayList<>();
		String sql = "SELECT * FROM accessRecord WHERE acc_number = ?";
		
		try (
			Connection conn = connecter.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);	
		) {
			pstmt.setInt(1, startDate);
//			pstmt.setString(2, endDate);
			
			try (
				ResultSet rs = pstmt.executeQuery();
			) {
				while (rs.next()) {
					DBTable t = new DBTable(rs);
					list.add(t);
				}
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		for (DBTable t : list) {
			System.out.println(t);
		}
		
		return list;
	}
	
	public static void main(String[] args) {
//		new TableExample();
		getAccessDate(1);
	}
}

class TableExample {
	JFrame f;

	TableExample() {
		f = new JFrame();
		String data[][] = new String[9][3];
		String column[] = { "ID", "계정", "접속일" };
		
		JTable jt = new JTable(data, column);
		jt.setBounds(30, 40, 200, 300);
		JScrollPane sp = new JScrollPane(jt);
		
		jt.setRowHeight(20);
		f.add(sp);
		f.setSize(300, 400);
		f.setVisible(true);
	}
}