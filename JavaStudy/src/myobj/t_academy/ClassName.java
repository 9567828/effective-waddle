package myobj.t_academy;

public class ClassName {
	String className;
	
	public ClassName(String className) {
		this.className = className;
	}
	
	public String generate() {
		return String.format("%s", className);
	}
}
