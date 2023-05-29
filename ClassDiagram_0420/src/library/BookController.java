package library;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BookController {

	private ArrayList<Book> list = new ArrayList<>();

	void insertBook(Book b) {
//		for (Book val : list) {
//			if (val.getTitle().equals(b.getTitle()) && val.getAuthor().equals(b.getAuthor())) {
//				System.out.println("중복된 도서가 존재합니다.");
//				break;
//			} else
				list.add(b);
//		}
	}

	ArrayList<Book> selectList() {
		return list;
	}

	ArrayList<Book> searchBook(String keyword) {

		ArrayList<Book> searchList = new ArrayList<>();

		for (Book val : list) {
			if ((val.getTitle()).contains(keyword)) {
				searchList.add(val);
			}
		}

		return searchList;
	}

	Book deleteBook(String title, String author) {

		Book removeBook = null;

		for (Book val : list) {
			if (val.getTitle().equals(title) && (val.getAuthor().equals(author))) {
				removeBook = val;
				list.remove(val);
				break;
			}
		}
		return removeBook;
	}

	public int ascBook() {
		Collections.sort((ArrayList<Book>) list);
		return 1;
	}

}
