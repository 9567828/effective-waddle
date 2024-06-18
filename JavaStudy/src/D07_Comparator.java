// 24. 05. 17

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class D07_Comparator {

	/*
		# Comparable
		
		- 이 인터페이스를 구현한 클래스는 크기 비교가 가능해진다
		- compareTo() 메서드를 구현해두면 크기 비교가 필요한 상황에서
		  해당 메서드를 호출해 크기를 비교할 수 있게 된다
		
		# Comparator
		
		- 이 인터페이스를 구현한 클래스는 크기 비교의 기준이 된다
		- 이 인터페이스를 구현한 클래스의 인스턴스를 정렬의 기준으로 함께 전달할 수 있다
	*/
	
	public static void main(String[] args) {
		// Wrapper 클래스들은 Comparable이 이미 구현되어 있으므로
		// CompareTo() 메서드를 직접 구현할 필요가 없다
		List<Integer> nums = new ArrayList<>();
		List<String> contries = new ArrayList<>();
		
		Collections.addAll(nums, 88, 89, 90, 15, 10, 11, 12, 13, 10, 99);
		Collections.sort(nums);
		System.out.println(nums);
		
		Collections.addAll(contries, "가나", "한국", "영국", "미국", "일본", "중국");
		Collections.sort(contries);
		System.out.println(contries);
		
		List<Grape> grapes = new ArrayList<>();
		
		grapes.add(new Grape("김씨네농장", 33, 5.8, "A+"));
		grapes.add(new Grape("박씨네농장", 28, 8.1, "B+"));
		grapes.add(new Grape("이씨네농장", 40, 6.5, "A-"));
		grapes.add(new Grape("한씨네농장", 35, 5.4, "B-"));
		grapes.add(new Grape("안씨네농장", 35, 7.8, "C"));
		grapes.add(new Grape("최씨네농장", 35, 7.7, "A"));
		grapes.add(new Grape("최씨네농장", 20, 8.8, "B"));
		
		// sort()를 할 수 있으려면 리스트에 속한
		// 모든 요소들이 Comparable이 구현 되어 있어야 한다
		// Collections.sort(grapes);
		
		// Comparator를 함께 전달하면 Comparable의 compareTo() 대신
		// Comparator의 compare()를 사용하여 정렬한다
		// 내림차순 정렬한 것
		Collections.sort(grapes, new 포도분류기_당도기준내림차순());
		
		
		// Comparator 구현 받은 익명의 분류기를 전달한다
		// 오름차순 정렬
		Collections.sort(grapes, new Comparator<Grape>() {
			@Override
			public int compare(Grape g1, Grape g2) {
//				if문과 동일하게 동작하는 문법, 아래는 double로 선언된 변수라서 제대로 동작하지 못해서 주석처리함.
//				return (int)Math.ceil(g1.sweet - g2.sweet);
				if (g1.sweet == g2.sweet) {
					return 0;
				} else if (g1.sweet > g2.sweet) {
					return 1;
				} else {
					return -1;
				}
			}
		});
		
		System.out.println(grapes);
	}
	
}

// Comparable 인터페이스를 구현한 클래스는 각 인스턴스끼리의 크기 비교가 가능해진다
// (-> 정렬이 가능해 진다)
class Grape implements Comparable<Grape> {
	String farm;
	int qty;
	double sweet;
	String grade;
	
	public Grape(String farm, int qty, double sweet, String grade) {
		this.farm = farm;
		this.qty = qty;
		this.sweet = sweet;
		this.grade = grade;
	}
	
	@Override
	public String toString() {
		return String.format("[%s/%d알/%.1f/%s]\n", farm, qty, sweet, grade);
	}

	@Override
	public int compareTo(Grape g) {
		// 현재 인스턴스와 매개변수로 전달 받은 인스턴스를 비교하였을 때 
		// 어떤 것이 더 크다고 판정할 것인지 정해야 한다
		
		// 두 인스턴스의 크기가 같다 : 0을 리턴 
		// 현재(this) 인스턴스의 크기가 더 크다(리스트의 뒤쪽에 있었으면 좋겠다) : 1을 리턴
		// 매개변수(g) 인스턴스의 크기가 더 크다(리스트의 앞쪽에 있었으면 좋겟다) : -1을 리턴
		
		// 예시: 포도알 개수를 기준으로 두 인스턴스의 크기를 비교
		if (this.qty == g.qty) {
			// 포도알 개수가 같으면 당도를 기준으로 크기를 비교해준다
			if (this.sweet == g.sweet) {
				return 0;
			} else if (this.sweet > g.sweet) {
				return 1;
			} else {
				return -1;
			}
		} else if (this.qty > g.qty) {
			return 1;
		} else {
			return -1;
		}
	}
	
}

// 내림차순 정렬 : 큰게 먼저 나오는 것
// 오름차순 정렬 : 작은게 먼저 나오는 것
class 포도분류기_당도기준내림차순 implements Comparator<Grape> {
	@Override
	public int compare(Grape g1, Grape g2) {
		// 왼쪽것이 더 클 때(g2) (왼쪽것이 뒤쪽에 나오고 싶을 때) : 1
		// 오른쪽 것이 더 클 때(g1) (오른쪽 것이 뒤쪽에 나오고 싶을 때) : -1
		// 두 인스턴스의 크기가 같을 때 : 0
		if (g1.sweet == g2.sweet) {
			return 0;
		} else if (g1.sweet > g2.sweet) {
			// 크기가 더 클 때 뒤로 보내지는 것
			return -1;
		} else {
			return 1;
		}
	}
	
}