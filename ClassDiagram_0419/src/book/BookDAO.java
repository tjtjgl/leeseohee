package book;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class BookDAO {

	private Book[] bArr;

	String path = "F:\\";
	String fileName = "book.txt";

	void fileSave(Book[] bArr) throws Exception {

		FileOutputStream fos = new FileOutputStream(path + fileName);

		ObjectOutputStream oos = new ObjectOutputStream(fos);

		oos.writeObject(bArr);

		oos.close();
		fos.close();
	}

	Book[] fileRead() throws Exception {
		bArr = new Book[10];

		FileInputStream fis = new FileInputStream(path + fileName);
		ObjectInputStream ois = new ObjectInputStream(fis);

		bArr = (Book[]) ois.readObject();
		
//		for (Book val : bArr) {
//			if (val != null)
//			System.out.println(val);
//		}

		//ois.close();
		//fis.close();

		return bArr;
	}

}
