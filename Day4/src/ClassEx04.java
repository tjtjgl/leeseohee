class Member {

	String id, name, email, pw, pw_check;
	
	char gender;
	String hobby;
	String job;
	boolean marry;

	Member(String id, String name, String email, String pw, String pw_check) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.pw = pw;
		this.pw_check = pw_check;
	}

	void showInfo() {
		System.out.println("ID: " + id);
		System.out.println("이름: " + name);
		System.out.println("이메일: " + email);
		System.out.println("PW: " + pw);
		System.out.println("PW CHK: " + pw_check);
		System.out.println("선택사항: "+ gender + ", "+ hobby+ ", "+ job + ", " + marry);
	}

}

public class ClassEx04 {

	public static void main(String[] args) {

		Member memLee = new Member("seohee", "이서희", "seohee@gmail.com", "1q2w3e4r", "1q2w3e4r");
		memLee.marry = false;
		
		memLee.showInfo();

	}

}
