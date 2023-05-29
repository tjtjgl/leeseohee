package course_registration;
import java.io.Serializable;
import java.sql.Date;
import java.util.ArrayList;

public class Student extends Person implements Serializable{
	
	private int subCnt=0;
	
	private ArrayList<Subject> register = new ArrayList<>();

	public Student() {
	}
	
	public Student(String name, String id, String pw, String phone) {
		super(name,id,pw,phone);
	}
	

	public ArrayList<Subject> getRegister() {
		return register;
	}

	public void addRegister(Subject sub) {
		this.register.add(sub);
		subCnt++;
	}
	
	public void removeRegister(Subject sub) {
		this.register.remove(sub);
		subCnt--;
	}

	public int getSubCnt() {
		return subCnt;
	}

	public void setSubCnt(int subCnt) {
		this.subCnt = subCnt;
	}

	@Override
	public String toString() {
		return super.toString()+" "+this.register.toString();
	}
	
	


}
