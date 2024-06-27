package project;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;
import javax.swing.border.LineBorder;

public class Label extends JFrame {
	
	public Label() {
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setLocation(200, 200);
		this.setSize(410, 800);
		
		JLabel jl = new JLabel();
		
		jl.setBounds(30, 30, 67, 24);
		jl.setText("아이디");
		jl.setFont(new Font("맑은 고딕", Font.PLAIN, 18));
		
		
		
		this.add(jl);
		
		
	}
	
	public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
        		new Label();
            }
        });
	}
	
}
