package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("정수1 입력> ");
			int num1 = sc.nextInt();

			System.out.println("정수2 입력> ");
			int num2 = sc.nextInt();

			System.out.println(num1 / num2);

			int[] arr = new int[2];
			System.out.println(arr[2]);
			
			//여러개의 예외가 발샐할 경우 Exception 클래스를 이용해서 업캐스팅
		} catch (Exception e) {
			System.out.println(e.getMessage());} 
		System.out.println("정상종료");
	}

}
