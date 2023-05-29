package method_class;

import java.awt.im.InputContext;
import java.util.Scanner;

class Product {

	int totalPrice;
	double price;
	double tax;

}

public class ProductTest {

	// totalPrice 입력받는 함수

	public static int inputPrice(Scanner sc) {

		System.out.println("전체가격을 입력하세요>");
		int totalPrice = sc.nextInt();

		return totalPrice;

	}

	// 입력받은 값에서 tax와 productPrice 구하는 함수

	public static void calPrice(Product p) {

		p.tax = 0.1;
		p.price = p.totalPrice - (p.totalPrice * p.tax);

		System.out.println("상품 금액은 " + p.price + "원이며 부가가치세는 " + (p.totalPrice * p.tax) + "원 입니다.");
		System.out.println("총 금액은 " + p.totalPrice + "원 입니다.");

	}

	// 전체 정보 출력하는 함수
	public static void showInfo(Product p){
		
		System.out.println("물품가격: "+p.totalPrice);
		System.out.println("세금: "+p.tax);
		System.out.println("물품가격: "+p.price);

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Product p1 = new Product();

		p1.totalPrice = inputPrice(sc);
		calPrice(p1);
		showInfo(p1);

	}

}
