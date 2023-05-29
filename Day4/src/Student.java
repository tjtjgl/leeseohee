
public class Student {

	String name;
	String birth;
	String address;
	String phoneNum;
	String gender;
	
	public void showInfo() {
		
		System.out.println("이름은 "+name+"입니다." );
		System.out.println("생년월일은 "+birth+"입니다." );
	}
	
	
	public static void main(String[] args) {
		
		Student student = new Student();
		
		student.name="이서희";
		student.birth="19940905";
		student.address="강서구 화곡로 342";
		student.phoneNum="010-3859-3561";
		student.gender="여";
		
		student.showInfo();
		
	}
}