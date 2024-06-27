package project;

import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

import database.DBConnector;
import project.common.AddTable3;
import project.common.BackButton;
import project.common.BlueLongButton;
import project.common.CreateTextField;
import project.common.DefaultFrame;
import project.common.HomeButton;
import project.common.InfoLabel;
import project.common.TopLabel;
import project.common.TopPanel;

public class Manager_B3_2 extends JFrame {
	static DBConnector connecter = new DBConnector("HR", "1234");
	
	static boolean isAccessLog = false;
	JFrame j = DefaultFrame.getDefaultFrame();
	CreateTextField text = new CreateTextField();
	TopPanel pan = new TopPanel();
	
	static JScrollPane sp;
	
	static JTextField startDateInput, endDateInput, accountInput;
	static String acc_num, acc_id, acc_date;
	static DefaultTableModel model;
	static JTable table;
	String[] columnNames = { "계정ID", "아이디", "접속 날짜" };
	
	static String startDate, endDate, account;

//	static DatabaseHelper dbhelper = new DatabaseHelper();
//	static List<Object[]> data = dbhelper.getData("2024-01-01", "2024-01-10", "account_1");
	
	static List<Object[]> data;
	
	public Manager_B3_2() {
		
		j.add(new HomeButton());
		j.add(new BackButton());
		j.add(new TopLabel("접근기록조회"));
		j.add(pan);
		j.add(new InfoLabel("SEARCH CONDITIONS", 20, 59));
		startDateInput = (JTextField) j.add(text.halfTextField(new Point(12, 90), "시작날짜"));
		endDateInput = (JTextField) j.add(text.halfTextField(new Point(207, 90), "마지막날짜"));
		accountInput = (JTextField) j.add(text.textField(new Point(12, 153), "계정ID"));
		
		JButton btn = (JButton) j.add(new BlueLongButton("검색", 12, 220));
		
		// 검색 버튼 기능
		btn.addActionListener(new ActionListener() {
			
			@Override	
			public void actionPerformed(ActionEvent e) {
				startDate = startDateInput.getText();
				endDate = endDateInput.getText();
				account = accountInput.getText();
				
				inputDate(startDate, endDate, account);
				
				System.out.println("");
				
				if (!isAccessLog) {
					System.out.println("데이터 없다");
				}
			}
		});
		
		j.add(new InfoLabel("SEARCH DATA", 12, 259));
		
//		DefaultTableModel model = new DefaultTableModel(columnNames, 0);
//		JTable table = new JTable(model);
		
		Object[] tableComponents = 
				AddTable3.getTableComponents(12, 278, 370, 540, columnNames, "accessRecord");
		sp = (JScrollPane) tableComponents[0];
		model = (DefaultTableModel) tableComponents[1];
		table = (JTable) tableComponents[2];
		j.add(sp);
	}
	
	private static void inputDate(String startDate, String endDate, String account) {
		
		String sql = "SELECT * FROM accessRecord "
				+ "WHERE acc_date >= ? AND acc_date <= ? "
				+ "AND account_id LIKE ? ORDER BY acc_date";
		
		model.setRowCount(0);
		
		try (
			Connection conn = connecter.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);
		) {
			pstmt.setString(1, startDate);
			pstmt.setString(2, endDate);
			pstmt.setString(3, "%" + account + "%");
			
			try (
				ResultSet rs = pstmt.executeQuery();
			) {
    			int columnCount = rs.getMetaData().getColumnCount();
    			
    			while (rs.next()) {
    				String[] row = new String[columnCount];
    				for (int i = 1; i <= columnCount; i++) {
						row[i - 1] = rs.getString(i);
    				}
    				model.addRow(row);
    				isAccessLog = true;
    			}
			}
		} catch (SQLException e) {
			e.printStackTrace();
			isAccessLog = false;
		}
	}
	
	public static void main(String[] args) {
		
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
        		new Manager_B3_2();
            }
        });
    }
}
