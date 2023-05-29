package object;

public class User implements Cloneable {

	private String id;
	private String pw;

	public User() {
	}

	public User(String id, String pw) {
		super();
		this.id = id;
		this.pw = pw;
	}

	public String getId() {
		return id;
	}

	public String getPw() {
		return pw;
	}

	public void setUser(String id, String pw) {
		this.id = id;
		this.pw = pw;
	}

	@Override
	public boolean equals(Object obj) {
		
		if(this == obj) { return true;}
		
		if (!(obj instanceof User)){return false;}
		
		User user = (User)obj;
		if(this.id == user.id && this.pw == user.pw) {
			return true;			
		}else{
			return false;
		}
	}

	// 접근제어자를 변경할 때에도 Overriding
	// 무분별하게 객체를 복사하는 경우를 방지하기 위해 interface로 마커
	@Override
	public Object clone() throws CloneNotSupportedException {

		return super.clone();
	}

	@Override
	public int hashCode() {

		return super.hashCode();

	}

}
