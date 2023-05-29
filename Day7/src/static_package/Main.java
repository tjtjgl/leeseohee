package static_package;

public class Main {

	public static void main(String[] args) {

		//접근, 실행할 때 클래스명.변수명 Student.cnt

		Student[] stuList = new Student[5];
		
		stuList[0] = new Student(Student.cnt, "김자바");
		stuList[1] = new Student(Student.cnt, "박이썬");
		stuList[2] = new Student(Student.cnt, "이씨");
		stuList[3] = new Student(Student.cnt, "오이");
		stuList[4] = new Student(Student.cnt, "강쁠쁠");
		
//		Student s1 = new Student(Student.cnt, "김자바");
//		Student s2 = new Student(Student.cnt, "김자바");
//		Student s3 = new Student(Student.cnt, "김자바");
//		Student s4 = new Student(Student.cnt, "김자바");
//		
//		Student[] stuList = new Student[4];
//		stuList[0]=s1;
//		stuList[1]=s2;
//		stuList[2]=s3;
//		stuList[3]=s4;
		
		for (Student s : stuList) {
			System.out.println(s);
		}
		
		System.out.println(Student.cnt);
				
	}

}
