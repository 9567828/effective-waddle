package test;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrameSwitchExample extends JFrame {
    public FrameSwitchExample(String pageTitle) {
        setTitle(pageTitle);
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());

        if (pageTitle.equals("Page 1")) {
            JButton toPage2Button = new JButton("Go to Page 2");
            toPage2Button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    new FrameSwitchExample("Page 2").setVisible(true);
                    dispose(); // 현재 프레임 닫기
                }
            });
            add(toPage2Button);
        } else if (pageTitle.equals("Page 2")) {
            JButton toPage1Button = new JButton("Go to Page 1");
            toPage1Button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    new FrameSwitchExample("Page 1").setVisible(true);
                    dispose(); // 현재 프레임 닫기
                }
            });
            add(toPage1Button);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FrameSwitchExample("Page 1").setVisible(true);
            }
        });
    }
}