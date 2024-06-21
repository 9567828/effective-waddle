package test;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import database.DBConnector;

public class MANAGER_B3_2 {
	static DBConnector connecter = new DBConnector("HR", "1234");
	
	final static int inputBoxX = 200;
	final static int inputBoxY = 50;
	final static int btnX = 80;
	final static int btnY = 40;
	final static int labelX = 80;
	final static int labelY = 50;
	
	final static Font font = new Font("맑은 고딕", Font.PLAIN, 14);
	static boolean isShow = true;
	static boolean isAccessLog = false;
	
	static JTextField sdateInput, edateInput;
	static String acc_num, acc_id, acc_date;
	static JTable jt;
	
	static String[] column = {"계정SEQ", "아이디", "접속일"};
	static String[][] data = new String[9][3];
	
	public static JPanel getMan_B3() {
		JPanel jp = new JPanel();
		
		JButton back = new JButton("뒤로가기");
		back.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		back.setBounds(10, 10, btnX, btnY);
		back.setFont(font);
		
		back.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				DefaultPage.cardlayout.show(DefaultPage.pages, "계정생성");
			}
		});
		jp.add(back);
		
		
		JLabel startDate = new JLabel("시작날짜");
		jp.add(startDate);
		startDate.setBounds(20, 60, labelX, labelY);
		startDate.setFont(font);
		
		sdateInput = new JTextField();
		jp.add(sdateInput);
		sdateInput.setBounds(90, 60, inputBoxX, inputBoxY);
		
		
		JLabel endDate = new JLabel("종료날짜");
		jp.add(endDate);
		endDate.setBounds(20, 150, labelX, labelY);
		endDate.setFont(font);
		
		JLabel icon = new JLabel("▼");
		jp.add(icon);
		icon.setBounds(170, 100, 50, 50);
		
		
		edateInput = new JTextField();
		jp.add(edateInput);
		edateInput.setBounds(90, 150, inputBoxX, inputBoxY);
		
		JButton search = new JButton("조회하기");
		jp.add(search);
		search.setBounds(290, 150, btnX, 49);
		search.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		search.setFont(font);
		
		search.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				inputDate();
				
				if (!isAccessLog) {
					System.out.println("조회데이터 없음");
				} else {
					for (int i = 0; i < data.length; ++i) {
						for (int j = 0; j < data[i].length; ++i) {
							jt.setValueAt(acc_num, 0, j);
						}
					}
				}
				
//		        table.setValueAt("200", 1, 1);
//		        table.setValueAt("50", 0, 1);
//		        table1.setValueAt("하이", 0, 0);
//		        table1.setRowHeight(20);
				
			}
		});
				
		jt = new JTable(data, column);

		JScrollPane sp = new JScrollPane(jt);
		sp.setBounds(18, 250, 350, 300);
		jt.setRowHeight(30);
		
		return jp;
	}
	
	private static void inputDate() {
		String startDate = sdateInput.getText();
		String endDate = edateInput.getText();
		
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
					System.out.println(acc_num + " " + acc_id + " " + acc_date);
					
//					for (int i = 0; i < data.length; ++i) {
//						for (int j = 0; j < data[i].length; ++i) {
//							jt.setValueAt(acc_num, 0, j);
//						}
//					}
					isAccessLog = true;
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
			isAccessLog = false;
		}
	}

}
