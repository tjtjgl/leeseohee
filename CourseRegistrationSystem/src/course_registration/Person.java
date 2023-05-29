package course_registration;

import java.io.Serializable;
import java.util.Objects;

public class Person implements Serializable{
	private String name;
	private String id;
	private String pw;
	private String phone;
	
	public Person() {}
	
	public Person(String id, String pw) {
		this.id = id;
		this.pw = pw;
	}
	
	public Person(String name, String id, String pw, String phone) {
		this.name = name;
		this.id = id;
		this.pw = pw;
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "name=" + name + " | id=" + id + "| pw=" + pw + "| phone=" + phone;
	}
	
	

}
