package generics;

public class FruitBox<T,U> {
	
	//독립적으로 운영되는 제네릭 메소드
	public <T,U> void printBox(T x, U y) {
		System.out.println(x.getClass());
		System.out.println(y.getClass());

	}

	public static void main(String[] args) {
	
		FruitBox<Integer, Long> box1 = new FruitBox<>();
		//인스턴스화에 지정된 타입 파라미터
		box1.printBox(1, 2);
		
		//제네릭 메소드에 대해 다른 타입 정의
		box1.printBox("hellp", 5.55); //타입은 생략
		
	
	}
}
