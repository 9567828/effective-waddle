package project;

import javax.swing.JFrame;
import javax.swing.JScrollPane;

import project.common.AddTable3;
import project.common.DefaultFrame;

public class TableMain {
	public static void main(String[] args) {

		// 메인 프레임
		JFrame frame = new DefaultFrame().getDefaultFrame();
		
		// 테이블
		// 열 이름 설정
		String[] columnNames = { "계정ID", "아이디", "접속 날짜" };
//		String[] columnNames = { "ID", "재고명", "수량", "원가", "판매가", "무게", "납품업체" };
//		String[] columnNames = { "거래처", "거래처ID", "상품명", "상품ID", "발주수량", "발주일자"};
//		String[] columnNames = { "거래처ID", "납품업체명", "담당자명", "전화번호", "등록일시"};

		// 표 위치, 사이즈 설정
		int locationX = 15, locationY = 268, width = 370, height = 543;
		
//		JScrollPane table = new AddTable3().getTable(
//				locationX, locationY, width, height, columnNames);
		
//		frame.add(table);
	}
}