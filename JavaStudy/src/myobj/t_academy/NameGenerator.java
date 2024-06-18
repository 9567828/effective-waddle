package myobj.t_academy;

// 이름 생성기
public class NameGenerator {
	// 다른 클래스에서 사용할 필요가 없는 자원(데이터, 변수등)들을 private으로 숨겨두는 것
	// private로 설정해 두면 함부로 수정하거나 볼 수 없다. getRandomeName으로만 확인할 수 있음
	private String[] lastNamesCandidates = {"김", "이", "박", "최", "안", "한"};
	private String[] firstNamesCandidates = {"영식", "영수", "영철", "영호", "광수", "상철", "영숙", "옥순", "영자", "순자", "정숙", "현숙"};
	
	// 나중에 이름들을 수정할 수 있게 하기 위해서 함수를 만들어준 것
	public void setlastNamesCandidates (String ... lastNames) {
		this.lastNamesCandidates = lastNames;
	}

	public void firstNamesCandidates (String ... firstNames) {
		this.firstNamesCandidates = firstNames;
	}
	
	// 스트링 배열을 만들어서 리턴한다
	// getRandomName을 더 짧게 만드는 방법
	// 다른 클래스에서 사용할 필요가 없는 기능들을 private으로 숨겨놓는다
	private String selectRandomOne(String[] arr) {
		return arr[(int)(Math.random() * arr.length)];
	}
	
	public String generate() {
		return selectRandomOne(lastNamesCandidates)
				+ selectRandomOne(firstNamesCandidates);
	}
	
//	public static String getRandomName() {
//	return lastNamesCandidates[(int)(Math.random() * lastNamesCandidates.length)]
//		   + firstNamesCandidates[(int)(Math.random() * firstNamesCandidates.length)];
//}

}
