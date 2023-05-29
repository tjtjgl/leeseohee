package bookmarket;

public class Book {
	
	private int id;
	private String idFull = "ISBN"+id; 
	private String title;
	private int price;
	private String author;
	private String comment;
	private String category;
	private String date;

	public Book(int id, String title, int price, String author, String comment, String category, String date) {
		this.id = id;
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
		return idFull + " | " + title + " | " + price + " | " + author + " | " + comment + " | " + category+" | " + date;
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
