package io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOut {

	public static void main(String[] args) {

		try {
			// 바이트로 출력하는 스트림 (문자, 동영상, 이미지) 1byte
			File file = new File("구구단.txt");

			if (!file.exists()) {
				file.createNewFile();
			}
			
			FileOutputStream fos = new FileOutputStream(file);

			for (int i = 2; i < 10; i++) {
				for (int j = 1; j < 10; j++) {
					String str = i + " X " + j + " = " + (i * j) + "\n";
					byte[] b = str.getBytes();
					fos.write(b);
				}
			}

			System.out.println("파일 쓰기 완료");
			
			fos.close();
			
		} catch (IOException e) {
			System.out.println("파일 예외 발생");
		}

	}

}
