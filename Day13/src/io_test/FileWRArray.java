package io_test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWRArray {

	public static void main(String[] args) {

		FileWriter fw = null;
		FileReader fr = null;
		BufferedReader br = null;

		String lo = "D:\\io_test\\";
		String fileName = "fileTest01.txt";

		//파일 생성
		try {
			fw = new FileWriter(lo + fileName);

			String[] names = { "김철수", "이만수", "이영희" };
			int[] ages = { 20, 30, 40 };
			
			for (int i = 0; i < names.length; i++) {
				String data = names[i] + "/" + ages[i] + "\n";
				fw.write(data);
			}

			fw.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//파일 읽기
		try {
			fr = new FileReader(lo + fileName);
			br = new BufferedReader(fr);

			while (true) {
				String str = br.readLine();
				if (str != null) {
					String[] list = str.split("/");
					System.out.println("이름: " + list[0]);
					System.out.println("나이: " + list[1] + "\n");
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
