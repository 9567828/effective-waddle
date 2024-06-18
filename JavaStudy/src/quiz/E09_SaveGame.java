package quiz;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

// 24. 05. 30

public class E09_SaveGame {
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
		int com = 0;
		int user = 0;
		
		boolean userWin = false;
		
		try (
				FileWriter out = new FileWriter("myfiles/rpsrecord.txt");
		) 
		{
			while (true) {
				com = (int)(Math.random() * 3);
				System.out.println("가위(0), 바위(1), 보(2)");
				System.out.print("입력>> ");
				user = sc.nextInt();
				int userIndex = user;
			
				if (user < 0 || user > 2) {
					System.out.println("0~2사이의 숫자만 입력해주세요");
				}
				
				if (com == user) {
					out.write("-------------------\n");
					out.write("비겼다" + '\n');
					out.write("user: " + rsp[userIndex] + '\n');
					out.write("com: " + rsp[com] + '\n');
					System.out.println("-----------------");
					System.out.println("비겼다");
					System.out.println("user: " + rsp[userIndex]);
					System.out.println("com: " + rsp[com]);
					userWin = false;
				} else if (com == 0) {
					if (user == 1) {
						out.write("-------------------\n");
						out.write("user승 " + rsp[userIndex] + '\n');
						out.write("com: " + rsp[com] + '\n');
						System.out.println("-----------------");
						System.out.println("user승 " + rsp[userIndex]);
						System.out.println("com: " + rsp[com]);
						userWin = true;
					} else if (user == 2) {
						System.out.println("-----------------");
						System.out.println("com승 " + rsp[com]);
						System.out.println("user: " + rsp[userIndex]);
						out.write("-------------------\n");
						out.write("com승 " + rsp[com] + '\n');
						out.write("user: " + rsp[userIndex] + '\n');
						userWin = false;
					}
				} else if (com == 1) {
					if (user == 0) {
						out.write("-------------------\n");
						out.write("com승 " + rsp[com] + '\n');
						out.write("user: " + rsp[userIndex] + '\n');
						System.out.println("-----------------");
						System.out.println("com승 " + rsp[com]);
						System.out.println("user: " + rsp[userIndex]);
						userWin = false;
					} else if (user == 2) {
						out.write("-------------------\n");
						out.write("user승 " + rsp[userIndex] + '\n');
						out.write("com: " + rsp[com] + '\n');
						System.out.println("-----------------");
						System.out.println("user승 " + rsp[userIndex]);
						System.out.println("com: " + rsp[com]);
						userWin = true;
					}
				} else if (com == 2) {
					if (user == 0) {
						out.write("-------------------\n");
						out.write("user승 " + rsp[userIndex] + '\n');
						out.write("com: " + rsp[com] + '\n');
						System.out.println("-----------------");
						System.out.println("user승 " + rsp[userIndex]);					
						System.out.println("com: " + rsp[com]);
						userWin = true;
					} else if (user == 1) {
						out.write("-------------------\n");
						out.write("com승 " + rsp[com] + '\n');
						out.write("user: " + rsp[userIndex] + '\n');
						System.out.println("-----------------");
						System.out.println("com승 " + rsp[com]);
						System.out.println("user: " + rsp[userIndex]);
						userWin = false;
					}
				}
				
				if (userWin) {
					System.out.println("게임을 끝내시겠습니까? Y/N");
					String answer = sc.next();
					char ch = answer.charAt(0);
					
					if (ch == 'Y' || ch == 'y') {
						System.out.println("프로그램을 종료합니다");
						out.write("user승리로 종료" + '\n');
						out.write("-------------------");
						break;
					}
				}
				
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}
}