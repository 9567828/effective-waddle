package project.common;

import java.awt.Color;
import java.awt.Font;
import java.awt.Point;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class CreateTextField {
	
	// 긴 사이즈 텍스트입력창 생성
	public static JTextField textField(Point location, String label) {
		JTextField tf = new JTextField(label);
		tf.setSize(375, 50);
		tf.setFont(new Font("넥슨Lv1고딕", Font.PLAIN, 14));
		tf.setForeground(Color.GRAY);
		tf.setLocation(location);
		
		// 입력받기전 라벨을 회색으로 표기
		// 입력이 활성화 되면 입력텍스트 검은색으로 설정
		tf.addFocusListener(new FocusListener() {
			@Override
			public void focusGained(FocusEvent e) {
				if (tf.getText().equals(label)) {
					tf.setText("");
					tf.setForeground(Color.BLACK);
				}
				
			}
			
			@Override
			public void focusLost(FocusEvent e) {
				if (tf.getText().isEmpty()) {
					tf.setForeground(Color.GRAY);
					tf.setText(label);
				}
				
			}
		});
		
		return tf;
	}

	public static JTextField halfTextField(Point location, String label) {
		JTextField h_tf = new JTextField();
		h_tf.setSize(180, 50);
		h_tf.setFont(new Font("넥슨Lv1고딕", Font.PLAIN, 14));
		h_tf.setForeground(Color.GRAY);
		h_tf.setLocation(location);
		h_tf.addFocusListener(new FocusListener() {
			
			@Override
			public void focusGained(FocusEvent e) {
				if (h_tf.getText().equals(label)) {
					h_tf.setText("");
					h_tf.setForeground(Color.BLACK);
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if (h_tf.getText().isEmpty()) {
					h_tf.setForeground(Color.GRAY);
					h_tf.setText(label);
				}
			}
		});
		
		return h_tf;
	}
}