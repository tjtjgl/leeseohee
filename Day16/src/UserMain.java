import java.util.HashMap;
import java.util.TreeMap;

class User {

	private String id;
	private String pw;

	public User() {
	}

	public User(String id, String pw) {
		this.id = id;
		this.pw = pw;
	}

	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", pw=" + pw + "]";
	}

}

public class UserMain {

	public static void main(String[] args) {

		User u1 = new User("qwer", "1234");
		User u2 = new User("asdf", "5678");
		User u3 = new User("zxcv", "9012");

		// 키는 ID, 값은 User
		HashMap<String, User> mapList = new HashMap<>();

		mapList.put(u1.getId(), u1);
		mapList.put(u2.getId(), u2);
		mapList.put(u3.getId(), u3);

		// id 찾아서 수정하기
		String find = "qwer";

		for (String key : mapList.keySet()) {
			if (find.equals(key)) {
				mapList.get(key).setId("해보면되지1"); // !값이 바뀌는게 아니라 주소가 바뀌는 것!
				break;
			}
		}
		System.out.println(mapList);
	}
}
