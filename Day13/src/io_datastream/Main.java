package io_datastream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {

		// 자료형이 다른 몇 개의 데이터를 파일에 출력했다가 다시 출력하기
		// 필터
		DataInputStream in = null;
		DataOutputStream out = null;

		try {
			// 내용물
			FileOutputStream fos = new FileOutputStream("data.txt");

			// input, output stream 객체가 하나 있어야 한다.
			out = new DataOutputStream(fos);
			out.writeInt(123);
			out.writeDouble(3.14);
			out.writeBoolean(true);
			out.writeBytes("Hello");
			
			out.close();
			
			FileInputStream fis = new FileInputStream("data.txt");
			
			in = new DataInputStream(fis);
			int aint = in.readInt();
			double adouble = in.readDouble();
			boolean aboolean = in.readBoolean();
			
			System.out.println(aint+" "+adouble+" "+aboolean);
			

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
