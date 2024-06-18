package quiz;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// 24. 05. 28

public class E05_EmailListFile {
	
	// D11번 문제에 있는 기자들의 이메일들로만 이루어진 파일을 myfiles폴더에 생성해보세요
	
	public static void main(String[] args) {
		D11_ReporterListT reportList = new D11_ReporterListT();
		String reporter = reportList.reporters;
		
		Pattern p = Pattern.compile("(.+)\\s+(\\S+)\\s+([가-힣]+)\\s+((\\w*)@(\\w*(\\.\\w+)*))");
		Matcher m = p.matcher(reporter);
		
		FileWriter out = null;
		
		try {
			out = new FileWriter("myfiles/reporterMail.txt");
			
			while (m.find()) {
//				out.write(m.group(0) + '\n');
				out.write(m.group(4) + '\n');
			}
			out.close();
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
			in = new FileReader("myfiles/reporterMail.txt");
			
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
