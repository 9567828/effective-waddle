// 24. 05. 16

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class D04_Generic {

	/*
	 	# 제네릭 (Generic)
	 	
	 	- 클래스를 정의할 때 타입을 나중에 지정하겠다고 설정해두는 것
	 	- 제네릭이 사용 된 클래스의 인스턴스 생성시 <>를 통해 제네릭 타입을 지정할 수 있다
	*/
	
	
	public static void main(String[] args) {
		// 제네릭 미설정시 Object 타입이 된다
		GenericClass instance1 = new GenericClass();
		
		// 미설정시에는 아무거나 넣어라~
		instance1.setValue(8080);
		System.out.println(instance1.getValue());
		
		GenericClass<String> instance2 = new GenericClass<>();
		
		instance2.setValue("Cow");
		System.out.println(instance2.getValue());
		
		JiphapTools<String> tools = new JiphapTools<>();
		
		List<String> cars = new ArrayList<>();
		List<String> animals = new LinkedList<>();

		
		Collections.addAll(cars, "마티즈", "소나타", "K5", "스타렉스");
		Collections.addAll(animals, "사자", "호랑이", "곰", "돼지");
		
		System.out.println("### 합집합 ###");
		Set<String> unionResult = tools.union(cars, animals);
		System.out.println(unionResult); 

		
	}
}

// <T> 나중에 타입을 지정하겠다
class GenericClass<T> {
	// T: 인스턴스가 생성되면서 결정되는 타입 (이름은 아무렇게나 정해도 ok)
	T value;
	
	int getNum() {
		return 10;
	}
	
//	T 타입 리턴하는 함수
	T getValue() {
		return value;
	}
	
	void setValue(T value) {
		this.value = value;
	}
}

// 제네릭은 쉼표로 여러개를 만들 수 있다
// 다른 파일에서 새 class를 넣으면 public을 넣을 수 없다
class JiphapTools<E> {
	// 컬렉션 E 타입의 a, b를 전달 받으면 Set으로 돌려주겠다

	// 메서드가 퍼블릭이어도 다른 패키지에서 가져다 쓸 수 없다 because class를 public으로 만들 지 않아서.
	public Set<E> union (Collection<E> a, Collection<E> b) {
		Set<E> unionSet = new HashSet<>();
		
		unionSet.addAll(a);
		unionSet.addAll(b);
		
		return unionSet;
	}
	
	public Set<E> intersection (Collection<E> a, Collection<E> b) {
		Set<E> interSet = new HashSet<>();
		
		interSet.addAll(a);
		interSet.retainAll(b);
		
		return interSet;
	}

	public Set<E> difference (Collection<E> a, Collection<E> b) {
		Set<E> diffSet = new HashSet<>();
		
		diffSet.addAll(a);
		diffSet.retainAll(b);
		
		return diffSet;
	}
	
}


