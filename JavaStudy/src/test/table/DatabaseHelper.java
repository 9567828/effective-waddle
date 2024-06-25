package test.table;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import database.DBConnector;

public class DatabaseHelper {
	static DBConnector connecter = new DBConnector("HR", "1234");
	
	String sql = "SELECT * FROM accessRecord "
			+ "WHERE acc_date >= ? AND acc_date <= ? "
			+ "AND account_id LIKE ? ORDER BY acc_date";
	
    public List<Object[]> getData(String startDate, String endDate, String account) {
        List<Object[]> data = new ArrayList<>();
        
        try (
        	Connection conn = connecter.getConnection();
        	PreparedStatement pstmt = conn.prepareStatement(sql);
        ) {
    		pstmt.setString(1, startDate);
    		pstmt.setString(2, endDate);
    		pstmt.setString(3, account);
    		
    		try (
    			ResultSet rs = pstmt.executeQuery();
    		) {    			
    			int columnCount = rs.getMetaData().getColumnCount();
    			
    			while (rs.next()) {
    				String[] row = new String[columnCount];
    				for (int i = 1; i <= columnCount; i++) {
    					row[i - 1] = rs.getString(i);
    				}
    				data.add(row);
    			}
    		}

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return data;
    }
}