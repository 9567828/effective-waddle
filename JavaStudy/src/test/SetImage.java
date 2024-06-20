package test;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class SetImage extends JLabel {
	
	public SetImage() {
		ImageIcon img = new ImageIcon("imgs/ikea_bg.png");
		this.setIcon(img);
		this.setBounds(0, 561, 400, 250);
	}
	
	public static void main(String[] args) {
		JFrame j = new JFrame();
		
		j.add(new SetImage());
		
		j.setSize(400, 850);
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		j.setLayout(null);
		j.setVisible(true);
		
	}
}