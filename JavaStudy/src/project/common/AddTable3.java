package project.common;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

public class AddTable3 {
	public static JTable table;
	public static DefaultTableModel model;
	private static int rowCount = 0;
	private static Object[] data;

	// columnNames : 열 이름 (맨 윗줄 행)
	public static JScrollPane getTable(
			int locationX, int locationY, 
			int width, int height, String[] columnNames) {

		// 열 이름이 적힌 행 한줄만 있는 모델 생성
		model = new DefaultTableModel(columnNames, 0);

		// 테이블 생성
		table = new JTable(model);

		// 테스트용 3줄
//		model.addRow(new Object[] { "1", "상품1", "10", "10000", "15000", "1.2", "업체A" });
//		model.addRow(new Object[] { "2", "상품2", "20", "8000", "12000", "0.8", "업체B" });
//		model.addRow(new Object[] { "3", "상품3", "15", "12000", "18000", "1.5", "업체C" });

		// 행 개수 설정 (DB 테이블 COUNT값 받아오기)
		rowCount = 100;

		// 행 추가
		for (int i = 0; i < rowCount; i++) {
			model.addRow(new Object[] { "" });
		}

		// 스크롤 패널 생성
		JScrollPane scp = new JScrollPane(table);

		// 각종 설정
		// 크기, 글꼴 설정
		scp.setBounds(locationX, locationY, width, height);
		scp.setFont(new Font("나눔글꼴", Font.PLAIN, 14));

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

		return scp;
	}
	
	public static DefaultTableModel getRowData(Object[] data) {
		for (int i = 0; i < rowCount; ++i) {
			model.addRow(data);
		}
		return model;
	}

}