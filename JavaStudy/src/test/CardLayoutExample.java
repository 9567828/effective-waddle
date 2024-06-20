package test;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CardLayoutExample extends JFrame {
    private JPanel cards; // 패널들을 담을 컨테이너
    private CardLayout cardLayout;

    public CardLayoutExample() {
        // JFrame 설정
        setTitle("CardLayout Example");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // CardLayout 설정
        cardLayout = new CardLayout();
        cards = new JPanel(cardLayout);

        // 첫 번째 페이지
        JPanel page1 = new JPanel();
        page1.setBackground(Color.CYAN);
        JButton toPage2Button = new JButton("Go to Page 2");
        toPage2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "Page 2");
            }
        });
        page1.add(toPage2Button);

        // 두 번째 페이지
        JPanel page2 = new JPanel();
        page2.setBackground(Color.PINK);
        JButton toPage1Button = new JButton("Go to Page 1");
        toPage1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "Page 1");
            }
        });
        page2.add(toPage1Button);

        // 카드 패널에 페이지 추가
        cards.add(page1, "Page 1");
        cards.add(page2, "Page 2");

        // 프레임에 카드 패널 추가
        add(cards);

        // 기본 페이지 설정
        cardLayout.show(cards, "Page 1");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CardLayoutExample().setVisible(true);
            }
        });
    }
}