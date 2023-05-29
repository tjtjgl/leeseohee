package bookmarket;

import java.io.Serializable;

public class Book implements Serializable {
	
	private static int idCnt=0;
	
	private int id=1234;
	private String idFull = "ISBN"+id; 
	private String title;
	private int price;
	private String author;
	private String comment;
	private String category;
	private String date;

	public Book(String title, int price, String author, String comment, String category, String date) {
		this.id = id+idCnt;
		idCnt++;
		this.idFull="ISBN"+id; 
		this.title = title;
		this.price = price;
		this.author = author;
		this.comment = comment;
		this.category = category;
		this.date = date;
	}
	@Override
	public String toString() {
		return idFull + " | " + title + " | " + price + " | " + author + " | " + comment + " | " + category+" | " + date+"\n";
	}
	public int getId() {
		return id;
	}
	
	public String getIdFull() {
		return idFull;
	}
	
	public String getTitle() {
		return title;
	}
	public int getPrice() {
		return price;
	}
	public String getAuthor() {
		return author;
	}
	public String getComment() {
		return comment;
	}
	public String getCategory() {
		return category;
	}
	
	public String getDate() {
		return date;
	}
	
	
	

	
	
	

}
