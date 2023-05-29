package io;

import java.io.File;
import java.io.IOException;

public class FileEx01 {

	public static void main(String[] args) {

		// file 클래스
		File file = new File("test101.txt");

		try {
			// 지정 위치에 파일이 존재하면 false, 존재하지 않으면 true
			// 파일 없으면 생성까지 해줌
			boolean res = file.createNewFile();

			if (res) {
				System.out.println("파일 생성 완료");
			} else {
				System.out.println("기존 파일 있음");
			}
			
			//파일 존재유무
			if(file.exists()) {
			System.out.println();
			
			System.out.println("파일 이름: " + file.getName());
			System.out.println("파일 경로: " + file.getAbsolutePath());
			System.out.println("파일 쓰기권한: " + file.canWrite());
			System.out.println("파일 읽기권한: " + file.canRead());
			System.out.println("파일 크기: " + file.length());
			} else 
				System.out.println("파일이 없습니다.");
			
			//디렉터리 mkdir() : 새 폴더 생성
			file.mkdir();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
