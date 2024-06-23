package project;

import javax.swing.JFrame;
import javax.swing.JPanel;

import project.common.BackButton;
import project.common.DefaultFrame;
import project.common.HomeButton;
import project.common.TopLabel;
import project.common.TopPanel;

public class Client_B1 {
	   public Client_B1() {
	      JFrame frame = DefaultFrame.getDefaultFrame();
	      JPanel topPanel = setTopPanel();
	      topPanel.setBounds(0, 0, 400, 50);
	      
	      frame.add(setTopPanel());
	   }

	   private JPanel setTopPanel() {
	      JPanel topPanel = new TopPanel();

	      topPanel.add(new TopLabel("납품업체정보등록"));
	      topPanel.add(new HomeButton());
	      topPanel.add(new BackButton());

	      return topPanel;
	   }

	   public static void main(String[] args) {
	      new Client_B1();
	   }
	}
