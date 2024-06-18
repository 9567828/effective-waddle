// 24.05.03

import java.util.Scanner;

public class C02_OOP {

	/*
		# 객체 지향 프로그래밍 (Object Oriented Programming)
		
		- 변수와 함수들을 무분별하게 사용하다 보니 정신없어서 생겨난 방식
		- 변수와 함수들을 세상에 실제로 존재하는 개념(객체)으로 묶어서 생각하면
		  프로그램의 유지보수 및 가독성 측면에서 도움이 된다
		- 객체 내부의 변수는 현재 상태를 나타내고 
		  객체 내부의 함수(메서드(method))는 해당 객체의 기능 및 동작을 나타낸다
		  
		  ex : 책
		  
		  - 책의 현재 상태를 변수로 표현한 것 :
		  	현재 펼쳐진 페이지, 책의 최대 페이지, 책의 커버 재질, 
		  	작가이름, 작가의 영어이름, 책의 가격...
		  
		  - 책의 기능 및 동작을 메서드로 표현한 것 :
		  	다음 페이지로 넘기기(현재 페이지를 +1), 원하는 페이지 펼치기, 구매하기, 첫 페이지로 가기...
		  	책의 원하는 페이지를 찢기 (변수의 최대페이지가 변하게 되는 것)
		  	
		 # 클래스 (Class)
		 
		 - 객체지향 프로그래밍에서 의미하는 객체를 프로그래밍 언어로 표현하는 문법
		 - 클래스는 정의한 시점에서는 실체가 없는 객체의 설계도이다
		 - 클래스를 통해 만들어내는 실체를 ★(중요)인스턴트(instance)라고 부른다
		 - 설계도로 제품(인스턴스)을 만들어낼 수 있다
	*/
	
	public static void main(String[] args) {
		// Book이라는 설계도를 통해 실체(인스턴스)를 찍어내야 사용할 수 있따
		// new를 통해 인스턴스를 찍어낼 때 마다 메모리상에 필요한 만큼의 공간을 확보한다
		Book b1 = new Book();
		Book b2 = new Book();
		Book b3 = new Book();
//		Book[] books = new Book[100];
//		스캐너의 인스턴스를 사용하고 있었던 것이다 > new Scanner
//		Scanner sc = new Scanner(System.in);
		
		// Math도 클래스이지만 인스턴스를 사용하지 않는 예외적 요소
		// (.) 은 각 클래스당 인스턴스의 경로를 불러오는 의미
		Math.abs(0);
		
		b1.currentPage = 130;
		b2.currentPage = 13;
		b3.currentPage = 0;
		
		b1.totoalPage = 200;
		b2.totoalPage = 80;
		b3.totoalPage = 1000;
		
		for (int i = 0; i < 1000; ++i) {
			b1.nextpage();
		}
		
		
		Movie m1 = new Movie();
		Movie m2 = new Movie();
		Movie m3 = new Movie();
		
		m1.audience = 500;
		m2.audience = 20;
		m3.audience = 30;

		m1.price = 15000;
		m2.price = 20000;
		m3.price = 18000;
		
		m1.breakEvenPoint = 10_000_000;
		m2.breakEvenPoint = 20_000_000;
		m3.breakEvenPoint = 20_000_000;
		
		m1.releasedTheater = 30;
		m2.releasedTheater = 20;
		m3.releasedTheater = 100;
		
		m1.showingDate = 30;
		m2.showingDate = 20;
		m3.showingDate = 50;
		
		for (int i = 0; i < m1.showingDate; ++i) {
			m1.totalAudience();
		}
		
		for (int i = 0; i < m1.showingDate; ++i) {
			m1.getTotalPrice();
		}
		
		Cafe c1 = new Cafe();
		Cafe c2 = new Cafe();
		
		c1.changeName("빽다방");
		c2.changeName("메가커피");
		
		c1.addMenu("아메리카노", 10, 2000);
		c1.addMenu("빽스라떼", 10, 2000);
		
		c2.addMenu("아메리카노", 10, 1800);
		
		
		System.out.println("-------------------카페1-----------------------");
		c1.printCafeInfo();
		System.out.println("-------------------카페2-----------------------");
		c2.printCafeInfo();
		
		
		// 찍어낸 실체마다 변수의 현재 상태가 다르다
		System.out.println("------------------------------------------");
		System.out.println("책1의 현재 페이지: " + b1.currentPage);
		System.out.println("책2의 현재 페이지: " + b2.currentPage);
		System.out.println("책3의 현재 페이지: " + b3.currentPage);

		System.out.println("------------------------------------------");

		System.out.println("movie1 누적관객: " + m1.audience);
		System.out.println("movie1 누적금액: " + m1.getTotalPrice());
		System.out.println("movie1 손익분기점 넘었나?: " + m1.isbreakEvenPoint());
		System.out.println("movie2 관객: " + m2.audience);
		System.out.println("movie3 관객: " + m3.audience);
		
	}
}

