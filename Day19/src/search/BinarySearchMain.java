package search;

public class BinarySearchMain {

	public static boolean bsearch(int arr[], int key) {

		int left = 0;
		int right = arr.length - 1;
		int mid; // 반복하면 변경됨

		while (left <= right) {
			mid = (left + right) / 2;

			if (arr[mid] < key) {
				left = mid + 1;

			} else if (arr[mid] > key) {
				right = mid - 1;
			} else
				return true;
		}

		return false;

	}

	public static void main(String[] args) {

		/**
		 * 이진탐색(=이분법) 조건: 무조건 정렬이 되어 있어야 한다 인덱스의 길이를 반으로 나눠 중간 기준점을 찾음, 기준점=(처음+끝)/2 중간을
		 * 기점으로 비교하는 값이 작으면 기준점보다 왼쪽 범위에서 검사, 기준점보다 크면 오른쪽 범위를 검사
		 */

		int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		
		boolean res = bsearch(arr,6);
		
		if(res) {
		System.out.println("값을 찾음");
		}else System.out.println("값이 없음");
				
	}

}
