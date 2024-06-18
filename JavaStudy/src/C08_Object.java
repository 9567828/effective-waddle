// 24. 05. 09
// 클래스 위에 커서 놓고 F3 누르면 해당 클래스로 이동함

import myobj.Apple;

public class C08_Object {

	/*
 		# Object class
 		
 		- 모든 클래스들의 최고 조상 클래스
 		- 자바에 존재하는 모든 객체는 object 클래스의 자손이다
 		- Object 클래스의 메서드는 모든 클래스 내부에 이미 상속받아져 존재하고 있다
 		- Object 클래스의 메서드는 주로 해당 클래스에 맞는 형태로
 		  오버라이드 하여 사용하게끔 설계되어 있다
 		  
 		# toString()
 		
 		- "해당 객체를 문자열로 표현한다면 어떤 모양이어야 하는가"를 정의해두는 메서드
 		- 자바의 모든 객체는 toString()을 통해 문자열로 표현될 수 있따
 		- object 클래스에 정의되어 있는 toString() 메서드의 원형은 해당 클래스의 이름과
 		  메모리상의 주소값을 출력하게 되어있다
 		- toString() 기본 동작이 싫다면 해당 메서드를 오버라이드하여 사용하면 된다
 		
 		# equals (obj)
 		
 		- "두 인스턴스가 같다고 판정하는 기준은 무엇인가"를 정의해두는 메서드
 		- 매개변수로 전달 받은 인스턴스와 현재 인스턴스(this)를 비교하여 결과를 리턴한다
 		- Object 클래스에 정의되어있는 기본 동작은 두 인스턴스가 같은 인스턴스인지를
 		  비교하게끔 만들어져 있다
 		
 		# hashcode()
 		
 		- "해당 객체를 유일하게 구분할 수 있는 값은 무엇인가"를 정의해두는 메서드
 		- 해당 인스턴스의 지문 같은 역할을 하는 메서드
 		- Object 클래스에 정의되어있는 기본 동작은 해당 인스턴스의 
 		  주소값을 리턴하게끔 구현되어 있다
	*/
	
	public static void main(String[] args) {
		Wolf w1 = new Dog("춘식이");
		Object o1 = new Dog("몽실이");
		Dog d1 = new Dog("춘자", "1234");
		Dog d2 = new Dog("춘자", "3456");
		Dog d3 = new Dog("진돌이", "1234");
		
		// dog에 toString 오버라이드 한 결과가 나타나는 것
		System.out.println(d1.toString());
		System.out.println(o1.toString());
		
		// System.out.println(); 은 사실 해당 인스턴스의 toString()을 호출하여
		// 콘솔에 출력하는 메서드이다
		// 아래는 toString 메서드 구현 한 것을 이용하여 출력 되는 것
		System.out.println(d2);
		System.out.println(o1);
		System.out.println(w1);

		System.out.println("----------------------------");
		
		// equals 구분 제 기능을 못 하는 상태
		// Dog클래스에서 equals 클래스를 새로 구현함
		System.out.println(d1.equals(d2));
		System.out.println(d1.equals(d3));
		// equals는 object라서 아무거나 들어갈 수 있다
		// Dog클래스에서 equals 클래스를 수정함
		System.out.println(d1.equals(123));
		System.out.println(d1.equals(new Apple()));
		
		System.out.println("----------------------------");

		System.out.println(d1.hashCode());
		System.out.println(d2.hashCode());
		System.out.println(d3.hashCode());

		System.out.println("----------------------------");
		
		// String은 hashCode()가 구현되어 있는 클래스이기 때문에
		// hashCode()메서드 실행 시 메모리 주소대신 문자열 값에 기반한 숫자값이 생성된다
		String str1 = new String("abcd");
		String str2 = new String("Hello everyone, my name is kim");
		String str3 = new String("Hello everyone my name is kim");
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str3.hashCode());
		
		System.out.println("----------------------------");

		Employee c1 = new Employee("아무개", "20240506-01", "개발팀");
		Employee c2 = new Employee("홍길동", "20231228-10", "총무팀");
		Employee c3 = new Employee("아무개", "20200605-05", "운영팀");

		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
		System.out.println(c1.equals(c3));
		System.out.println(c1.hashCode());
	}
	
}


/*
 	toString(), equals(), hashCode()를 모두 활용할 만한
 	적절한 클래스를 하나 설계해 보세요
*/

class Employee {
	String departmentName;
	String employeeID;
	String employeeName;
	
	public Employee(String employeeName, String employeeID, String departmentName) {
		this.employeeName = employeeName;
		this.employeeID = employeeID;
		this.departmentName = departmentName;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Employee)) {
			return false;
		}
		return this.employeeID.equals(((Employee)obj).employeeID);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "직원 " + employeeName + "(사원번호: " + employeeID + ") 부서는 " + departmentName + "입니다.";
	}
	
	@Override
	public int hashCode() {
		return employeeID.hashCode();
	}
}