package test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class GuGuDan {

	
	public static void main(String[] args) {
		
		FileWriter out = null;
		try {
			out = new FileWriter("src/test/files/gugudan.txt");
			
			for (int i = 2; i <= 9; ++i) {
				for (int j = 1; j <= 9; ++j) {
					out.write(i + " x " + j + " = " + i * j + "\t");
				}
				out.write('\n');
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (out != null) {
					out.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		FileReader in = null;
		try {
			in = new FileReader("src/test/files/gugudan.txt");

			int ch;
			while ((ch = in.read()) != -1) {
				System.out.print((char)ch);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
	
}
