package test;

import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Swing {
	
	static void setframe() {
		JFrame f = new JFrame();
		JButton btn = new JButton("뒤로가기");
		JButton sbtn = new JButton("조회하기");
		
		JLabel label = new JLabel("시작날짜");
		label.setBounds(20, 60, 50, 50);
		
		JTextField sdatef = new JTextField();
		
		sdatef.setBounds(80, 60, 200, 50);
		
		
		
		sbtn.setBounds(280, 60, 80, 49);
		
		
		btn.setLayout(null);
		btn.setBounds(10, 10, 80, 40);
		btn.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		sbtn.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		
		f.add(btn);
		f.add(label);
		f.add(sbtn);
		f.add(sdatef);
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLocation(200, 200);
		f.setLayout(null);
		f.setSize(390, 400);
		f.setVisible(true);
	}
	
	public static void main(String[] args) {
		setframe();
	}

}
