package io_test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MyFileWriterReader {

	public static void main(String[] args) {

		FileWriter fw = null;
		FileReader fr = null;
		BufferedReader br = null;

		// 파일 생성
		try {
			fw = new FileWriter("D:\\io_test\\test.txt");

			fw.write("ISBN1234 | 쉽게 배우는 JSP 웹 프로그래밍 | 27000 | 송미영 | 단계별로 쇼핑몰을 구현하며 배우는 JSP 웹 프로그래밍 | IT전문서,2018/10/08\n");
			fw.write("ISBN1235 | 안드로이드 프로그래밍 | 33000 | 우재남,실습 단계별 명쾌한 멘토링! | IT전문서,2022/01/22\n");
			fw.write("ISBN220913101957 | 스크래치 | 22000 | 고광일 | 컴퓨팅 사고력을 키우는 블록 코딩 | 컴퓨터입문 | 2019/06/10");

			fw.close();
		} catch (

		IOException e) {
			e.printStackTrace();
		}
	}
}
