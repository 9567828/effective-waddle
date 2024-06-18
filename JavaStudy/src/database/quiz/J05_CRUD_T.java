package database.quiz;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import database.DBConnector;
import database.model.Coffee;

public class J05_CRUD_T {
	
	static DBConnector connector = new DBConnector("hr", "1234");
	static Scanner sc = new Scanner(System.in);

	// (1) 모든 커피 목록을 리스트 형태로 반환하는 메서드

	// (2) 커피 이름으로 검색한 결과를 리스트 형태로 반환하는 메서드 (LIKE)
	
	// (3) 새로운 커피를 추가하는 메서드 (추가 할 때 시퀀스 사용)
	
	// (4) 이미 존재하는 커피의 정보를 수정할 수 있는 메서드 (기본키는 수정 불가능)
	public static boolean updateCoffee(Coffee coffee) {
		// 1. 전달 받은 coffee의 id값으로 업데이트 진행
		String sql = "UPDATE coffee SET coffee_price = ?, coffee_name = ? "
				+ "WHERE coffee_id = ?";
		
		// 업데이트를 실행 했는데 변한 행이 0 = 실패, 1 = 성공
		try (
			Connection conn = connector.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);
		) {
			pstmt.setInt(1, coffee.getCoffee_price());
			pstmt.setString(2, coffee.getCoffee_name());
			pstmt.setInt(3, coffee.getCoffee_id());
			
			return pstmt.executeUpdate() > 0;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	// (5) 커피ID를 매개변수로 전달 받으면 해당 커피를 삭제하고 삭제 여부를 반환해 주는 메서드
	
	
	public static void main(String[] args) {
		boolean result = updateCoffee(new Coffee(1, "카페라떼", 2200));
		System.out.println("수정성공? " + result);
	}
	
}
