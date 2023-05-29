package io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOut0 {

	public static void main(String[] args) {

		String str = "hello Java Programming";

		try {
			// 바이트로 출력하는 스트림 (문자, 동영상, 이미지) 1byte
			File file = new File("ex05.txt");

			if (!file.exists()) {
				file.createNewFile();
			}
			FileOutputStream fos = new FileOutputStream(file);

			byte[] b = str.getBytes();	// 바이트 타입으로 변경 후
			fos.write(b);				// 저장
			
			System.out.println("파일 쓰기 완료");
			
			fos.close();

		} catch (IOException e) {
			System.out.println("파일 예외 발생");
		}

		

	}

}
