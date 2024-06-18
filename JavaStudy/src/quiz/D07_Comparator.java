package quiz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class D07_Comparator {

	/*
 	연습1: 복숭아 클래스를 정의해 보세요
 	      복숭아는 가격, 등급, 무게, 농장이름을 필드로 가지고 있다
 	      (등급은 +, -를 매길 수 있음)
 	
 	연습2: 복숭아를 크기 비교가 가능한 객체로 만들어보세요 (무게기준)
 	
 	연습3: 복숭아를 등급기준으로 내림차순 정렬하고 (좋은것이 앞) 등급이 같은경우 가격 기준으로 내림차순 정렬해보세요
 	
 	연습4: 복숭아를 농장이름순으로 오름차순 정렬하고 농장이름이 같은 경우 등급 기준으로 내림차순 정렬해주세요
	 */
	
	public static void main(String[] args) {
		List<Peach> peachs = new ArrayList<>();
		
		peachs.add(new Peach("김씨네농장", 100000, "A-", 1.5));
		peachs.add(new Peach("이씨네농장", 200000, "A+", 2.5));
		peachs.add(new Peach("박씨네농장", 90000, "B-", 1.0));
		peachs.add(new Peach("최씨네농장", 100000, "A+", 1.5));
		peachs.add(new Peach("한씨네농장", 180000, "B-", 2.0));
		peachs.add(new Peach("안씨네농장", 70000, "B", 0.5));
		peachs.add(new Peach("남씨네농장", 80000, "A+", 1.0));
		peachs.add(new Peach("윤씨네농장", 85000, "C", 1.2));
		peachs.add(new Peach("김씨네농장", 120000, "A", 1.0));
		
//		Collections.sort(peachs);

		Collections.sort(peachs, new DescendingOrder());
		
		System.out.println(peachs);
	}

}

class Peach implements Comparable<Peach> {
	String farm;
	int price;
	String grade;
	double weight;
	char[] arr = grade.toCharArray();
	char ch = ' ';
	
	public Peach(String farm, int price, String grade, double weight) {		
		this.farm = farm;
		this.price = price;
		this.grade = grade;
		this.weight = weight;
	}
	
	public char changeWord(String grade) {
		
		for (int i = 0; i < arr.length; ++i) {
			ch = grade.charAt(i);
		}
		
		return ch;
		
	}

	@Override
	public String toString() {
		return String.format("[%s/%d원/%s/%.1fkg]\n", farm, price, grade, weight);
	}

	@Override
	public int compareTo(Peach p) {
		if (this.weight == p.weight) {
			return 0;
		} else if (this.weight > p.weight) {
			return 1;
		} else {
			return -1;
		}
	}
}

class DescendingOrder implements Comparator<Peach> {

	@Override
	public int compare(Peach p1, Peach p2) {
		if(p1.ch == p2.ch) {
			return 0;
		} else if (p1.ch > p2.ch) {
			return -1;
		} else {
			return 1;
		}
	}
	
}
