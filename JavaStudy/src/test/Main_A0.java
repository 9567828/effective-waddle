package test;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

public class Main_A0 {
	final static boolean[] page_number = new boolean[19];
	
	public static JFrame getJFrame() {
		JFrame jframe = new JFrame();
		JLabel jlabel = new JLabel();
		
		ImageIcon icon = new ImageIcon("imgs/ikea.png");
		jlabel.setBounds(0, 6, 100, 38);
		jlabel.setIcon(icon);
		
		
		JPanel jpanel = new JPanel();
		jpanel.setBounds(0, 0, 400, 50);
		jpanel.setBackground(new Color(0, 88, 163));
		
		

		jframe.add(jlabel);
		jframe.add(jpanel);
		jframe.add(new SetImage());
		jframe.add(new SetButton("관리자전용", 10, 120));
		
		jframe.setSize(400, 850);
		jframe.setLayout(null);
		
		jframe.setVisible(true);
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		return jframe;
	}
	
	public static void main(String[] args) {
		JFrame test = getJFrame();
		
		new DigitalWatch(test);
		
	}
}

class DigitalWatch implements Runnable {
	JFrame f;
	Thread t = null;
	int hours = 0, minutes = 0, seconds = 0;
	String timeString = "";
	JButton b;
	
	public DigitalWatch(JFrame jframe) {
		t = new Thread(this);
		t.start();
		
		f = jframe;
		
		b = new JButton();
		b.setBounds(247, 13, 153, 23);
		b.setBackground(new Color(0, 88, 163));
		b.setForeground(new Color(255, 219, 0));
		f.add(b);
	}
	
	@Override
	public void run() {
		try {
			while (true) {
				Calendar cal = Calendar.getInstance();
				hours = cal.get(Calendar.HOUR_OF_DAY);
				if (hours > 12)
					hours -= 12;
				minutes = cal.get(Calendar.MINUTE);
				seconds = cal.get(Calendar.SECOND);

				SimpleDateFormat formatter = new SimpleDateFormat("hh:mm:ss");
				Date date = cal.getTime();
				timeString = formatter.format(date);
				printTime();

				t.sleep(1000); // interval given in milliseconds
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void printTime() {
		b.setText(timeString);
	}
	
}