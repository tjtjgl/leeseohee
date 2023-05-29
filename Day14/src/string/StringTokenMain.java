package string;

import java.util.StringTokenizer;

public class StringTokenMain {

	public static void main(String[] args) {
		//StringTokenizer 클래스
		
		//문자열을 공백문자를 구분자로 자르기
		//new StringTokenizer();
		
		//문자열을 매개변수로 지정된 구분자로 자르기
		//new StringTokenizer(String str, delim);
		
		//new StringTokenizer(String str, delim ,boolean);
		
		String str1 = "welcome to The Java helloWorld";
		
		StringTokenizer st1 = new StringTokenizer(str1);
		System.out.println(st1.countTokens());
		
		//반복자
		while(st1.hasMoreTokens()) {
			System.out.println(st1.nextToken());
		}
		//======================================================
		String str2 = "welcome%to@The J*a*v*a* hello!World!";
		StringTokenizer st2 = new StringTokenizer(str2,"%@ *!", true);
		
		while(st2.hasMoreTokens()) {
			System.out.println(st2.nextToken());
		}
		//======================================================
		String str3 = "welcome%to@The J*a*v*a* hello!World!";
		StringTokenizer st3 = new StringTokenizer(str3,"*",true);
		
		System.out.println(st3.nextToken());
		System.out.println(st3.nextToken());
		
		System.out.println(st3.nextToken("!"));

	}

}
