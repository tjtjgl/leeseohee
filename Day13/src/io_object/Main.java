package io_object;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Member implements Serializable{

	String name;
	int age;

	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return this.name + " " + this.age;
	}
}

public class Main {

	public static void main(String[] args) {

		Member m = new Member("이서희", 30);

		// 자바가 객체 파일을 저장하려면 객체 '직렬화'(바이트 형태로 데이터 변환)
		// '역직렬화' (데이터를 다시 객체로 변화)

		ObjectOutputStream oos = null;
		ObjectInputStream ois = null;

		try {
			// 직렬화
			FileOutputStream fos = new FileOutputStream("object.bin");

			oos = new ObjectOutputStream(fos);

			oos.writeObject(m);

			fos.close();

			// 역직렬화
			ois = new ObjectInputStream(new FileInputStream("object.bin"));
			m = (Member) ois.readObject();
			System.out.println(m);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}



