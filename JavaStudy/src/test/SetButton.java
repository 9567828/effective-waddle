package test;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

public class SetButton extends JButton {
	
	/**
		1. 버튼명
		2. x, y 위치값
	*/
	public SetButton(String title, String url, int x, int y) {
		ImageIcon manager_icon = new ImageIcon("imgs/" + url);

		this.setBounds(x, y, 375, 50);
		this.setBackground(new Color(255, 255, 255));
		this.setFont(new Font("Pretendard Variable", Font.BOLD, 24));
		LineBorder border = new LineBorder(new Color(203, 203, 203), 1, true);

		this.setBorder(border);
		this.setIcon(manager_icon);
		this.setText(title);
		
		// 텍스트, 아이콘 간격 설정
		this.setIconTextGap(203);
		// 텍스트&아이콘 가운데 정렬
		this.setHorizontalAlignment(SwingConstants.CENTER);
		// 텍스트를 왼쪽으로 정렬
		this.setHorizontalTextPosition(SwingConstants.LEFT);

		
		// 버튼클릭시 페이지 이동
//		this.addActionListener(new ActionListener() {
//
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				Main_A0 m = new Main_A0();
//				
//				new MANAGER_B2();
//			}
//		});

	}
}
