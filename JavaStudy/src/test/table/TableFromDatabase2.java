package test.table;

import java.util.List;

import javax.swing.JScrollPane;
import javax.swing.JTable;

public class TableFromDatabase2 {
	
//	List<Object[]> data, String[] columnNames 
    public static JScrollPane getTable(int x, int y, int w, int h, List<Object[]> data, String[] columnNames) {
        DatabaseHelper dbHelper = new DatabaseHelper();
//        List<Object[]> data = dbHelper.getData("2024-01-01", "2024-01-10", "account_1");
        
		CustomTableModel model = new CustomTableModel(data, columnNames);
        JTable table = new JTable(model);
        
        JScrollPane sp = new JScrollPane(table);
        
        sp.setBounds(x, y, w, h);
        
        return sp;
    }
}