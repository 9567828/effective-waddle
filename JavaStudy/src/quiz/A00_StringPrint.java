package quiz;

import java.util.Scanner;

public class A00_StringPrint {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        
	        System.out.print("입력하시오> ");
	        
	        String a = sc.next();
	        String srt = a;
	        
	        if(a.equals("HelloWorld!")) {
	        	System.out.println(srt);
	        } else {
	        	System.out.println("땡");
	        }
	        
	        
	    }
	
}
