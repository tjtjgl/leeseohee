package io_program;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

class Account implements Serializable{
	
	String id;
	String pw;
	String name;
	
	public Account(String id, String pw, String name) {
		this.id = id;
		this.pw = pw;
		this.name = name;
	}
	
	public Account(String[] str) {
		this.id = str[0];
		this.pw = str[1];
		this.name = str[2];
	}
	
	@Override
	public String toString() {
		return id +", "+ pw +", "+name;
	}

}

public class MemberMain  {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
		System.out.println("id, pw, 이름 차례대로 입력> ");
		String[] str = sc.next().split(",");
		
	
		Account a1 = new Account("qwer", "1234", "이서희");
		Account a2 = new Account("asdf", "4321", "강건우");
	Account a3 = new Account("zxcv", "1324", "박찬미");
		Account a4 = new Account(str);
		
		ArrayList<Account> list = new ArrayList<>();	
		list.add(a1); list.add(a2); list.add(a3);
	
		FileOutputStream fos = new FileOutputStream("accountlist.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(list);
		
		fos.close();
		oos.close();

		
		FileInputStream fis = new FileInputStream("accountlist.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		list = (ArrayList<Account>) ois.readObject();
		
		for (Account a : list) {
			System.out.println(a);
		}
		
		fis.close();
		ois.close();
		
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
