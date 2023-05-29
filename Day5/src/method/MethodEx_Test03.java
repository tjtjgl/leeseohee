package method;

public class MethodEx_Test03 {

	public static boolean comp(String str1, String str2) {

		boolean res = str1.equals(str2);
		return res;

	}

	public static void main(String[] args) {

		String str1 = "hello";
		String str2 = "world";

		System.out.println(comp(str1, str2));
	}

}
