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

public class J05_CRUD {
	
	static DBConnector connector = new DBConnector("hr", "1234");
	static Scanner sc = new Scanner(System.in);

	// (1) 모든 커피 목록을 리스트 형태로 반환하는 메서드
	
	public static List<Coffee> getListcoffee() {
		List<Coffee> list = new ArrayList<>();
		String sql = "SELECT * FROM coffee ORDER BY coffee_id";
		
		try (
			Connection conn = connector.getConnection();
		) {
			try (
				PreparedStatement pstmt = conn.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();
			) {
				while (rs.next()) {
					Coffee cf = new Coffee(rs);
					list.add(cf);
				}
			}			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		for (Coffee cf : list) {
			System.out.println(cf);
		}
		return list;
	}
	
	// (2) 커피 이름으로 검색한 결과를 리스트 형태로 반환하는 메서드 (LIKE)
	
	public static List<Coffee> searchCoffeename(String cofname) {
		List<Coffee> list = new ArrayList<>();
		String sql = "SELECT * FROM coffee WHERE coffee_name LIKE ?";
		
		try (
			Connection conn = connector.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);
		) {
			pstmt.setString(1, "%" + cofname + "%");
			
			try (
				ResultSet rs = pstmt.executeQuery();
			) {
				while (rs.next()) {
					Coffee cf = new Coffee(rs);
					list.add(cf);
				}
			}			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		for (Coffee cf : list) {
			System.out.println(cf);
		}
		return list;
	}
	
	// (3) 새로운 커피를 추가하는 메서드 (추가 할 때 시퀀스 사용)
	
	public static List<Coffee> insertCoffeeList(String cofname, int price) {
		List<Coffee> list = new ArrayList<>();
		
		String sql = "INSERT INTO coffee VALUES(coffee_seq.nextval, ?, ?)";
		
		try (
			Connection conn = connector.getConnection();
		) {
			try (
				PreparedStatement pstmt = conn.prepareStatement(sql);					
			) {
				pstmt.setString(1, cofname);
				pstmt.setInt(2, price);
				
				int row = pstmt.executeUpdate();
				System.out.printf("%d행 업뎃되었다\n", row);
			}
			
			String sql1 = "SELECT * FROM coffee ORDER BY coffee_id";
			
			try (
				PreparedStatement pstmt = conn.prepareStatement(sql1);	
				ResultSet rs = pstmt.executeQuery();
			) {
				while (rs.next()) {
					Coffee cf = new Coffee(rs);
					list.add(cf);
				}
				
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		for (Coffee cf : list) {
			System.out.println(cf);
		}
		
		return list;
	}
	
	// (4) 이미 존재하는 커피의 정보를 수정할 수 있는 메서드 (기본키는 수정 불가능)
	
	public static List<Coffee> updateListCheck() {
		List<Coffee> list = new ArrayList<>();
		
		String sql = "SELECT COUNT(*) FROM coffee WHERE coffee_name = ?";
		
		boolean isCoffee = false;
		try (
			Connection conn = connector.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);
		) {
			String name = sc.next();
			pstmt.setString(1, name);
			
			try (
				ResultSet rs = pstmt.executeQuery();
			) {
				while (rs.next()) {
					isCoffee = rs.getInt(1) > 0;
					
					if (isCoffee) {
						System.out.println("이미 존재하는 커피 입니다");
					} else {
						System.out.println("없는 커피 입니다, 새로운 행으로 추가해주세요");
						System.out.print("커피이름, 가격 입력>> ");
						String newName = sc.next();
						int newPrice = sc.nextInt();
						insertCoffeeList(newName, newPrice);
					}
					
				}
				
			}
			
			String sql1 = "UPDATE coffee SET coffee_price = ? WHERE coffee_name = ?";
			
			if (isCoffee) {
				try (
					PreparedStatement pstmt1 = conn.prepareStatement(sql1);
				) {
					pstmt1.setString(1, name);
					pstmt1.setInt(2, 1);
				}
				
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return list;
	}
	
	// (5) 커피ID를 매개변수로 전달 받으면 해당 커피를 삭제하고 삭제 여부를 반환해 주는 메서드
	
	public static List<Coffee> deleteList(int cof_id) {
		List<Coffee> list = new ArrayList<>();
		
		try (
			Connection conn = connector.getConnection();
		) {
			String sql = "DELETE FROM coffee WHERE coffee_id = ?";
			try (
				PreparedStatement pstmt = conn.prepareStatement(sql);
			) {
				pstmt.setInt(1, cof_id);
				
				int row = pstmt.executeUpdate();
				System.out.printf("%d행 삭제되었다\n", row);
			}
			
			String sql1 = "SELECT * FROM coffee";
			
			try (
				PreparedStatement pstmt = conn.prepareStatement(sql1);
				ResultSet rs = pstmt.executeQuery();
			) {
				while (rs.next()) {
					Coffee cf = new Coffee(rs);
					list.add(cf);
				}
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		for (Coffee cf : list) {
			System.out.println(cf);
		}
		
		return list;
	}
	
	
	public static void main(String[] args) {
		System.out.println("1) 커피목록");
		getListcoffee();
		
		System.out.println("---------------------------------------------------");
		
		System.out.println("2) 커피이름으로 검색 결과");
		searchCoffeename("카페");
		
		System.out.println("---------------------------------------------------");
		
		System.out.println("3) 새로운커피추가");
//		insertCoffeeList("원조커피", 3000);
		
		System.out.println("---------------------------------------------------");
		
		System.out.println("4) 정보수정");
		
		
		System.out.println("---------------------------------------------------");
		
		System.out.println("5) 커피삭제");
//		deleteList(1);
		
	}
	
}
