// 24.04.23
public class B06_Operator3 {

	/*
	 	# 대입 연산자
	 	
	 	 = : 왼쪽의 변수에 오른쪽의 값을 넣는다 > 원래 있던 값은 덮어쓴다.
	 	
	 	# 복합 대입 연산자
	 	
	 	 += : 왼쪽의 변수에 오른쪽의 값을 더 해서 누적 시킨다
	 	 -= : 왼쪽의 변수에 오른쪽의 값을 빼서 누적 시킨다
	 	 *= : 왼쪽의 변수에 오른쪽의 값을 곱해서 누적 시킨다
	 	 /= : 왼쪽의 변수에 오른쪽의 값을 나눠서 누적 시킨다
	 	 %= : 왼쪽의 변수에 왼쪽의 변수를 오른쪽의 값으로 나눈 나머지를 저장한다(누적시킨다?)
	 	 
	 	 ※ boolean 타입으로 하는 복합 대입 연산
	 	 &= : AND연산을 누적시킨다
	 	 |= : OR 연산을 누적 시킨다
	 	 ^= : XOR 연산을 누적시킨다 > XOR는 두 개가 달라야 true
	 	 
	 	# 단항 연산자
	 	
	 	  ++ : 해당 변수에 1을 더해서 누적 시킨다
	 	  -- : 해당 변수에 1을 빼서 누적 시킨다
	 	
	 	# 단항 연산자 위치에 따른 차이
	 	
	 	 - 단항 연산자가 변수 뒤에 붙어잇는 경우
	 	   해당 줄의 모든 명령을 수행한 후 값을 변화시킨다
	 	   ex> a++, a--
	 	   
	 	 - 단항 연산자가 변수 앞에 붙어있는 경우
	 	   해당 줄의 명령을 시랭하기 전 먼저 값을 변화시킨다
	 	   ex> ++a, --a
	 	
	*/
	
	public static void main(String[] args) {
		
		int a = 10;
		
		System.out.println(a);
		a = 5;
		System.out.println(a); // 원래 있던 값에 덮어 씌워짐
		a = a + 3;
		System.out.println(a);
		a += 2; // a = a + 2;를 줄인 것
		System.out.println(a);
		
		System.out.println("--------------------------");
		
		a = 30;
		
		a += 3;
		System.out.println(a); //33
		a -= 15;
		System.out.println(a); //18
		a *= 3;
		System.out.println(a); //54
		a /= 10.0;
		// 복합 대입 연산은 타입캐스팅을 자동으로 해준다
		// a = (int)(a / 10.0); > 형식을 생략해 준 것
		System.out.println(a); // 7?
		a %= 2;
		System.out.println(a);
		
		System.out.println("--------------------------");
		
		// ()에 값을 전달하면서 대입 연산을 하는 것도 가능하다
		System.out.println(a = 22);
		System.out.println(a += 3);
		// System.out.println(a + 3); a 를 대입하지 않았기 때문에(저장안됨) 결과값으로 나타나지 않는다
		System.out.println(a);
		
		System.out.println("--------------------------");

		// 한명이라도 반대하면 false가 나오게끔 설계
		boolean everyoneAgree = false;
		
		everyoneAgree = everyoneAgree && true;
		everyoneAgree = everyoneAgree && true;
		everyoneAgree = everyoneAgree && false;
		everyoneAgree = everyoneAgree && true;
		everyoneAgree &= true; // 위 연산의 축약형 인 것
		
		
		System.out.println("모두가 동의했나요? " + everyoneAgree);

		System.out.println("--------------------------");

		// int값으로 논리 복합 대입 연산을 하는 경우에는 이진법으로 연산한다 (변수 데이터를 극한으로 아낄 때 bit 연산하는 것)
		int num = 10; // 1010
		
		num &= 3; // 0011
		
		System.out.println(num); // 0010

		System.out.println("--------------------------");

		a = 15;
		a++; // a += 1 축약 함 (a = a + 1 > a +=1 > a++)
		System.out.println(a);
		++a; // 앞 뒤로 위치 상관없이 출력 됨
		System.out.println(a);
		a--;
		System.out.println(a);
		--a;
		System.out.println(a);
		
		System.out.println("--------------------------");

		// ++, --가 붙는 위치에 따라 결과가 달라진다
		a = 10;
		System.out.println(++a); // 세미콜론 전에 더하기를 완료해서 더한 값이 나온다
		System.out.println(a++); // 세미콜론 이 후에 더하기를 완료 하기 때문에 이 줄 이후 출력 때 값이 나옴
		System.out.println(a);
		
	
	}
	
}






