package test;

import java.awt.Point;
import javax.swing.JTextField;

public class CreateTextField {
// 375, 50 사이즈 입력창
	public static JTextField textField(Point location) {
		JTextField tf = new JTextField();
		tf.setSize(375, 50);
		tf.setLocation(location);
		return tf;
	}

// 180, 50 사이즈 입력창
	public static JTextField halfTextField(Point location) {
		JTextField h_tf = new JTextField();
		h_tf.setSize(180, 50);
		h_tf.setLocation(location);
		return h_tf;
	}
}