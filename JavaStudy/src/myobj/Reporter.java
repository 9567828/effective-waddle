package myobj;

public class Reporter {
	String name;
	String company;
	String field;
	String email;
	
	public Reporter(String name, String company, String field, String email) {
		this.name = name;
		this.company = company;
		this.field = field;
		this.email = email;
	
	}
	
	public String getCompnay() {
		return this.company;
	}
	
	public String getField() {
		return this.field;
	}
	
	public void printField() {
		System.out.printf("%s 기자 / %s / %s\n", name, company, email);
	}
	
	@Override
	public String toString() {
		return String.format("%s 기자 / %s / %s / %s", name, company, field, email);
		
	}
}
