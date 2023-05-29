package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInput {

	public static void main(String[] args) {

		try {
			// 바이트로 출력하는 스트림 (문자, 동영상, 이미지) 1byte
			File file = new File("구구단.txt");

			if (!file.exists()) {
				file.createNewFile();
			}
			
			FileInputStream fos = new FileInputStream(file);
			
			// null 나오기 전까지 읽어오기
			// read() 데이터 읽을 수 없다 -1
			int i = 0;
			
			while((i = fos.read()) != -1) {
				System.out.print((char)i); //바이트를 문자로 변환
			}
			fos.close();
			
		} catch (IOException e) {
			System.out.println("파일 예외 발생");
		}

	}

}
