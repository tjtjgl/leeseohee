package array;

public class ArrayEx_01 {

	public static void main(String[] args) {
		//학생들 점수 저장하는 배열(25명)
		int[] scoreList = new int[25]; 
		
		//배열의 길이
		System.out.println(scoreList.length);
		
		int[] a = {1,2,3};
		int[] b;
		
		//배열 복사
		// b=a; 메모리 주소값만 같아짐, 같은 공간
		
		//b[0] = a[0]; 
		//또는 아래와 같이 
		b= a.clone(); //함수를 이용해서 복사
		
		
		System.out.println(b[0]);
		System.out.println(a[0]);
		
		//값 변경
		b[0] = 3;
		System.out.println(b[0]);
		System.out.println(a[0]);
		
		
		
	}

}
