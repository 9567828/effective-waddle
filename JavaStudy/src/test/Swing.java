package test;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Swing extends JFrame {
	
	public Swing(String title) {
		super(title);
		
		JButton btn = new JButton("뒤로가기");
		JButton sbtn = new JButton("조회하기");
		
		JLabel label = new JLabel("시작날짜");
		label.setBounds(20, 60, 50, 50);
		
		JTextField sdatef = new JTextField();
		
		sdatef.setBounds(80, 60, 200, 50);
		
		sbtn.setBounds(280, 60, 80, 49);
		
		
		btn.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		btn.setBounds(10, 10, 80, 40);
		btn.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		
		sbtn.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		sbtn.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		
		this.add(btn);
		this.add(label);
		this.add(sbtn);
		this.add(sdatef);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocation(200, 200);
		this.setLayout(null);
		this.setSize(390, 400);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new Swing("접근기록조회");
	}

}
