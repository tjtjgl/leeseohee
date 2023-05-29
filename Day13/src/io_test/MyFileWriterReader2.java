package io_test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MyFileWriterReader2 {

	public static void main(String[] args) {

		FileWriter fw = null;
		FileReader fr = null;
		BufferedReader br = null;

		//파일 생성
		try {
			fw = new FileWriter("D:\\io_test\\test.txt");
			
			for (int i = 1; i <= 100; i++) {
				fw.write(i + " 번째 줄을 입력하였습니다.\n");
			}
		
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//파일 읽기
		try {
			fr = new FileReader("D:\\io_test\\test.txt");
			br = new BufferedReader(fr);

			while (true) {
				String str = br.readLine();
				if (str != null) {
					System.out.println(str);
				} else {
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
