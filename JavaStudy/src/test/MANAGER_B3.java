package test;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class MANAGER_B3 extends JFrame {
	final static int frameX = 400;
	final static int frameY = 850;
	final static int inputBoxX = 200;
	final static int inputBoxY = 50;
	final static int btnX = 80;
	final static int btnY = 40;
	final static int labelX = 80;
	final static int labelY = 50;
	
	final static Font font = new Font("맑은 고딕", Font.PLAIN, 14);
	boolean isShow = true;
	
	public MANAGER_B3(String title) {
		super(title);
		
		JButton back = new JButton("뒤로가기");
		this.add(back);
		back.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		back.setBounds(10, 10, btnX, btnY);
		back.setFont(font);
		
		JLabel startDate = new JLabel("시작날짜");
		this.add(startDate);
		startDate.setBounds(20, 60, labelX, labelY);
		startDate.setFont(font);
		
		JTextField sdateInput = new JTextField();
		this.add(sdateInput);
		sdateInput.setBounds(90, 60, inputBoxX, inputBoxY);
		
		
		JLabel endDate = new JLabel("종료날짜");
		this.add(endDate);
		endDate.setBounds(20, 150, labelX, labelY);
		endDate.setFont(font);
		
		JLabel icon = new JLabel("▼");
		this.add(icon);
		icon.setBounds(170, 100, 50, 50);
		
		
		JTextField edateInput = new JTextField();
		this.add(edateInput);
		edateInput.setBounds(90, 150, inputBoxX, inputBoxY);
		
		JButton search = new JButton("조회하기");
		this.add(search);
		search.setBounds(290, 150, btnX, 49);
		search.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		search.setFont(font);
		
		String[] column = {"계정SEQ", "아이디", "접속일"};
		String[][] data = new String[9][3];
		
		JTable jt = new JTable(data, column);

		JScrollPane sp = new JScrollPane(jt);
		sp.setBounds(18, 250, 350, 400);
		jt.setRowHeight(30);
		this.add(sp);
		

		
		this.setLayout(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocation(200, 200);
		this.setSize(frameX, frameY);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new MANAGER_B3("접근기록조회");
	}

}
