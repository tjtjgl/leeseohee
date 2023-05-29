package io_program;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

class Account1 implements Serializable {

	String id;
	String pw;
	String name;

	public Account1(String id, String pw, String name) {
		this.id = id;
		this.pw = pw;
		this.name = name;
	}

	public Account1(String[] str) {
		this.id = str[0];
		this.pw = str[1];
		this.name = str[2];
	}

	@Override
	public String toString() {
		return id + ", " + pw + ", " + name;
	}

}

public class MemberMain1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try {

			ArrayList<Account1> list = null;

			FileInputStream fis = new FileInputStream("accountlist.dat");
			ObjectInputStream ois = new ObjectInputStream(fis);

			list = (ArrayList<Account1>) ois.readObject();

			for (Account1 a : list) {
				System.out.println(a);
			}

			fis.close();
			ois.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
