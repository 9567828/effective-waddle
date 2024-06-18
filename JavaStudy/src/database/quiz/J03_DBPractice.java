package database.quiz;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class J03_DBPractice {

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
			
			String sql = "INSERT INTO movies VALUES(movie_seq.nextval, ?, ?, ?)";
			String sql1 = "SELECT rpad(TO_CHAR(movie_id), 20, ' ') AS \"movie_id\", "
					+ "rpad(movie_name, 15, ' ') AS \"movie_name\", "
					+ "rpad(TO_CHAR(movie_rating), 15, ' ') AS \"movie_rating\", "
					+ "rpad(TO_CHAR(realse_date), 15, ' ') AS \"realse_date\" FROM movies";
			
//			String sql1 = "SELECT * FROM movies ORDER BY movie_id";
			
//			try (
//				PreparedStatement pstmt = conn.prepareStatement(sql);
//			) {
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
//
//				pstmt.setString(1, "원더랜드3");
//				pstmt.setDouble(2, 6.62);
//				pstmt.setString(3, "2024-06-05");
//				
//				int row = pstmt.executeUpdate();
//				
//				System.out.printf("%d행이 업뎃되었습니다\n", row);
//			}

			try (
				PreparedStatement pstmt = conn.prepareStatement(sql1);
			) {
				ResultSet rs = pstmt.executeQuery();
				
				System.out.println("#### 영화목록 ####");
				System.out.printf("%-20s%-15s%-15s%-15s\n", 
						"movie_id", "name", "rating", "reales_date");
				while (rs.next()) {
					System.out.printf("%s%s%s%s\n", 
							rs.getString("movie_id"),
							rs.getString("movie_name"),
							rs.getString("movie_rating"),
							rs.getString("realse_date"));
				}
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
}
