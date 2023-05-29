package variable;

public class Instance_static_variable {

	public static void main(String[] args) {

		FishBread f1 = new FishBread("팥");
		FishBread f2 = new FishBread("고구마");
		FishBread f3 = new FishBread("슈크림");
		FishBread f4 = new FishBread("치즈");

		//철판 만들기(배열)
		FishBread[] list = new FishBread[4];
		list[0]=f1;
		list[1]=f2;
		list[2]=f3;
		list[3]=f4;
		
		for (FishBread val : list) {
			System.out.println(val);
		}
		
		System.out.println("========================");
		System.out.println("붕어빵 개수: "+FishBread.cnt);
		
	}

}

class FishBread{
	//내용물: 팥 고구마 치즈 슈크림
	//인스턴스 변수
	String contents;
	
	//붕어빵 개수
	//클래스 변수
	static int cnt;
	
	public FishBread(String contents) {
		this.contents = contents;
		FishBread.cnt++;
	}

	@Override
	public String toString() {
		return "["+contents + "] 붕어빵";
	}
	
	
}