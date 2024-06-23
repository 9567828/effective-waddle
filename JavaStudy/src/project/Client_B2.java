package project;

import java.awt.Point;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import project.common.BackButton;
import project.common.BottomImage;
import project.common.CreateTextField;
import project.common.DefaultFrame;
import project.common.HomeButton;
import project.common.InfoLabel;
import project.common.SmallCheckButton;
import project.common.TopLabel;
import project.common.TopPanel;

public class Client_B2 {
   JFrame frame = DefaultFrame.getDefaultFrame();
   
   public Client_B2() {
      frame.add(setTopPanel());
      frame.add(new InfoLabel("PROGRESS INFOMATION", 20, 59));
      frame.add(new CreateTextField().textField(new Point(12, 83), "납품업체명"));
      frame.add(new SmallCheckButton("조회", new Point(397, 143)));
      frame.add(new BottomImage());
   }


private JPanel setTopPanel() {
   JPanel topPanel = new TopPanel();

   topPanel.add(new TopLabel("납품업체정보수정"));
   topPanel.add(new HomeButton());
   topPanel.add(new BackButton());

   return topPanel;
}

public static void main(String[] args) {
    
    SwingUtilities.invokeLater(new Runnable() {
        @Override
        public void run() {
          new Client_B1();
        }
    });
}
}