package io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MyFileReader {

	public static void main(String[] args) {

		// =========파일 읽기=========

		FileReader fr = null;
		BufferedReader br = null; // 중간 버퍼 생성(임시 저장 공간)

		try {

			// 1. 객체 생성
			fr = new FileReader("D:\\io_test\\ex01.txt");
			br = new BufferedReader(fr); // FileReader와 버퍼를 연결

			// 자식 클래스들이 구현해야할 read 추상 메서드
			// 바이트 하나를 읽어서 int로 반환하되, 더 이상 읽을 값이 없으면 -1을 리턴
			// -> String str = fr.read(); 불편함

			// 2. 파일 읽기
			//String str;

			while (true) {
				String str = br.readLine();
				if (str != null) {
					System.out.println(str);
				} else {
					// 3. 같이 닫기
					fr.close();
					br.close();
					return;
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
