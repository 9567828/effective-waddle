// 24.05.08
import myobj.Orange;
public class C06_Extend {

	/*
 		# 클래스 상속
 		
 		- 이미 만들어져 있는 클래스를 그대로 물려 받아 사용하는 문법
 		- 자식 클래스는 부모로부터 모든 변수와 메서드를 그대로 물려받아 그대로 가지고 있다
 		- 자식 클래스는 부모로 부터 물려받은 변수 및 기능을
 		  마음대로 고쳐서 사용할 수 있다 (오버라이드, Override)
 		- 자식 클래스에는 부모 클래스에는 없는 기능을 새로 추가해서 사용할 수 있다
 		- 상속시 자식 클래스 에서는 반드시 부모 클래스의 생성자를 가장 먼저 호출해야 한다
 		
 		# super
 		
 		- 자식 클래스로 생성된 인스턴스의 부모 부분을 의미한다
 		- 자식 클래스에서 this는 자식 클래스 자신만을 이마하낟
 		- 자식 클래스와 부모 클래스에서 같은 이름을 가지고 있는 자원을 구분하기 위해서 사용한다
 		- this()는 현재 클래스의 생성자를 의미하고 super()는 부모클래스의 생성자를 의미한다
	*/
	
	public static void main(String[] args) {
		Wolf w0 = new Wolf();
		Wolf w1 = new Wolf("늑돌이");
		Wolf w2 = new Wolf("늑순이");
		
		w0.pet();
		w1.pet();
		w2.pet();
		
		w0.run();

		// Wolf 클래스를 상속받은 Dog 클래스에 Wolf의 기능이 그대로 들어있다

		Dog d1 = new Dog();
		
		d1.name = "바둑이";
		d1.run();
		d1.pet();
		
		System.out.println("--------------------");
		
		Subway s0 = new Subway();
		Subway s1 = new Subway("7호선", 1400);
		Subway s2 = new Subway("9호선", 2000);		
		
		s1.train();
		s2.train();
		
		User u1 = new User();
		u1.getOnTrain(s1.lineName, s1.trainFee);
		u1.getOnTrain(s2.lineName, s2.trainFee);
		
		Orange o1 = new Orange();
		
	}
	
}

class Wolf {
	String name;
	int age;
	
	public Wolf() {
		name = "이름없는늑대";
	}
	
	public Wolf(String name) {
		this.name = name;
	}
	
	void pet() {
		System.out.printf("늑대(%s, %d세)를 쓰다듬다가 손이 물렸다!\n", this.name, this.age);
	}
	
	void run() {
		System.out.printf("%s가 열심히 달립니다!\n", this.name);
	}
}

class Dog extends Wolf {
	
	int walkDesire = 100;
	String socialID;
	
	public Dog() {
		super("이름없는개");
	}

	public Dog(String name) {
		super(name);
	}
	
	public Dog(String name, String socialID) {
		super(name);
		this.socialID = socialID;
	}
		
	// 부모클래스에 있는 똑같은 이름의 메서드를 자식 클래스에 만들 수 있다
	// 부모클래스의 기능은 상실 되고 자식 클래스가 덮어씌워진다
	void pet() {
		System.out.printf("강아지(%s, %d세)를 쓰다듬었더니 아주 좋아한다!\n", this.name, this.age);		
	}
	
	void walk() {
		System.out.printf("강아지 (%s, %d세)와 함께 산책했다!\n", this.name, this.age);
		walkDesire -= 10;
	}
	
	@Override
	public String toString() {
		return "강아지(" + name + "/" + age + "세)";
	}
	
	// Object는 최상위 클래스이기 때문에 업스캐팅이 된 것이기 때문에 dog클래스의 기능을 넣을 수 없다
	// 다운캐스팅을 진행해야 d1, d2등을 찍어서 socialID를 비교할 수 있다
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Dog)) {
			return false;
		}
		return this.socialID.equals(((Dog)obj).socialID);
	}
	
	@Override
	public int hashCode() {
		// String은 hashcode() 메서드를 오버라이드 해놓은 클래스이다
		return socialID.hashCode();
	}
	
	
}

/*
	상속 관계에 있는 클래스의 예시를 한 번 작성해 보세요
*/
 
class Subway {
	String lineName;
	int trainFee;
	
	public Subway() {
		lineName = "정해지지않은이름";
	}
	
	public Subway(String lineName, int trainFee) {
		this.lineName = lineName;
		this.trainFee = trainFee;
	}
	
	void train() {
		System.out.printf("%s의 요금은 %d입니다\n", this.lineName, this.trainFee);
	}
}

class User extends Subway {
	int users = 0;
	int money = 5000;
	
	void getOnTrain(String lineName, int trainFee) {
		money -= trainFee;
		System.out.printf("탑승한 %s의 요금은 %d원 입니다. 잔액 %d원\n", lineName, trainFee, money);		
	}
}

/*
	풀이
*/
class Building {
	double progress;
	
//	public Building() {} 실제로는 생략 되어져 있는 것
	
	void build () {
		progress += 5.5;
	}
}

class PurchaseBuilding extends Building {
	// 상속받은 자식 클래스는 반드시 부모의 생성자인 super()를 가장 먼저 호출해야 한다
	// 하지만, 기본 생성자는 생략이 가능 하기 때문에 안적는것 처럼 보이는 경우도 있다 -> 빌딩의 생성자를 super로 표현했다는 뜻
	public PurchaseBuilding() {
//		super();
	}
	void purchase() {}
	void sell() {}
}

class UpradeBuilding extends Building {
	void upragde() {
		
	}
}
class CreationBuiling extends Building {
	void create() {
		
	}
}