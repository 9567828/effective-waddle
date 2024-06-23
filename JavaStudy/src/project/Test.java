package project;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Test extends JFrame {
	public Test() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(400, 500);
		this.setLocation(200, 200);
		this.setVisible(true);
		
		JPanel jp = new JPanel();
		
		jp.setBounds(0, 0, 400, 20);
		jp.setBackground(new Color(0, 88, 163));
		
		JLabel jl = new JLabel();
		
		jl.setText("아아아아");
		jl.setBounds(0, 30, 100, 20);
		jl.setForeground(Color.WHITE);
		jl.setHorizontalTextPosition(SwingConstants.CENTER);
		jl.setFont(new Font("넥슨Lv1고딕", Font.BOLD, 24));
		this.add(jl);
		
		this.add(jp);
	}
	public static void main(String[] args) {
		new Test();
	}
}
