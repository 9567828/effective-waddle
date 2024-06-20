package test;

import java.awt.BorderLayout;
import java.util.Vector;

import javax.swing.DefaultBoundedRangeModel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.DefaultTableModel;

// 1. AbstractTableModel을 상속받은 클래스를 만든다.
public class MyTableModel extends JFrame {
	JTable jt;
	JScrollPane sp;
	JPanel panel;
	
	Vector<String> column = null;
	DefaultTableModel model = null;
	Vector<Vector<String>> row;
	
	public MyTableModel(String title) {
		super(title);
		
		column = new Vector<String>();
		
		column.add("계정seq");
		column.add("계정ID");
		column.add("접속일");
		
		row = new Vector<Vector<String>>();
		
		DefaultTableModel model = new DefaultTableModel();
		jt = new JTable(model);
		
		jt.setBounds(20, 20, 380, 500);
		
		panel = new JPanel();
		panel.setLayout(new BorderLayout());
		sp = new JScrollPane();
		
		panel.add(sp, BorderLayout.CENTER);
		
		this.add(new SetImage());
		
		this.setLayout(null);
		this.add(panel);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(400, 700);
		this.setVisible(true);
	}
	
	

	public static void main(String[] args) {
		new MyTableModel("벡터연습");
		
	}
}