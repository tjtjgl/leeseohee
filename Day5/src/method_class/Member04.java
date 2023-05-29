package method_class;

import java.util.Scanner;

class Objection2 {

	String obj;
	int pay;

}
public class Member04 {

	public static void trainPrint(Objection2 obj) {
		System.out.println("===예매정보===");
		System.out.println("목적지: " + obj.obj);
		System.out.println("운임비: " + obj.pay);
	}
	
	public static Objection2 objectInput() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("목적지와 운임비 입력>");
		String obj = sc.nextLine();
		int pay = sc.nextInt();
		
		Objection2 o = new Objection2(); //반환값이 2개니까 클래스를 이용!
		o.obj = obj; // 클래스 변수 안의 obj 변수에 내가 입력받은 obj 변수를 저장
		o.pay = pay;
		
		return o;
	
	}

	public static void main(String[] args) {
		
		//함수를 실행하면 목적지 객체가 생성되어 옴
		Objection2 o1=  objectInput();
		System.out.println(o1);
		
		trainPrint(o1);

	}

}