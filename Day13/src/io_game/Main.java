package io_game;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Main {
	
	static void save (int score) {
		try {
			FileWriter fw = new FileWriter("scorelist.txt", true);
			fw.write("점수: " + score + "\n");
			fw.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Random ran = new Random();

		int com = ran.nextInt(100) + 1;
		int score = 100;

		// 100점에서 정답을 맞출 때 까지 5점 차감
		// scorelist.txt 파일을 만들어서 점수 저장

		while (true) {
			System.out.println("숫자 입력[1~100] : ");
			int me = scan.nextInt();

			if (com > me) {
				System.out.println("Up!");
				score -= 5;
			} else if (com < me) {
				System.out.println("Down!");
				score -= 5;
			} else if (com == me) {
				System.out.println("Bingo!");
				save(score);		
				return;
			}
		}
	}
}
