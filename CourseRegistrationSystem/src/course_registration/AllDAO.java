package course_registration;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class AllDAO {

	String fName = "All.txt";

	int fileSave(Student s) throws Exception {
		if (s != null) {
			FileOutputStream fos = new FileOutputStream(fName,true);
			ObjectOutputStream oos = new ObjectOutputStream(fos);

			oos.writeObject(s);

			oos.close();
			fos.close();

			return 1;
		}
		return 0;
	}
	
	Student studentRead() throws Exception{
		FileInputStream fis = new FileInputStream(fName);
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Student s = (Student) ois.readObject();
		
		ois.close();
		fis.close();
		
		return s;
	}
	
//	int fileSave(Student s,ArrayList<Subject> register) throws Exception {
//		if (register.size() != 0) {
//			FileOutputStream fos = new FileOutputStream(fName,true);
//			ObjectOutputStream oos = new ObjectOutputStream(fos);
//			
//			oos.writeObject(s);
//			oos.writeObject(register);
//			
//			oos.close();
//			fos.close();
//			
//			return 1;
//		}
//		return 0;
//	}
	
	ArrayList<Subject> listRead() throws Exception{
		FileInputStream fis = new FileInputStream(fName);
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		ArrayList<Subject> register = (ArrayList<Subject>) ois.readObject();
		
		ois.close();
		fis.close();
		
		return register;
	}
}
