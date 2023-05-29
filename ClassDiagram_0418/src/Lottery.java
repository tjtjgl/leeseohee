import java.util.Comparator;


public class Lottery implements Comparator<Lottery>{

	private String name;
	private String phone;

	public Lottery() {
	}

	public Lottery(String name, String phone) {
		this.name = name;
		this.phone = phone;
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

	@Override
	public String toString() {
		return name + "(" + phone + ")";
	}

	@Override
	public boolean equals(Object obj) {
		Lottery tmp = (Lottery) obj;
		return this.name.equals(tmp.name) && this.phone.equals(tmp.phone);
	}

	@Override
	public int hashCode() {
		return (name + phone).hashCode();
	}

	public int compare(Lottery o1, Lottery o2) {
		if (o1.getName() == o2.getName()) {
			return o1.getPhone().compareTo(o2.getPhone());
		} else
			return o1.getName().compareTo(o2.getName());
	}

}
