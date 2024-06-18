// 24. 05. 16
public class D05_WrapperClass {

	/*
	 	# Wrapper Class
	 	
	 	- 각 기본형 타입에 대한 클래스
	 	- 각 타입에 관련된 유용한 기능들이 해당 클래스에 정의되어 있다
	 	
	 	# 기본형 (primitive type)
	 	
	 	- byte, short, char, int, long, float, double, boolean
	 	
	 	# 참조형 (references type)
	 	
	 	- Byte, Short, Character, Integer, Long, Float, Double, Boolean
	*/
	
	public static void main(String[] args) {
		/*
		 	# 파싱 (Parsing)
		 	
		 	- 문자열을 해당 타입 값으로 변환하는 기능
		 	- 각 클래스마다의 parseXXX이 존재한다		 	
		*/
		
		String value = "88";
		
		// pasreInt(str): 문자열을 int 타입 값으로 변환
		int intValu = Integer.parseInt(value);
		System.out.println("88을 10진법으로 해석한 값 " + intValu);
		
		// parseInt(str, radix): 문자열을 해당 진법으로 해석한 값을 만들어 변환
		int intValu2 = Integer.parseInt(value, 16);
		System.out.println("88을 16진법으로 해석한 값 " + intValu2);
		
		byte byteValue = Byte.parseByte(value);
		float floatValue = Float.parseFloat(value);
		double doubleValue = Double.parseDouble(value);
		
		System.out.println(byteValue);
		System.out.println(floatValue);
		System.out.println(doubleValue);
		
		/*
		 	# toString
		 	
		 	- 각 WrapperClass의 toString()은 해당 타입 값을
		 	  문자열로 변환하여 반환한다
		*/
		
		// WrapperClass 인스턴스를 생성하는 방식 (생성자는 지원 만료 됨 = vlaueOf를 쓰라는 뜻)
		Integer i1 = new Integer(10);
		Integer i2 = Integer.valueOf(10);
		
		// 인스턴스 메서드 toString(): 우리가 알고 있던 Object의 메서드
		// (해당 인스턴스의 문자열 형태를 반환한다)
		String str1 = i2.toString();
		
		System.out.println(str1);
		
		// 해당 타입 값으로 문자열 인스턴스를 생성하여 반환한다
		String str2 = Integer.toString(55555);
		String str3 = Integer.toString(55555, 2);
		
		System.out.println("55555를 10진법으로 해석한 문자열 " + str2); 
		System.out.println("55555를 2진법으로 해석한 문자열 " + str3); 
		
		// 각 타입과 관련된 상수들
		System.out.println("int타입은 몇 바이트? " + Integer.BYTES);
		System.out.println("double타입은 몇 바이트? " + Double.BYTES);
		System.out.println("int의 최대값? " + Integer.MAX_VALUE);
		System.out.println("int의 최소값? " + Integer.MIN_VALUE);
		System.out.println("double의 최대값? " + Double.MAX_VALUE);
		System.out.println("double의 최소값? " + Double.MIN_VALUE);
		
		// Character 타입의 기능들
		System.out.println("'#' 글자인가요? " + Character.isAlphabetic('#'));
		System.out.println("'1' 글자인가요? " + Character.isAlphabetic('1'));		
		System.out.println("'a' 글자인가요? " + Character.isAlphabetic('a'));		
		System.out.println("'A' 글자인가요? " + Character.isAlphabetic('A'));		
		System.out.println("'감' 글자인가요? " + Character.isAlphabetic('감'));
		System.out.println("'+' 글자인가요? " + Character.isAlphabetic('+'));
		
		System.out.println("'d' 대문자 인가요? " + Character.isUpperCase('d'));
		System.out.println("'d' 소문자 인가요? " + Character.isLowerCase('d'));
		
		
		char ch = '김';
		System.out.println(ch + " 영어 인가요? " + (Character.isLowerCase(ch) || Character.isLowerCase(ch)));
		
		System.out.println("공백인가요? " + Character.isWhitespace(' ')); 
		System.out.println("공백인가요? " + Character.isWhitespace('\t')); 
		System.out.println("공백인가요? " + Character.isWhitespace('\n')); 
		System.out.println("공백인가요? " + Character.isWhitespace('\\')); 

		System.out.println("숫자인가요? " + Character.isWhitespace('3')); 
		System.out.println("숫자인가요? " + Character.isWhitespace('ㅁ')); 
		System.out.println("숫자인가요? " + Character.isWhitespace('#')); 

		// Character.getType(ch) : 해당문자의 타입이 무엇인가
		// (타입번호는 Character 클래스 내부에 상수로 선언되어 있다)
		System.out.println("숫자인가요? " + Character.getType('#')); 
		System.out.println("숫자인가요? " + Character.getType('$')); 
		System.out.println("숫자인가요? " + Character.getType('감')); 
		System.out.println("숫자인가요? " + Character.getType('안')); 
		System.out.println("숫자인가요? " + Character.getType('뷁')); 
		System.out.println("숫자인가요? " + Character.getType('a')); 
		System.out.println("숫자인가요? " + Character.getType('z')); 
		System.out.println("숫자인가요? " + Character.getType('H')); 
		System.out.println("숫자인가요? " + Character.getType('A')); 
		
		System.out.println("자바 변수의 맨 앞 문자로 활용할 수 있는 문자인가요? " + Character.isJavaIdentifierStart('3'));
		System.out.println("자바 변수의 맨 앞 문자로 활용할 수 있는 문자인가요? " + Character.isJavaIdentifierStart('ㄱ'));
		System.out.println("자바의 변수로 활용할 수 있는 문자인가요? " + Character.isJavaIdentifierPart('3'));
		System.out.println("자바의 변수로 활용할 수 있는 문자인가요? " + Character.isJavaIdentifierPart(' '));
		System.out.println("자바의 변수로 활용할 수 있는 문자인가요? " + Character.isJavaIdentifierPart('#'));
		System.out.println("자바의 변수로 활용할 수 있는 문자인가요? " + Character.isJavaIdentifierPart('_'));
		System.out.println("자바의 변수로 활용할 수 있는 문자인가요? " + Character.isJavaIdentifierPart('$'));
		
		
		
		
		
	}
}
