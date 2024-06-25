package test.table;

import java.awt.Color;
import java.awt.Font;
import java.util.List;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableColumn;

public class TableFromDatabase2 {
	
//	List<Object[]> data, String[] columnNames 
    public static JScrollPane getTable() {
        DatabaseHelper dbHelper = new DatabaseHelper();
        List<Object[]> data = dbHelper.getData("2024-01-01", "2024-01-10"); 
        
        String[] columnNames = {"co1", "col2", "col3"};
        CustomTableModel model = new CustomTableModel(data, columnNames);
        JTable table = new JTable(model);
        
        JScrollPane sp = new JScrollPane(table);
        
		DefaultTableCellRenderer dtcr = new DefaultTableCellRenderer(); 
	    dtcr.setHorizontalAlignment(SwingConstants.CENTER); 
        
        sp.setBounds(12, 278, 370, 540);
        sp.setFont(new Font("넥슨Lv1고딕", Font.PLAIN, 14));
        table.getColumn("Column2").setCellRenderer(dtcr);
        
		table.getTableHeader().setBackground(new Color(17, 117, 202));
		table.getTableHeader().setForeground(new Color(255, 255, 255));
		
		int defaultHeight = 40;
		table.setRowHeight(defaultHeight); // 각 열의 높이 설정
		
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF); // 자동 크기 조정 비활성화
		TableColumn column;
		int bestSize = 116; // 116 : 표에 맞는 최적의 사이즈
		for (int i = 0; i < table.getColumnCount(); i++) {
			column = table.getColumnModel().getColumn(i);
			column.setPreferredWidth(bestSize); // 각 열의 너비 설정
											
		}
		
		// 가로 스크롤바 추가
		sp.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        
        return sp;
    }
}