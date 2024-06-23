package project.common;

import java.awt.Color;

import javax.swing.JLabel;

public class InfoLabel extends JLabel {
	
	/**
	 * 1. 제목
	 * 2. x, y 위치값
	 * */
	public InfoLabel(String title, int x, int y) {
		this.setText(title);
		this.setBounds(20, 59, 169, 22);
		this.setForeground(new Color(144, 144, 144));
	}

}
