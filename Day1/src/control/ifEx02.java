package control;

import java.util.Scanner;

public class ifEx02 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.print("숫자 세개를 입력하세요");
		int n1=input.nextInt();
		int n2=input.nextInt();		
		int n3=input.nextInt();		
		
		int max=n1;
		int min=n1;
		
		//가장 큰 수 출력
		if (max<n2) {
			max=n2;
		}
		if(max<n3) {
			max=n3;
		}
		
		//가장 작은 수 출력
		if (min>n2) {
			min=n2;
		}
		if(min>n3) {
			min=n3;
		}
		
		System.out.println("최대값: "+ max + "\n" +"최소값: "+ min);
		
		/*if (n1>n2 && n1>n3) {
			res=n1;
		}else if (n2>n1 && n2>n3) {
			res=n2;
		}else if (n3>n1 && n3>n1) {
			res=n3;
		}
		
		System.out.println("가장 큰 수는 "+ res);
		*/
		//가장 작은 수 출력
		
		
	}

}
