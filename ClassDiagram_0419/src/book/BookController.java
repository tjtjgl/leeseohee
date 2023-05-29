package book;

import java.io.File;
import java.util.Arrays;

public class BookController {

	BookDAO bd = new BookDAO();

	void makeFile() throws Exception {

		String path = "F:\\";
		String fileName = "book.txt";

		File file = new File(path + fileName);

		// 지정 위치에 파일이 존재하면 false, 존재하지 않으면 true
		// 파일 없으면 생성까지 해줌
		boolean res = file.createNewFile();

		if (res) {
			System.out.println(fileName + "파일 생성 완료");
		} else {
			System.out.println("기존 파일 있음");
		}

	}

	void fileSave(Book[] bArr) throws Exception {

		bd.fileSave(bArr);
	}

	Book[] fileRead() throws Exception {
		for(Book val : bd.fileRead()) {
			if (val != null)
			System.out.println(val);
		}

		return bd.fileRead();
	}

}
