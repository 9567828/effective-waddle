package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

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

	public static void getAccessDate(String startDate, String endDate) {
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
					
					for (int i = 0; i < data.length; ++i) {
						for (int j = 0; j < data[i].length; ++j) {
							jt.setValueAt(acc_num, 0, i);
						}
					}
					
					System.out.println(acc_num + " " + acc_id + " " + acc_date);
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) {
//		new TableExample();
		new Table("테이블연습");
		getAccessDate("2024-01-01", "2024-03-30");

	}
}