package project;

import java.awt.Point;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import database.DBConnector;
import project.common.BackButton;
import project.common.BlueLongButton;
import project.common.CreateTextField;
import project.common.DefaultFrame;
import project.common.HomeButton;
import project.common.InfoLabel;
import project.common.TopLabel;
import project.common.TopPanel;

public class MANAGER_B3_2 extends JFrame {
	static DBConnector connecter = new DBConnector("HR", "1234");
	
	static boolean isShow = true;
	static boolean isAccessLog = false;
	JFrame j = DefaultFrame.getDefaultFrame();
	CreateTextField text = new CreateTextField();
	TopPanel pan = new TopPanel();
	
	public MANAGER_B3_2() {
		
		j.add(new HomeButton());
		j.add(new BackButton());
		j.add(new TopLabel("접근기록조회"));
		j.add(pan);
		j.add(new InfoLabel("SEARCH CONDITIONS", 20, 59));
		j.add(text.textField(new Point(16, 90), "날짜"));
		j.add(text.textField(new Point(16, 153), "계정ID"));
		j.add(new BlueLongButton("검색", 16, 220));
		j.add(new InfoLabel("SEARCH DATA", 15, 265));
//		j.add(new BottomImage());
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
        		new MANAGER_B3_2();
            }
        });
    }
}
