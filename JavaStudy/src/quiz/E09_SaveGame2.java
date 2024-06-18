package quiz;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

// 24. 05. 30

public class E09_SaveGame2 {
	/*
	  	컴퓨터와 진행하는 간단한 가위바위보 게임을 만든 후
	  	프로그램 종료 시 여태까지의 게임 전적을 파일에 저장해주세요
	  	
	  	프로그램 실행시에는 파일에 저장되어있는 전적 데이터를 읽어 예전 기록이
	  	계속해서 이어지도록 만들어 보세요
	  	
	  	가위(0) = 바위(1) > 바위 승
	  	가위(0) = 보(2) > 가위 승
	  	바위(1) = 보(2) > 보 승
	  	
	*/
	
	public static String[] rsp = {"가위", "바위", "보"};
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < 10; ++i) {
			int com = (int)(Math.random() * 3);
			System.out.println("가위(0), 바위(1), 보(2)");
			System.out.print("입력>> ");
			int user = sc.nextInt();
		
			if (user < 0 || user > 2) {
				System.out.println("0~2사이의 숫자만 입력해주세요");
			}
			
			if (com == user) {
				System.out.println("-----------------");
				System.out.println("비겼다");
				System.out.println("user: " + rsp[user]);
				System.out.println("com: " + rsp[com]);
			} else if (com == 0) {
				if (user == 1) {
					System.out.println("-----------------");
					System.out.println("user승 " + rsp[user]);
					System.out.println("com: " + rsp[com]);
				} else if (user == 2) {
					System.out.println("-----------------");
					System.out.println("com승 " + rsp[com]);
					System.out.println("user: " + rsp[user]);
				}
			} else if (com == 1) {
				if (user == 0) {
					System.out.println("-----------------");
					System.out.println("com승 " + rsp[com]);
					System.out.println("user: " + rsp[user]);
				} else if (user == 2) {
					System.out.println("-----------------");
					System.out.println("user승 " + rsp[user]);
					System.out.println("com: " + rsp[com]);
				}
			} else if (com == 2) {
				if (user == 0) {
					System.out.println("-----------------");
					System.out.println("user승 " + rsp[user]);					
					System.out.println("com: " + rsp[com]);
				} else if (user == 1) {
					System.out.println("-----------------");
					System.out.println("com승 " + rsp[com]);
					System.out.println("user: " + rsp[user]);
				}
			}
			
		}
		
		
		
	}
}