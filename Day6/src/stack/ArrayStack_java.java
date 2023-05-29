package stack;

import java.util.Stack; //자바에서 스택을 제공

public class ArrayStack_java {

	public static void main(String[] args) {

		Stack<Integer> s1 = new Stack<>();
		
		s1.push(10);
		s1.push(20);
		s1.push(30);
		s1.push(70);
		s1.push(80);
		s1.push(100);
		s1.remove(10);
		s1.pop();
		s1.peek();
		
		System.out.println(s1.toString());

	}

}

