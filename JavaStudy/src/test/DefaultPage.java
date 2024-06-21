package test;

import java.awt.CardLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class DefaultPage extends JFrame {

	public static JPanel pages;
	public static CardLayout cardlayout;
	
	public DefaultPage() {
        setTitle("창고관리시스템");
        setSize(400, 850);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
		
		cardlayout = new CardLayout();
		pages = new JPanel(cardlayout);
		
		pages.add(MANAGER_B3_2.getMan_B3(), "접근기록조회");
		pages.add(new MANAGER_B2_2(), "계정생성");
		add(pages);
	}
	
	public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new DefaultPage().setVisible(true);
            }
        });
	}

}
