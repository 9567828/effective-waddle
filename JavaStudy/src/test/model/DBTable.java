package test.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class DBTable {
	private Integer acc_number;
	private String account_id;
	private Date acc_date;
	
	public DBTable(ResultSet rs) throws SQLException {
		acc_number = rs.getInt("acc_number");
		account_id = rs.getString("account_id");
		acc_date = rs.getDate("acc_date");
	}

	public Integer getAcc_number() {
		return acc_number;
	}

	public void setAcc_number(Integer acc_number) {
		this.acc_number = acc_number;
	}

	public String getAccount_id() {
		return account_id;
	}

	public void setAccount_id(String account_id) {
		this.account_id = account_id;
	}

	public Date getAcc_date() {
		return acc_date;
	}

	public void setAcc_date(Date acc_date) {
		this.acc_date = acc_date;
	}

	@Override
	public String toString() {
		return "DBTable [acc_number=" + acc_number + ", account_id=" + account_id + ", acc_date=" + acc_date + "]";
	}
	
	
	

}
