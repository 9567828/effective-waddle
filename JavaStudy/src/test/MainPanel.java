package test;

import java.awt.CardLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainPanel extends JFrame {
	
    private JPanel cards; // 패널들을 담을 컨테이너
    private CardLayout cardLayout;
	
	public MainPanel() {
		setTitle("메인페이지 입니다");
		setSize(400, 850);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		cardLayout = new CardLayout();
		cards = new JPanel(cardLayout);
		
		
	}

}
