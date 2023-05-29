package array;

import java.util.Random;

public class ArrayEx_02_01 {

	public static void main(String[] args) {

		//로또 프로그램
		Random r = new Random();
		
		int[] lotto= new int[6];
		int x = 0;
		for(int i=0;i<lotto.length;i++) {
			x= r.nextInt(45) + 1; 
			lotto[i] = x;
			System.out.println(lotto[i]); 
		}
		
	}
	

}
