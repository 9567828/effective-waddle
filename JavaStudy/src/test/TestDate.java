package test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TestDate {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		
		System.out.print("입력>> ");
		String date = sc.next();
		
		Date d = null;
		try {
			d = dateFormat.parse(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		System.out.println(d);
		
		
	}

}
