package linkedlist;

class Node {

	int data; // 데이터
	Node next; // 다음 주소

}

public class LinkedListEx {

	public static void main(String[] args) {

		int cnt = 0; // 데이터 개수

		// 링크드리스트의 시작점, 머리(head) -- 데이터를 저장하지 않음
		Node head = new Node();

		// 실제 첫번째 노드를 생성
		Node n1 = new Node();
		n1.data = 10;
		head.next = n1;
		cnt++;

		// 두번째 노드 생성
		Node n2 = new Node();
		n2.data = 20;
		n1.next = n2;
		cnt++;

		// 세번째 노드 생성
		Node n3 = new Node();
		n3.data = 30;
		n2.next = n3;
		cnt++;

		// node next를 이용해서 결과 출력
//		System.out.println(head.next.data);
//		System.out.println(head.next.next.data);
//		System.out.println(head.next.next.next.data);

		Node tmp = head.next;

		for (int i = 0; i < cnt; i++) {
			System.out.println(tmp.data);
			tmp = tmp.next;
		}

		// n1 삭제하기
		// n1 찾기 -> n1.next를 head.next로 연결

		Node del = n1;

		// n1이 가지고 있는 next(=n2)의 주소값을 head저장
		head.next = del.next;

	}

}
