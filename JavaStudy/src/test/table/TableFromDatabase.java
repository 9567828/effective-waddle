package test.table;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class TableFromDatabase extends JFrame {
	
	
    public TableFromDatabase() {
        DatabaseHelper dbHelper = new DatabaseHelper();
        List<Object[]> data = dbHelper.getData("2024-01-01", "2024-01-10");
        
        // Column names (맞게 수정하세요)
        String[] columnNames = {"Column1", "Column2", "Column3"}; 
        
        CustomTableModel model = new CustomTableModel(data, columnNames);
        JTable table = new JTable(model);
        
        JScrollPane sp = new JScrollPane(table);
        
        this.add(sp);
        this.setTitle("JTable from Database");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new TableFromDatabase());
    }
}