package myobj.graduate;

public class DateCalc {
	int year;
	int month;
	int day;
	int days;
	
	public DateCalc (int year, int month, int day, int days) {
		this.year = year;
		this.month = month;
		this.day = day;
		this.days = days;
	}
	
	public int getYear() {
		return this.year;
	}
	
	public int getMonth() {
		return this.month;
	}
	
	public int getDay() {
		return this.day;
	}
	
	public int getDays() {
		return this.days;
	}
}
