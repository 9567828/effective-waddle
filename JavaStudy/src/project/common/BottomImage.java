package project.common;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class BottomImage extends JLabel {
	
	// 화면 하단에 이케아 사진 배치
	public BottomImage() {
		ImageIcon img = new ImageIcon("imgs/ikea_bg.png");
		this.setIcon(img);
		this.setBounds(0, 560, 400, 258);
	}
}
