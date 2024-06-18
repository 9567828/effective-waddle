package database.quiz;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class J03_DBPractice2 {

	/*
	 	(1) 관리자 계정으로 DB에 새 계정을 추가한다
	 	
	 	(2) 관리자 계정으로 새 계정에 권한을 부여한다
	 	
	 	(3) 해당 계정에 새 테이블을 추가한다
	 		(기본키로 시퀀스를 사용해야 하고, 제약 조건을 종류별로 모두 사용해야 한다)
	 	
	 	(4) 프로그램에서 스캐너로 입력을 하면 DB에 행이 추가 되어야 한다
	 	
	 	(5) 콘솔에서 여태까지 추가된 모든 행을 조회할 수 있어야 한다
	*/
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			
		try (
			Connection conn = DBConnector1.getConnection();
		) {
			
			String sql = "INSERT INTO cosmetics VALUES(myseql.nextval, ?, ?, ?, ?)";
			String sql1 = "SELECT rpad(TO_CHAR(cos_id), 10, ' ') AS \"cos_id\", "
					+ "rpad(cosmetic_name, 15, ' ') AS \"cosmetic_name\", "
					+ "rpad(TO_CHAR(cosmetic_price), 15, ' ') AS \"cosmetic_price\", "
					+ "rpad(TO_CHAR(cosmetic_qty), 15, ' ') AS \"cosmetic_qty\", "
					+ "rpad(color, 15, ' ') AS \"color\" FROM cosmetics";
			
			try (
				PreparedStatement pstmt = conn.prepareStatement(sql);
			) {
//				System.out.print("화장품명, 가격, 수량, 색상을 입력하세요>> ");
//				
//				String name = sc.next();
//				int price = sc.nextInt();
//				int qty = sc.nextInt();
//				String color = sc.next();
//				
//				pstmt.setString(1, name);
//				pstmt.setInt(2, price);
//				pstmt.setInt(3, qty);
//				pstmt.setString(4, color);

				pstmt.setString(1, "마스카라a");
				pstmt.setInt(2, 10000);
				pstmt.setInt(3, 10);
				pstmt.setString(4, "블랙");
				
				int row = pstmt.executeUpdate();
				
				System.out.printf("%d행이 업뎃되었습니다\n", row);
			}
//			
			try (
				PreparedStatement pstmt = conn.prepareStatement(sql1);
			) {
				ResultSet rs = pstmt.executeQuery();
				
				System.out.println("#### 화장품목록 ####");
				System.out.printf("%-10s%-14s%-16s%-15s%-15s\n", 
						"cos_id", "name", "price", "qty", "color");
				while (rs.next()) {
					System.out.printf("%s%s\t%s\t%s%s\n", 
							rs.getString("cos_id"),
							rs.getString("cosmetic_name"),
							rs.getString("cosmetic_price"),
							rs.getString("cosmetic_qty"),
							rs.getString("color"));
				}
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
}
