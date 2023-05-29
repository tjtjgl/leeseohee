package stack;

class ArrayStack {

	int top; // 마지막 데이터가 어디인지 알려주는 방번호(인덱스)
	int size; // 스택 배열의 크기
	int[] stack;

	//ArrayStack() {}

	ArrayStack(int size) {

		this.size = size;
		stack = new int[size]; // 값에 따라 배열 개수가 달라지도록
		top = -1; // 아직 값이 없으므로 의미없는 값으로 초기화

	}

	 // 추가
	void push(int item) {
		stack[++top] = item;
		System.out.println(stack[top] + " push");
	}

	// 가장 마지막 값 삭제
	void pop() {
		if (top >= 0 ) {
		int pop = stack[top];
		System.out.println(pop + " pop");
		stack[top--] = 0;
		} else System.out.println("더이상 삭제 할 값이 없습니다.");
	}

	// 가장 마지막 값 조회
	void peek() {
		System.out.println(stack[top] + " peak!");

	}
	
	// 가장 마지막 값부터 처음값까지 조회
	void peek2() {
		int peek = top;
		for(int i = peek ; i >= 0 ; i--) {
		System.out.print(stack[peek--] + " peak!" + " ");
		}System.out.println();
	}


	public static void main(String[] args) {
		ArrayStack s1 = new ArrayStack(10);
		
		s1.push(10);
		s1.push(20);
		s1.push(30);
		s1.push(40);
		s1.push(50);
		s1.peek2();
		
		//void remove() 값 삭제, 확인시키지 않고 그냥 삭제
		//type pop() 인덱스 삭제, 삭제한 값을 프로그래머한테 보여줌, 리턴값이 있음
		
		s1.pop();
		s1.pop();
		s1.pop();
		s1.pop();
		s1.pop();
		s1.pop();
		s1.pop();
		
		
		
		
	}

}
