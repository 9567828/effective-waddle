package test;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

public class SetButton extends JButton {
	
	public SetButton(String title, int x, int y) {
		ImageIcon manager_icon = new ImageIcon("imgs/manager_icon.png");

		// 위치값은 변수로 설정했습니다
		this.setBounds(x, y, 375, 50);
		this.setBackground(new Color(255, 255, 255));
		this.setFont(new Font("Pretendard Variable", Font.BOLD, 24));
		LineBorder border = new LineBorder(new Color(203, 203, 203), 1, true);
		
		this.setBorder(border);
		this.setIcon(manager_icon);
		this.setText(title);
		this.setIconTextGap(203);
		this.setHorizontalAlignment(SwingConstants.CENTER);
		this.setHorizontalTextPosition(SwingConstants.LEFT);
		
//		btn.addActionListener(new ActionListener() {
//		
//		@Override
//		public void actionPerformed(ActionEvent e) {
//			
//			jframe.setVisible(false);
//		}
//	});
	
	}
}
