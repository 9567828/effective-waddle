package quiz;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class D03_Jiphap {
	
	/*
	 	1. 두 컬렉션을 매개변수로 전달 받으면 두 컬렉션의 합집합을 Set으로 반환하는 메서드 union
	 	[1, 2, 3] + [2, 3, 4, 5] => [1, 2, 3, 4, 5]
	 	
	 	2. 두 컬렉션을 매개변수로 전달 받으면 두 컬렉션의 교집합을 Set으로 반환하는 메서드 intersection
	 	[1, 2, 3] 교 [2, 3, 4, 5] => [2, 3]
	 	
	 	3. 두 컬렉션을 매개변수로 전달 받으면 두 컬렉션의 차집합을 Set으로 반환하는 메서드 difference
	 	[1, 2, 3] - [2, 3, 4, 5] => [1]
	 	[2, 3, 4, 5] - [1, 2, 3] => [4, 5]
	*/
	
		
	public static void main(String[] args) {
		
		ArrayList<Integer> list2 = new ArrayList<>();
		
		
		
		Collection<Integer> col1 = new HashSet<>();
		Collection<Integer> col2 = new HashSet<>();
		Collection<Integer> col3 = new HashSet<>();
		Collection<Integer> col4 = new HashSet<>();
		Collection<Integer> col5 = new HashSet<>();
		Collection<Integer> col6 = new HashSet<>();
		Collection<Integer> col7 = new HashSet<>();
		Collection<Integer> col8 = new HashSet<>();
		
		col1.add(1);
		col1.add(2);
		col1.add(3);
		
		col2.add(2);
		col2.add(3);
		col2.add(4);
		col2.add(5);
		
		System.out.println("합집합");
		col1.addAll(col2);
		System.out.println(col1);
		
		col3.add(1);
		col3.add(2);
		col3.add(3);
		
		col4.add(2);
		col4.add(3);
		col4.add(4);
		col4.add(5);
		
		System.out.println("교집합");
		col3.retainAll(col4);
		System.out.println(col3);
		
		col5.add(1);
		col5.add(2);
		col5.add(3);
		
		col6.add(2);
		col6.add(3);
		col6.add(4);
		col6.add(5);
		
		System.out.println("차집합");
		col5.removeAll(col6);
		System.out.println(col5);
		
		col7.add(2);
		col7.add(3);
		col7.add(4);
		col7.add(5);

		col8.add(1);
		col8.add(2);
		col8.add(3);
		
		col7.removeAll(col8);
		System.out.println(col7);
		
	}

}