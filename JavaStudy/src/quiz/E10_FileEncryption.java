package quiz;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class E10_FileEncryption {
	/*
	 	frankenstein.txt를 시저 암호방식으로 암호화한 새 파일
	 	frankenstein_encrypted.enc를 생성해 보세요
	 	
	 	(1) char 단위로 한 글자씩 암호화 하는 속도를 측정해보기
	 	
	 	(2) char[] 방식으로 암호화 하는 속도를 측정해보기
	 	
	 	(3) Buffered 클래스를 붙여 암호화 하는 속도를 측정해 보기
	 	
	 	(4) 이미 같은 이름의 결과 파일이 경로에 존재한다면 파일의 이름 뒤에 (숫자)를 붙여 다음 파일이 생기게 만들기
	 	    frankenstein_encrypted(1).enc
	 	    frankenstein_encrypted(2).enc
	 	    frankenstein_encrypted(3).enc ...
	*/
	
	public static void main(String[] args) {
		String cryptSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*()-_=+\r\n"
				+ "abcdefghijknmnopqrstuvwxyz {}[]|\\;:'\"/?<>,.";
		int key = 5;
		StringBuilder sb = new StringBuilder();
		
		int a = 0;
		
		File fran = new File("myfiles/frankenstein.txt");
		
		File enc = new File("./myfiles/ceaser/frankenstein_encrypted.enc");
		
		File path = new File("myfiles/ceaser/");
		
		path.getName();
		
		long start, end;
		
		start = System.currentTimeMillis();
		try (
			FileReader in = new FileReader(fran);
			FileWriter out = new FileWriter(enc);
		) {
			int ch;
			while ((ch = in.read()) != -1) {
//				System.out.print((char)ch);
				int index = cryptSet.indexOf(ch);
				
				sb.append(cryptSet.charAt((index + key) % cryptSet.length()));
			
			}
			out.write(sb.toString());
//			System.out.println(sb.toString());
			in.read();
		} catch (IOException e) {
			e.printStackTrace();
		}
		end = System.currentTimeMillis();
		long time1 = end - start;

		start = System.currentTimeMillis();
		try (
				FileReader in = new FileReader(fran);
				FileWriter out = new FileWriter(enc);
		) {
			
			int len;
			char[] buff = new char[in.read()];
			while ((len = in.read(buff)) != -1) {
//				System.out.println(new String(buff, 0, len));
				
				int index = cryptSet.indexOf(len);
				sb.append(cryptSet.charAt((index + key) % cryptSet.length()));
								
			}
			System.out.println(sb.toString());
			in.read();
		} catch (IOException e) {
			e.printStackTrace();
		}
		end = System.currentTimeMillis();
		long time2 = end - start;
		
		start = System.currentTimeMillis();
		try (
			FileReader fin = new FileReader(fran);
			BufferedReader in = new BufferedReader(fin);
		) {
			
//			String text;
//			while ((text = in.readLine()) != null) {
//				System.out.println(text);
			
			int text;
			while ((text = in.read()) != -1) {
//				System.out.print((char)text);
				
				int index = cryptSet.indexOf(text);
				sb.append(cryptSet.charAt((index + key) % cryptSet.length()));
			
			}
//			System.out.println(sb.toString());
			in.read();
		} catch (IOException e) {
			e.printStackTrace();
		}
		end = System.currentTimeMillis();
		long time3 = end - start;
		
		System.out.println("(1)속도: " + time1 + "ms");
		System.out.println("(2)속도: " + time2 + "ms");
		System.out.println("(3)속도: " + time3 + "ms");
		
	}

}
