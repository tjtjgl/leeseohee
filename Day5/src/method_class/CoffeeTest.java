package method_class;

import java.util.ArrayList;
import java.util.Scanner;

class UserCoffee {

	int oderNum;
	String menu;
	String size;
	int price;

}

public class CoffeeTest {

	public static void price(UserCoffee c) {

		String coffeelist[] = { "americano", "cafe moca", "cafe latte", "green tea latte" };
		int prices1[] = { 3900, 4500, 5000, 5500 };

		int index1 = 0;

		for (int i = 0; i < coffeelist.length; i++) {
			if (c.menu.compareTo(coffeelist[i]) == 0) {
				index1 = i;
			}
		}

		c.price = prices1[index1];
		
		String sizelist[] = { "grande", "regular", "short" };
		int prices2[] = { 1000, 500, 0 };

		int index2 = 0;

		for (int i = 0; i < sizelist.length; i++) {
			if (c.size.compareTo(sizelist[i]) == 0) {
				index2 = i;
			}
		}

		c.price += prices2[index2];
		
		System.out.println("총 금액은: " + c.price +"원 입니다.");

		//return c.price;

	}
	
	public static void showInfo(UserCoffee c) {
		System.out.println("주문번호: "+c.oderNum);
		System.out.println("메뉴이름: "+c.menu);
		System.out.println("사이즈: "+c.size);
		System.out.println("가격: "+c.price);
		
	}


	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		UserCoffee c1 = new UserCoffee();

		System.out.println("주문번호 입력>");
		c1.oderNum = sc.nextInt();

		System.out.println("커피종류 입력>");
		c1.menu = sc.next();

		System.out.println("커피사이즈 입력>");
		c1.size = sc.next();
		
		//System.out.println(price(c1)); 
		price(c1);
		showInfo(c1);

	}

}
