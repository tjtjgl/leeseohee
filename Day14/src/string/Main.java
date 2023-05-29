package string;

public class Main {

	public static void main(String[] args) {

		int num = 35;
		
		String name1 = "홍길동";
		
		String name2 = "홍길동";
		System.out.println(name1.hashCode());
		System.out.println(name2.hashCode());
		
		
		String str = "hello";
		System.out.println(str.hashCode());
		str = str+" world";
		System.out.println(str.hashCode());
		
		String str1 = "";
		String str2 = "";
		String str3 = "";
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str3.hashCode());
		
		String str4 = new String("");
		String str5 = new String("");
		String str6 = new String("");
		System.out.println(str4.hashCode());
		System.out.println(str5.hashCode());
		System.out.println(str6.hashCode());
		
		
		StringBufferEx.showstrbu2();
		
		
		
	}
}
