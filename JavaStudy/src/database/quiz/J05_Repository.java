package database.quiz;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import database.DBConnector;
import database.model.EmpDpt;

public class J05_Repository {

	/*
		(1) 도시 이름을 매개변수로 전달하면 해당 도시에서 근무하는 사원들의
		    모든 사원 정보(employees)와 부서 정보(departments)를 JOIN한 모든 정보를 리스트 형태로 반환하는 메서드
		
		(2) 부서명을 매개변수로 전달하면 해당 부서의 모든 사원 정보와 직책 정보가 조회되는 메서드
			(employees와 jobs를 JOIN한 모든 정보)
	*/
	
	static DBConnector connector = new DBConnector("hr", "1234");
	
	public static void employeesInfo(String cityname) {
		
		String sql = "SELECT * FROM employees INNER JOIN departments USING (department_id) INNER JOIN locations USING (location_id) WHERE lower(city) = ?";
		List<EmpDpt> emdp = new ArrayList<>();
		
		try (
			Connection conn = connector.getConnection(); 
		) {
//			 풀이 따라
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, cityname);
			
			try (
				ResultSet rs = pstmt.executeQuery();
			) {
				while (rs.next()) {
				EmpDpt getinfo = new EmpDpt(rs);
				emdp.add(getinfo);
				}
			}
			
//			내가 풀어서 안된거
//			try (
//				PreparedStatement pstmt = conn.prepareStatement(sql);
//			) {
//				pstmt.setString(1, cityname);
//				
//				// 여기는 내가 해서 안된 곳
//				ResultSet rs = pstmt.executeQuery();
//				
//				while (rs.next()) {
//					Emp_dpt getinfo = new Emp_dpt(rs);
//					emdp.add(getinfo);
//				}
//			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		
		for (EmpDpt ed : emdp) {
			System.out.println(ed);
		}
	}
	
	public static void main(String[] args) {
		employeesInfo("seattle");
	}
	
}
