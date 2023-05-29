import java.util.Arrays;
import java.util.Random;

public class StringEx {

	public static void main(String[] args) {
		
		String[] arr = {"a","z","o","기역","한국","이응","니은","거여"};
	
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		String x = "ABC";
		String y = "ABO";
		
		
		//변수.conpareTo(비교할 변수);
		System.out.println(x.compareTo(y)); 
		
		String str = "hello";
		
		//문자 한개만 추출,charAt(번호) 
		char ch =str.charAt(0);
		System.out.println(ch);
		
		ch =str.charAt(1);
		System.out.println(ch);

		
		str = "hi my name is seohee";
		
		//문자 여러개(범위) 추출, substring(시작번호,끝번호), 끝번호 문자는 출력X
		String s=str.substring(3,10);
		System.out.println(s);
		
		//===========================================================================
		
		str = "hi my name is seohee";
		
		//**진짜 많이 사용**
		//split("구분자"): 구분자를 이용해서 잘라내어 배열 형태로 저장
		
		String[] arr1 = str.split(" ");
		
		for (String val : arr1 ) {
			System.out.print(val + ",");
		}

		int line = arr1.length;
		System.out.println(line);
		
		
		
		
		
	
	
		
		
		
	}

}
