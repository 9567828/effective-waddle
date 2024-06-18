package database.model;

// 풀이도 똑같이 진행함

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

// 테이블 모양보다는 조회하려는 데이터의 형태만큼
// 모델 클래스가 존재하는 것이 편하다
public class EmpDept {
	
	private Integer department_id;
	private String department_name;
	private Integer dept_manager_id;
	private Integer emp_manager_id;
	private Integer location_id;
	private Integer employee_id;
	private String first_name;
	private String last_name;
	private String email;
	private String phone_number;
	private Date hire_date;
	private String job_id;
	private Double salary;
	private Double commission_pct;
	private String street_address;
	private String postal_code;
	private String city;
	private String state_province;
	private String country_id;
	
	// 풀이에서 빈 생성자 만듬
	public EmpDept() {}
	
	public EmpDept(ResultSet rs) throws SQLException {
		department_id = rs.getInt("department_id");
		department_name = rs.getString("department_name");
		dept_manager_id = rs.getInt("dept_manager_id");
		emp_manager_id = rs.getInt("emp_manager_id");
		employee_id = rs.getInt("employee_id");
		first_name = rs.getString("first_name");
		last_name = rs.getString("last_name");
		email = rs.getString("email");
		phone_number = rs.getString("phone_number");
		hire_date = rs.getDate("hire_date");
		job_id = rs.getString("job_id");
		salary = rs.getDouble("salary");
		commission_pct = rs.getDouble("commission_pct");
		location_id = rs.getInt("location_id");
//		street_address = rs.getString("street_address");
//		postal_code = rs.getString("postal_code");
//		city = rs.getString("city");
//		state_province = rs.getString("state_province");
//		country_id = rs.getString("country_id");
	}

	public Integer getDepartment_id() {
		return department_id;
	}

	public void setDepartment_id(Integer department_id) {
		this.department_id = department_id;
	}

	public String getDepartment_name() {
		return department_name;
	}

	public void setDepartment_name(String department_name) {
		this.department_name = department_name;
	}

	public Integer getDept_manager_id() {
		return dept_manager_id;
	}

	public void setDept_manager_id(Integer dept_manager_id) {
		this.dept_manager_id = dept_manager_id;
	}

	public Integer getEmp_manager_id() {
		return emp_manager_id;
	}

	public void setEmp_manager_id(Integer emp_manager_id) {
		this.emp_manager_id = emp_manager_id;
	}

	public Integer getLocation_id() {
		return location_id;
	}

	public void setLocation_id(Integer location_id) {
		this.location_id = location_id;
	}

	public Integer getEmployee_id() {
		return employee_id;
	}

	public void setEmployee_id(Integer employee_id) {
		this.employee_id = employee_id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}

	public Date getHire_date() {
		return hire_date;
	}

	public void setHire_date(Date hire_date) {
		this.hire_date = hire_date;
	}

	public String getJob_id() {
		return job_id;
	}

	public void setJob_id(String job_id) {
		this.job_id = job_id;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public Double getCommission_pct() {
		return commission_pct;
	}

	public void setCommission_pct(Double commission_pct) {
		this.commission_pct = commission_pct;
	}

//	public String getStreet_address() {
//		return street_address;
//	}
//
//	public void setStreet_address(String street_address) {
//		this.street_address = street_address;
//	}
//
//	public String getPostal_code() {
//		return postal_code;
//	}
//
//	public void setPostal_code(String postal_code) {
//		this.postal_code = postal_code;
//	}
//
//	public String getCity() {
//		return city;
//	}
//
//	public void setCity(String city) {
//		this.city = city;
//	}
//
//	public String getState_province() {
//		return state_province;
//	}
//
//	public void setState_province(String state_province) {
//		this.state_province = state_province;
//	}
//
//	public String getCountry_id() {
//		return country_id;
//	}
//
//	public void setCountry_id(String country_id) {
//		this.country_id = country_id;
//	}

	@Override
	public String toString() {
		return "EmpDept [department_id=" + department_id + ", department_name=" + department_name + ", dept_manager_id="
				+ dept_manager_id + ", emp_manager_id=" + emp_manager_id + ", location_id=" + location_id
				+ ", employee_id=" + employee_id + ", first_name=" + first_name + ", last_name=" + last_name
				+ ", email=" + email + ", phone_number=" + phone_number + ", hire_date=" + hire_date + ", job_id="
				+ job_id + ", salary=" + salary + ", commission_pct=" + commission_pct + "]";
	}

}
