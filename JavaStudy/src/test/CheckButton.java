package test;

import java.awt.Color;
import java.awt.Font;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class CheckButton extends JFrame {
	
	public CheckButton(JFrame current_frame, JFrame next_frame, String name, int x, int y) {
		JButton move = new JButton(name);
		move.setForeground(new Color(255, 219, 0));
		move.setBackground(new Color(16, 118, 200));
		move.setSize(371, 40);
		move.setLocation(x, y);
		move.setFont(new Font("휴먼둥근헤드라인 보통", Font.BOLD, 20));
		
		move.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
//				current_frame.setVisible(false);
				current_frame.dispose();
				next_frame.setVisible(true);
			}
		});
		current_frame.add(move);
	}

}
