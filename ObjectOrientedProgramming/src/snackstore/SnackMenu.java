package snackstore;

import java.util.Scanner;

public class SnackMenu {
	
	void menu() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("스낵류를 입력하세요> ");
		System.out.println("종류 : ");
		String kind = sc.next();
		System.out.println("이름 : ");
		String name = sc.next();
		System.out.println("맛 : ");
		String flavor = sc.next();
		System.out.println("개수 : ");
		int numOf = sc.nextInt();
		System.out.println("가격 : ");
		int price = sc.nextInt();
		
		SnackController sn1 = new SnackController();
		
		sn1.saveData(kind, name, flavor, numOf, price);
		
		sn1.confirmData();
		
		
	}
	
	
	
}
