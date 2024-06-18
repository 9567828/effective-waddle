package quiz;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

// 24. 05. 30
// 풀이
public class E09_SaveGameT {
	/*
	  	컴퓨터와 진행하는 간단한 가위바위보 게임을 만든 후
	  	프로그램 종료 시 여태까지의 게임 전적을 파일에 저장해주세요
	  	
	  	프로그램 실행시에는 파일에 저장되어있는 전적 데이터를 읽어 예전 기록이
	  	계속해서 이어지도록 만들어 보세요	  	
	*/
	
	public static void main(String[] args) {
		// 전적 불러오기
		File saveFile = new File("myfiles/rspgame.sav");
		
		int win, draw, lose;
		
		if (!saveFile.exists()) {
			// 파일이 존재하지 않을 때 변수를 초기화 한다
			win = 0;
			draw = 0;
			lose = 0;
		} else {
			// 파일에 있는 전적을 읽어서 저장한다
			try (
				FileInputStream fin = new FileInputStream(saveFile);
				DataInputStream din = new DataInputStream(fin);
			
			) {
				win = din.readInt();
				draw = din.readInt();
				lose = din.readInt();
			} catch (IOException e) {
				e.printStackTrace();
				win = 0;
				draw = 0;
				lose = 0;
			}
		}
		System.out.printf("게임 시작전 불러들인 전적: %d승 %d무 %d패\n", win, draw, lose);
		
		// 게임 진행하기
		Scanner sc = new Scanner (System.in);
		// char타입으로 이모지 값을 활용할 수 있다
		// char[] shapes = {0x270C, 0x270A, 0x270B};
		String[] rps = {"가위✌", "바위✊", "보🖐"};
		for (int i = 0; i < 10; ++i) {
			System.out.print("가위(0), 바위(1), 보(2)> ");
			int user = sc.nextInt();
			int com = (int)(Math.random() * 3);
			
			if (user == com) {
				System.out.printf("무승부이다! (user:%s vs com:%s) \n", rps[user], rps[com]);
				++draw;
			} else if ((user + 1) % 3 == 0) {
				System.out.printf("패배! (user:%s vs com:%s) \n", rps[user], rps[com]);				
				++lose;
			} else {				
				System.out.printf("승리! (user:%s vs com:%s) \n", rps[user], rps[com]);
				++win;
			}
			
		}
	
		System.out.printf("게임이 10번 진행되고 난 후 전적: %d승 %d무 %d패\n",
						win, draw, lose);
		// 전적 저장하기
		
		try (
			FileOutputStream fout = new FileOutputStream(saveFile);
				DataOutputStream dout = new DataOutputStream(fout);
		) {
			dout.writeInt(win);
			dout.writeInt(draw);
			dout.writeInt(lose);
		} catch (IOException e) {
			e.printStackTrace();
		}

		
		
	}
}