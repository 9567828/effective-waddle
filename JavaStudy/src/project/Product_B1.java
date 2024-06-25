package project;

import java.awt.Point;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import database.DBConnector;
import project.common.AddTable;
import project.common.BackButton;
import project.common.BlueLongButton;
import project.common.CreateTextField;
import project.common.DefaultFrame;
import project.common.HomeButton;
import project.common.InfoLabel;
import project.common.TopLabel;
import project.common.TopPanel;

public class Product_B1 extends JPanel {
	static DBConnector connecter = new DBConnector("HR", "1234");
	JFrame j = DefaultFrame.getDefaultFrame();
	CreateTextField text = new CreateTextField();
	
	public Product_B1() {
		j.add(new BackButton());
		j.add(new HomeButton());
		j.add(new TopLabel("상품목록조회"));
		j.add(new TopPanel());
		j.add(new InfoLabel("SEARCH CONDITIONS", 20, 59));
		j.add(text.textField(new Point(12, 81), "상품명"));
		j.add(new BlueLongButton("검색", 14, 159));
		j.add(new InfoLabel("SEARCH DATA", 15, 249));
//		j.add(AddTable.getTable(15, 268));
	}
	
	public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
        		new Product_B1();
            }
        });
	}
}
