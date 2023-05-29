package bookmarket;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Delivery {

	private String name;
	private String phone;
	private String address;
	private String date;
	private Calendar cal = Calendar.getInstance();
	
	public Delivery(String address) {
		this.address = address;
		this.date = f.format(cal.getTime());
	}
	
	public Delivery(String name, String phone, String address) {
		this.name = name;
		this.phone = phone;
		this.address = address;
		this.date = f.format(cal.getTime());
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	SimpleDateFormat f=new SimpleDateFormat("dd/MM/yy");
	public String getDate() {
		
		return date;
	}
	
}
