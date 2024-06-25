package project.common;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

public class AddTable3 extends JScrollPane {
	public static JTable table;
	public static DefaultTableModel model;

	public AddTable3(int locationX, int locationY, 
			int width, int height, String[] columnNames) {

		this.setBounds(locationX, locationY, width, height);
		this.setFont(new Font("나눔글꼴", Font.PLAIN, 14));

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
		this.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		
		this.setViewportView(table);
	}
}