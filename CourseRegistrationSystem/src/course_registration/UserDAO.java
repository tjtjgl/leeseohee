package course_registration;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class UserDAO {
	
	
	
	//String path = "D:\\";
	String fName = "User.txt";

	int fileSave(ArrayList<Student> stuList) throws Exception {
		if (stuList.size() != 0) {
			FileOutputStream fos = new FileOutputStream(fName,true);
			ObjectOutputStream oos = new ObjectOutputStream(fos);

			oos.writeObject(stuList);

			oos.close();
			fos.close();

			return 1;
		}
		return 0;
	}
	
	ArrayList<Student> fileRead() throws Exception{
		FileInputStream fis = new FileInputStream(fName);
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		ArrayList<Student> stuList = (ArrayList<Student>) ois.readObject();
		
		ois.close();
		fis.close();
		
		return stuList;
	}
	
}
