package bookmarket;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class BookDAO {

	private ArrayList<Book> initList;

	private String path = "D:\\";
	private String fileName = "book.txt";

	void fileSave(ArrayList<Book> initList) throws Exception {

		if (initList != null) {
			FileOutputStream fos = new FileOutputStream(path + fileName);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(initList);

			// System.out.println(initList);

			oos.close();
			fos.close();
		}

	}

	ArrayList<Book> fileRead() throws Exception {
		FileInputStream fis = new FileInputStream(path + fileName);
		ObjectInputStream ois = new ObjectInputStream(fis);

		initList = (ArrayList<Book>) ois.readObject();

		ois.close();
		fis.close();

		return initList;
	}

}
