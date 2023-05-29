package java_api;

import java.util.Random;

public class ApiEx {

	public static void main(String[] args) {

		// Math클래스

		// 0.0~1 사이 숫자를 반환, random 함수를 쓰지 이건 잘 안씀
		double r = Math.random();
		System.out.println(r);

		// 절대값
		double a = Math.abs(-9.81);
		System.out.println(a);

		System.out.println(Math.max(10, 105));

		Random ra = new Random();
		int a1 = ra.nextInt();	//-21억~21억 사이 숫자
		double a2 = ra.nextDouble(); // = Math.random()
		boolean a3 = ra.nextBoolean();

		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		
		
		int[] res = new int[6];
		
		//세상 간단해졌어, 변수를 주사위 숫자가 아닌 인덱스번호로!
		for(int i =0; i<100; i++) {
//			int dice = ra.nextInt(6)+1;
			int idx = ra.nextInt(6);
			
			res[idx]+=1;
			
//			if (dice == 1) {
//				res[0]+=1;
//			}else if (dice ==2) {
//				res[1]+=1;
//			}
//			else if (dice ==3) {
//				res[2]+=1;
//			}else if (dice ==4) {
//				res[3]+=1;
//			}else if (dice ==5) {
//				res[4]+=1;
//			}else if (dice ==6) {
//				res[5]+=1;
//			}
//			System.out.print(dice+ " ");
		}
		System.out.println();
		for (int i = 0; i<res.length ; i++)
		System.out.println((i+1)+" 나온 횟수: " + res[i]);
	
			

	}

}
