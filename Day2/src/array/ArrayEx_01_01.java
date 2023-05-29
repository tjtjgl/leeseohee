package array;

public class ArrayEx_01_01 {

	public static void main(String[] args) {

		int[] arr = { 10, 20, 30, 40, 50 };

		//System.out.println(arr[0] + arr[1] + arr[2] + arr[3] + arr[4]);

		for (int i = 0; i < arr.length; i++) {
			if ((arr[i] % 4) == 0) {
				System.out.println(arr[i]);
			}
		}

	}
}
