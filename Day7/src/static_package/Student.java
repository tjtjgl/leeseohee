package static_package;

public class Student {

	//컴파일 시 미리 메모리에 선언 되고 해당 명령문은 삭제
	static int cnt = 1; 
	
	//인스턴스화 시킬때 마다 객체안에 각각 넣어주는 인스턴스 변수
	int id;
	String name;
	
	public Student(int id, String name) {
		this.id = id;
		this.name = name;
		this.cnt++;
		
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}

}
