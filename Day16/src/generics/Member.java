package generics;

public class Member {

	private String name;
	private String pass;

	public Member() {
	}
	
	public Member(String name, String pass) {
		this.name = name;
		this.pass = pass;
	}
	
	public Member(String[] str) {
		this.name = str[0];
		this.pass = str[1];
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	@Override
	public String toString() {
		return "Member [name=" + name + ", pass=" + pass + "]";
	}

}
