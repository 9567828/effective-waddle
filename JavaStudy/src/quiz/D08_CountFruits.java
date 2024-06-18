package quiz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// 24. 05. 20

public class D08_CountFruits {
	
	// 크기 1000의 String[]을 만들고 다음의 과일들을 무작위로 추가한 후
	// 해당 배열 내부에 각 과일이 몇 개씩 들어있는지 세어서 출력해주쇼
	final public static String[] FRUITS = {"Apple", "Banana", "Orange", "Mango", 
			"kiwi", "Pineaaple", "Peach", "Watermelon", "Grape"};
	
	public String inputFruits(String[] arr) {
		return arr[(int)(Math.random() * FRUITS.length)];
	}
	
	public String fruitsList() {
		return inputFruits(FRUITS);
	}
	
	public static void main(String[] args) {
		D08_CountFruits fruit = new D08_CountFruits();
		List<String> fruitList = new ArrayList<>();
		Collections.addAll(fruitList, FRUITS);
		
		String[] arr = new String[1000];

		
		int cnt = 0;
		
//		for (int i = 0; i < arr.length; ++i) {
//			arr[i] = fruit.fruitsList();
//		}
		
		for (int i = 0; i < arr.length; ++i) {
			
		}
		
		System.out.println(Arrays.toString(arr));
		
		
		
	}

}
