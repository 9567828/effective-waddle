package project;

import java.awt.Event;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.SwingUtilities;

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
	
	static boolean isShow = true;
	static boolean isAccessLog = false;
	JFrame j = DefaultFrame.getDefaultFrame();
	CreateTextField text = new CreateTextField();
	TopPanel pan = new TopPanel();
	
	String[] columnNames = { "계정ID", "아이디", "접속 날짜" };
	Object[] data;
	
	public Manager_B3_2() {
		j.add(new HomeButton());
		j.add(new BackButton());
		j.add(new TopLabel("접근기록조회"));
		j.add(pan);
		j.add(new InfoLabel("SEARCH CONDITIONS", 20, 59));
		j.add(text.textField(new Point(12, 90), "날짜"));
		j.add(text.textField(new Point(12, 153), "계정ID"));
		
		JButton btn = (JButton) j.add(new BlueLongButton("검색", 12, 220)); 
		
		// 검색 버튼 기능
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		j.add(new InfoLabel("SEARCH DATA", 12, 259));
		JScrollPane table = (JScrollPane) j.add(AddTable3.getTable(
				12, 278, 370, 540, columnNames));
		
		data[0] = "1";
		data[1] = "마스터";
		data[2] = "언제지";
		AddTable3.model.addRow(data);
		
		
	}
	
//	private static void inputDate() {
//		String startDate = sdateInput.getText();
//		String endDate = edateInput.getText();
//		
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
//					acc_num = rs.getString("acc_number");
//					acc_id = rs.getString("account_id");
//					acc_date = rs.getString("acc_date");
//					System.out.println(acc_num + " " + acc_id + " " + acc_date);
//					
//					isAccessLog = true;
//				}
//			}
//		} catch (SQLException e) {
//			e.printStackTrace();
//			isAccessLog = false;
//		}
//	}
	
	public static void main(String[] args) {
		
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
        		new Manager_B3_2();
            }
        });
    }
}
