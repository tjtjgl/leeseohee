package io;

import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// InputStream input = null;

		// 문자(텍스트 파일)
		// try 전 미리 변수를 생성해야 함, 안에서 선언 시 try 괄호 실행 후 사라짐
		FileWriter fw = null;

		try {
			
			String lo = "D:\\io_test\\"; // 파일 경로는 변수로 저장해 두는게 좋음
			String fileName = "ex01.txt";

			// 1. 파일 생성
			fw = new FileWriter(lo + fileName);
			// 2. 파일 내용 저장
			fw.write("김철수/10,이영희/30,박민수/50\t오잉");
			fw.write("\n아 졸리다");
			fw.write("\n아아아아");
			// 3. 파일 닫기
			fw.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
