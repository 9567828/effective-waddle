// 24. 05. 31

public class E13_Thread {

	/*
	
	데몬 쓰레드는 제대로 동작을 안 함
	강사님이 문서 확인해 보고 알려준다고 함
 		
	*/
	
	// 메인은 사실 메인 쓰레드 라고 부른다
	public static void main(String[] args) {
		// 쓰레드 인스턴스를 생성한다
		MyThread t0 = new MyThread(10);
		MyThread t1 = new MyThread(5);
		MyThread t2 = new MyThread(3);
		MyThread t3 = new MyThread(100);
		MyThread t4 = new MyThread(100);
		
		// 메인쓰레드는 다른 쓰레드의 시작 버튼만 눌러주고 코드를 계속 진행한다
		// 동시에 진행이 된다는 의미
		t0.start();
		t1.start();
		t2.start();
		t3.start(); // 메인보다 더 오래 생존해 있는 쓰레드
		
		// 데몬쓰레드: 이 쓰레드를 시작시킨 쓰레드가 끝나면 함께 끝나는 종속쓰레드
		// 데몬으로 설정
		t4.setDaemon(true);
		t4.start(); 
		
		int i = 0;
		while (i++ < 10) {
			System.out.println("Main: " + i);
			
			// 현재 쓰레드를 1초 멈춘다
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}

class AssistThread extends Thread {
	
	int parent;
	
	public AssistThread(int parent) {
		this.parent = parent;
		this.setDaemon(true);
	}
	
	@Override
	public void run() {
		while (true) {
			System.out.printf("%d번 쓰레드의 보조 쓰레드(데몬)입니다...\n", parent);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

// Thread 클래스를 상속받으면 main처럼 동작할 수 있는 쓰레드가 된다
class MyThread extends Thread {
	
	static int totalNumber = 0;
	
	int num;
	int target;
	
	public MyThread(int target) {
		num = totalNumber++;
		this.target = Math.abs(target);
	}
	
	@Override
	public void run() {
		// 보조 쓰레드도 같이 돌아간다
		new AssistThread(num).start();
		
		// 이 쓰레드의 main 같은 곳
		// 메인 쓰레드 또는 다른 쓰레드에서 이 쓰레드를 실행하면 이곳의 코드를 실행한다
		int i = 0;
		while(i++ < target) {
			System.out.printf("Tread%d: %d\n", num, i);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