// 생각한 객체를 프로그래밍 언어로 표현한 것을 클래스라고 한다
class Book {
	int currentPage;
	int totoalPage;
	int typeOfCover;
	String authorName;
	String authorEngName;
	
	// 메서드
	// this: 나중에 생성될 인스턴스 자기 자신을 의미하는 키워드
	// 나중에 > 위에 b1, b2를 예로 들어서 this가 b1혹은 b2가 될 수 있다.
	// this는 자신의 인스턴스의 요소들을 가리킬 때 사용 (아래는 this. 생략 된 표현)
	void nextpage() {
		if(currentPage < totoalPage) {
			++currentPage;
		}
	}
}

/*
 	실제로 존재하는 객체를 하나 참조하여 클래스를 생성한 후 테스트 해보세요
 	(책 금지, 변수 세개 이상)
*/

class Movie {
	int audience;
	int price;
	int totalPrice;
	int releasedTheater;
	int showingDate;
	int breakEvenPoint;
	String directorName;
	String actorName;
	
	void totalAudience() {
		if(audience > showingDate) {
			++audience;
		}
	}
	
	int getTotalPrice() {
		return totalPrice = audience * price * releasedTheater;
	}
	
	boolean isbreakEvenPoint() {
		return breakEvenPoint < totalPrice ? true : false;
	}	
}

// 예시
class Cafe {
	// 나중에 인스턴스 생성시의 기본값을 설정해놓을 수 있다
	String name = "기본카페이름";
	int area = 10;
	int seat = 20;
	int table = 5;
	CafeMenu[] menu = new CafeMenu[5];
	// 스트링(참조형)은 class이며, 인스턴스를 생략하고 출력할 수 있다
	int menuCount = 0;
	
	// this를 넣어주면 나의 인스턴스 변수에 들어가겠다 라는 의미.
	// this가 없으면 메소드의 매개변수를 넣을 것인지 뭔지 알 수 없음
	// 매개변수명과 인스턴스 변수명이 같은경우 this를 활용해 구분해 줄 수 있다.
	void changeName(String name) {
		this.name = name;
	}
	
	void printCafeInfo() {
		System.out.printf("카페이름: %s\n", this.name);
		System.out.printf("카페면적: %s\n", this.area);
		System.out.printf("카페좌석수: %s\n", this.seat);
		System.out.printf("카페테이블: %s\n", this.table);
		
		System.out.println("### 메뉴판 ###");
		for (int i = 0; i < menu.length; ++i) {
			if(menu[i] != null) {
				System.out.printf("- %s : %d(%dkcal)\n", menu[i].name, menu[i].price, menu[i].calories);				
			} else {
				System.out.println(menu[i]);
			}
		}
	}
	
	void addMenu(String name, int calories, int price) {
		CafeMenu toAdd = new CafeMenu();
		
		toAdd.name = name;
		toAdd.calories = calories;
		toAdd.price = price;
		
		
		this.menu[this.menuCount++] = toAdd;
	}
}

// 카페 메뉴를 나열하기 위해서 추가로 class를 생성한다
class CafeMenu {
	String name;
	int calories;
	int price;
}
