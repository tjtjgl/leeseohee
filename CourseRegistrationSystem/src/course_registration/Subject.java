package course_registration;

import java.io.Serializable;

public class Subject implements Serializable{

	private static int idCnt=1;
	
	private int id = 0;
	private String subName;
	private String date;
	private boolean use = true;

	public Subject() {

		this.id=id+idCnt;
		idCnt++;
	}

	public Subject(String subName, String date) {

		this.subName = subName;
		this.date = date;
		this.id=id+idCnt;
		idCnt++;
	}

	public String getSubName() {
		return subName;
	}

	public void setSubName(String subName) {
		this.subName = subName;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@Override
	public String toString() {
		String res;
		if(use) {
			res = "수강 가능";
		}else res = "수강 중";
		
		return id + " | "+ subName +" | " +date+ " | "+ res;
	}

	public int getId() {
		return id;
	}

	public boolean getUse() {
		return use;
	}

	public void setUse(boolean use) {
		this.use = use;
	}

}
