package test;

import java.awt.CardLayout;
import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Main_A0 extends JFrame {
	final static boolean[] page_number = new boolean[19];
	
	public Main_A0() {
		JLabel jlabel = new JLabel();
		
		ImageIcon icon = new ImageIcon("imgs/ikea.png");
		jlabel.setBounds(0, 6, 100, 38);
		jlabel.setIcon(icon);
		
		
		JPanel jpanel = new JPanel();
		jpanel.setBounds(0, 0, 400, 50);
		jpanel.setBackground(new Color(0, 88, 163));
		
//		this.add(new MANAGER_B3_2("접근기록조회"));
		
		this.add(jlabel);
		this.add(jpanel);
		this.add(new SetImage());
		this.add(new SetButton("관리자전용", "manager_icon.png", 10, 120));
		
		this.setSize(400, 850);
		this.setLayout(null);
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		 JFrame test = new Main_A0();
		
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