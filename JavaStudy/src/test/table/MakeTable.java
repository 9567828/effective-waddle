package test.table;

import java.awt.Color;
import java.awt.Font;
import java.util.List;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableColumn;

public class MakeTable extends JScrollPane {
	
	public MakeTable(int x, int y, int w, int h, String[] columnNames) {
		DatabaseHelper dbHelper = new DatabaseHelper();
		List<Object[]> data = dbHelper.getData("2024-01-01", "2024-05-01", "account_1");
	    
        CustomTableModel model = new CustomTableModel(data, columnNames);
        JTable table = new JTable(model);
        
        JScrollPane scp = new JScrollPane(table);
        
		// 각종 설정
		// 크기, 글꼴 설정
		scp.setBounds(x, y, w, h);
		scp.setFont(new Font("넥슨Lv1", Font.PLAIN, 14));

		// columnNames 행 글씨 가운데 정렬
		DefaultTableCellRenderer dtcr = new DefaultTableCellRenderer();
		dtcr.setHorizontalAlignment(SwingConstants.CENTER);

		// columnNames 행 배경색, 글씨색 설정
		table.getTableHeader().setBackground(Color.decode("#106EBE"));
		table.getTableHeader().setForeground(Color.decode("#FFFFFF"));

		// 셀 높이, 너비 조절
		int defaultHeight = 40;
		table.setRowHeight(defaultHeight); // 각 열의 높이 설정
		
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF); // 자동 크기 조정 비활성화
		TableColumn column;
		int bestSize = 116; // 116 : 표에 맞는 최적의 사이즈
		for (int i = 0; i < table.getColumnCount(); i++) {
			column = table.getColumnModel().getColumn(i);
			column.setPreferredWidth(bestSize); // 각 열의 너비 설정
											
		}
//		scp.setBackground(new Color(255, 255, 255));

		// 가로 스크롤바 추가
		scp.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);	
	}
	
}
