import java.util.Scanner;

public class InputEx {

	public static void main(String[] args) {

		//정수 2개 입력
		//60점 이상 100점 이하 true, 아니면 false
		//Scanner sc1 = new Scanner(System.in);
		//Scanner sc2 = new Scanner(System.in);

		
		int num1 = 10;
		int num2 = (num1--)+2;
		int num3 = 20;
		
		/*
		System.out.println(num3--);
		System.out.println(num3);
		*/
		
		System.out.println(num1+", "+num2);
		
		int n4 = ++num3 - num1;
		
		System.out.println(num3);
		System.out.println(num1);
		System.out.println(n4);
		
		String res1 = (10 == 10) ? "true" : "false";
		System.out.println(res1);
		
		boolean res2 = (101 == 10) ? true : false;
		System.out.println(res2);
		
	}

}
