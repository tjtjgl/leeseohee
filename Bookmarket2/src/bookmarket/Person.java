package bookmarket;

public class Person {
	
	private String name;
	private String phone;
	private String address;
	
	public Person() {
	}
	
	public Person(String name, String phone, String address) {
		super();
		this.name = name;
		this.phone = phone;
		this.address = address;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Person(String name, String phone) {
		super();
		this.name = name;
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", phone=" + phone + "]";
	}
	
}
