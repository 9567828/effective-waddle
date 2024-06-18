package gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class S05_MouseEvent {
	public static void main(String[] args) {
		JFrame f = new JFrame("MOUSE EVENT");
		
		f.setLayout(null);
		
		// 글자를 표시할 때 쓰는 컴포넌트
		JLabel label = new JLabel("ID: ");
		label.setBounds(10, 10, 100, 50);
		
		// 글자를 한 줄 입력할 때 쓰는 컴포넌트
		JTextField idField = new JTextField();
		idField.setBounds(100, 20, 350, 30);
		
		// 대부분의 컴포넌트에는 키보드 이벤트를 추가할 수 있다
		idField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				System.out.println("눌린키: " + e.getKeyChar());
				System.out.println("키가 눌린 시간: " + e.getWhen());
			}
			
		});
		
		
		JLabel label2 = new JLabel("자기소개: ");
		label2.setBounds(10, 100, 100, 50);
		// 글자를 여러 줄 입력할 때 쓰는 컴포넌트
		JTextArea introField = new JTextArea(10, 10);
		introField.setBounds(100, 120, 350, 100);
		
		// 모든 컴포넌트에는 마우스 이벤트를 추가할 수 있다
		introField.addMouseListener(new MouseAdapter() {
			// 다양한 메서드를 오버라이드 하여 이벤트를 처리할 수 있다
			
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("자기소개 입력란 마우스 클릭!");
				System.out.println("이벤트 발생 시 x좌표: " + e.getX());
				System.out.println("이벤트 발생 시 y좌표: " + e.getY());
				
				System.out.println("마우스의 어떤 버튼을 눌렀냐 " + e.getButton());
				System.out.println("연속 클릭횟수 " + e.getClickCount());
				
				System.out.printf("모니터좌표 (%d, %d)\n", e.getXOnScreen(), e.getYOnScreen());
				introField.setText(String.format("(%d, %d)", e.getXOnScreen(), e.getYOnScreen()));
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				System.out.println("마우스가 텍스트영역에 드러와따");
				introField.setBackground(Color.CYAN);
				introField.setForeground(Color.MAGENTA);
				introField.setFont(new Font("궁서체", Font.BOLD, 20));
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				System.out.println("마우스가 텍스트영엑서 나갔다");
				introField.setBackground(Color.WHITE);
				introField.setForeground(Color.BLACK);
			}
			
		});
		
		f.add(label);
		f.add(label2);
		f.add(idField);
		f.add(introField);
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLocation(200, 300);
		f.setSize(500, 500);
		f.setVisible(true);
	}
}
