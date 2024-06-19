package test;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Swing extends JFrame {
	final static int inputBoxX = 200;
	final static int inputBoxY = 50;
	final static int btnX = 80;
	final static int btnY = 40;
	final static int labelX = 80;
	final static int labelY = 50;
	
	
	public Swing(String title) {
		super(title);
		
		JButton back = new JButton("뒤로가기");
		JButton search = new JButton("조회하기");
		
		JLabel startDate = new JLabel("시작날짜");
		startDate.setBounds(20, 60, labelX, labelY);
		startDate.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		
		JTextField sdateInput = new JTextField();
		sdateInput.setBounds(90, 60, inputBoxX, inputBoxY);
		
		
		JLabel endDate = new JLabel("종료날짜");
		endDate.setBounds(20, 150, labelX, labelY);
		endDate.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		
		JLabel icon = new JLabel("▼");
		icon.setBounds(170, 100, 50, 50);
		
		
		JTextField edateInput = new JTextField();
		edateInput.setBounds(90, 150, inputBoxX, inputBoxY);
		
		search.setBounds(290, 150, btnX, 49);
		
		
		back.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		back.setBounds(10, 10, btnX, btnY);
		back.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		
		search.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		search.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		
		this.add(back);
		this.add(startDate);
		this.add(search);
		this.add(sdateInput);
		this.add(endDate);
		this.add(edateInput);
		this.add(icon);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocation(200, 200);
		this.setLayout(null);
		this.setSize(400, 500);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new Swing("접근기록조회");
	}

}
