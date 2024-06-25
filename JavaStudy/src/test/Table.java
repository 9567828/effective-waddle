package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import database.DBConnector;    

public class Table extends JFrame {
	
	static String[] column = {"계정번호", "ID", "접속일"};
	static String[][] data =  new String[15][9];
	static JTable jt;
	
	
	public Table(String title) {
		super(title);
		
		jt = new JTable(data, column);
		JScrollPane sp = new JScrollPane(jt);
		jt.setRowHeight(20);
		sp.setBounds(20, 20, 350, 500);
		
		this.add(sp);
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setLocation(200, 200);
		this.setSize(400, 600);
		this.setVisible(true);
	
	}
	
	
	
	static DBConnector connecter = new DBConnector("HR", "1234");
	
//	public static List<DBTable> getAccessDate(String startDate, String endDate) {
//		List<DBTable> list = new ArrayList<>();
//		String sql = "SELECT * FROM accessRecord "
//				+ "WHERE acc_date >= ? AND acc_date <= ? ORDER BY acc_date";
//		
//		try (
//			Connection conn = connecter.getConnection();			
//			PreparedStatement pstmt = conn.prepareStatement(sql);
//		) {
//			pstmt.setString(1, startDate);
//			pstmt.setString(2, endDate);
//			
//			try (
//				ResultSet rs = pstmt.executeQuery();
//			) {
//				while(rs.next()) {
//					DBTable db = new DBTable(rs);
//					list.add(db);
//				}
//			}
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//		
//		for (DBTable db : list) {
//			System.out.println(db);
//		}
//		
//		return list;
//	}
	static String acc_num, acc_id, acc_date;

	public static List<String[]> getAccessDate(String startDate, String endDate) {
		List<String[]> data = new ArrayList<>();
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
					acc_num = rs.getString("acc_number");
					acc_id = rs.getString("account_id");
					acc_date = rs.getString("acc_date");
					
	    			int columnCount = rs.getMetaData().getColumnCount();
					
    				String[] row = new String[columnCount];
    				for (int i = 1; i <= columnCount; i++) {
    					row[i - 1] = rs.getString(i);
    				}
    				data.add(row);
					
					
					System.out.println(acc_num + " " + acc_id + " " + acc_date);
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return data;
		
	}

	public static void main(String[] args) {
//		new TableExample();
		new Table("테이블연습");
		getAccessDate("2024-01-01", "2024-03-30");

	}
}