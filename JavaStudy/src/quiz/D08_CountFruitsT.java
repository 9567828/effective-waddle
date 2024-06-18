package quiz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

// 24. 05. 20
// 풀이

public class D08_CountFruitsT {
	
	// 크기 1000의 String[]을 만들고 다음의 과일들을 무작위로 추가한 후
	// 해당 배열 내부에 각 과일이 몇 개씩 들어있는지 세어서 출력해주쇼
	final public static String[] FRUITS = {"Apple", "Banana", "Orange", "Mango", 
			"kiwi", "Pineaaple", "Peach", "Watermelon", "Grape"};
	
	public static void main(String[] args) {
		String[] randomFruits = new String[1000];
		
		for (int i = 0; i < randomFruits.length; ++i) {
			randomFruits[i] = FRUITS[(int)(Math.random() * FRUITS.length)];
		}
		
		// 과일 9개 x 배열 크기 1000번 = 총 9천번
		for (int i = 0; i < FRUITS.length; ++i) {
			System.out.print(FRUITS[i] + "의 개수: ");
			
			int cnt = 0;
			for (int j = 0; j < randomFruits.length; ++j) {
				if (randomFruits[j].equals(FRUITS[i])) {
					++cnt;
				}
			}
			System.out.println(cnt + "개");
		}
		
		System.out.println("----------------------------");
		
		System.out.println("# Collections.frequency()를 사용");
		
		List<String> randomFruitList = new ArrayList<>(Arrays.asList(randomFruits));
		
		// 과일개수 9개 x frequency로 1천씩 = 총 9천번 검사
		for (int i = 0; i < FRUITS.length; ++i) {
			String fruit = FRUITS[i];
			int count = Collections.frequency(randomFruitList, FRUITS[i]);
			System.out.printf("%s의 개수: %d개\n", fruit, count);
		}
		
		System.out.println("----------------------------");
		System.out.println("HashMap 사용");
		
		HashMap<String, Integer> fruitCount = new HashMap<>();
		
		// 반복을 천번만 수행하면서 모든 과일의 개수를 셀 수 있다
		for (int i = 0; i < randomFruits.length; ++i) {
			String fruit = randomFruits[i];
			
			// 아직 없는 과일이라면 get을 했을 때 null이 나온다
			// 이미 맵에 등록된 적 있는 과일이라면 개수가 나온다
			Integer count = fruitCount.get(fruit);
			
			if (count != null) {
				fruitCount.put(fruit, count + 1);
			} else {
				fruitCount.put(fruit, 1);
			}
		}
		System.out.println(fruitCount);
		
	}

}
