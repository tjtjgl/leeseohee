package generics;

import java.util.ArrayList;

class A<T> { int num1;}

class B<T> extends A { int num2; }

class C<T> { int num3; }

public class Main {

	// 와일드카드 '?'
	// '? extends 클래스명' 클래스명과 관련있는 하위 클래스들을 받을 수 있다
	public static void print1(ArrayList<? extends A> list) {
		System.out.println(list);
	}
	
	//B와 그의 부모들만 받을 수 있다
	public static void print2(ArrayList<? super B> list) {
		System.out.println(list);
	}

	public static void print3(Object[] list) {
		System.out.println(list);
	}
	
	public static void main(String[] args) {
		ArrayList<A> list1 = new ArrayList<>();
		ArrayList<B> list2 = new ArrayList<>();
		ArrayList<C> list3 = new ArrayList<>();
		ArrayList<Object> list4 = new ArrayList<>();
		
		//배열은 가능
		int[] arr1 = new int[10];
		Integer[] arr2 = new Integer[10];

		print1(list1);
		print1(list2);
		//print1(list3);
		//print1(list4);
		
		print2(list1);
		print2(list2);
		//print2(list3);
		print2(list4);
	}
}
