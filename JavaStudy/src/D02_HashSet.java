import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class D02_HashSet {
	/*
		# Set
		
		- 집합 개념을 클래스로 구현해 놓은 자료구조
		- 중복된 값을 허용하지 않는다
		
		# Hash
		
		- 같은 값을 넣으면 항상 같은 결과가 나와야 하는 단방향성 알고리즘
		- 결과값을 통해 원래의 값을 유추하기 매우 힘들어야 한다
		- 알고리즘이 노출 되더라도 다시 원래의 값으로 돌아갈 수 있는 방법이 없어야 한다
		- 해쉬의 결과는 규칙적이지 않기 때문에 순서를 알 수 없다
		
		# java.util.HashSet
		
		- 해쉬 알고리즘을 사용하는 Set
		- 중복된 데이터를 허용하지 않으며 순서가 없다 (index가 없다)
	*/
	
	public static void main(String[] args) {
		Set<String> animals = new HashSet<>();
		
		// set.add(item) : 값을 추가한다
		animals.add("cat");
		animals.add("dog");
		animals.add("camel");
		animals.add("pig");
		animals.add("zebra");
		animals.add("elephant");
		animals.add("elephant");
		animals.add("elephant");
		animals.add("elephant");
		animals.add("elephant");
		animals.add("rhino");
		
		System.out.println(animals);
		
		// Set은 인덱스가 없어서 get()으로 하나씩 값을 출력하는 것이 불가능 하다
		// 반복문을 활용해서 모두 꺼내는 방법 밖에 없다
		
		// forEach : 내용을 하나씩 꺼내면서 반복하는 반복문법
		for (String animal : animals) {
			System.out.println(animal);
		}
		
		int[] numbers = {1, 2, 3, 4, 5, 9, 9, 1};
		
		for (int number : numbers) {
			System.out.println(number);
		}
		
		// remove(value) : index가 없기 때문에 값으로만 삭제할 수 있다
		boolean result = animals.remove("lion");
		System.out.println("삭제여부: " + result);
		System.out.println(animals);
		
		// contains(value) : 포함 되면 true;
		System.out.println("라이언이 있나? " + animals.contains("lion"));
		
		ArrayList<String> otherZoo = new ArrayList<>();
		
		otherZoo.add("악어");
		otherZoo.add("기린");
		otherZoo.add("하마");
		otherZoo.add("기린");
		otherZoo.add("panda");
		otherZoo.add("panda");
		
		System.out.println("다른 동물원" + otherZoo);
		
		// addAll(Collection) : 다른 컬렉션의 모든 내용을 Set에 더한다
		// removeAll(Collection) : 다른 컬렉션에 있는 모든 내용을 제거한다
		// retainAll(Collection) : 두 컬렉션에 모두 포함된 내용만 남긴다
		animals.addAll(otherZoo);
		System.out.println("addAll" + animals);
		
		animals.removeAll(otherZoo);
		System.out.println("removeAll" + animals);

		animals.retainAll(otherZoo);
		System.out.println("retainAll" + animals);
		
		// 컬렉션끼리는 다른 컬렉션으로의 변환이 자유롭다
		// (생성자로 다른 변환을 지원한다)
		HashSet<String> set = new HashSet<>(otherZoo);
		
		System.out.println(set);
		
		ArrayList<String> list = new ArrayList<>(animals);
		
		list.add("악어");
		list.add("악어");
		list.add("악어");
	
		System.out.println(list);
	}
	
	
}
