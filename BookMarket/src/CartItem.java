import java.util.ArrayList;

public class CartItem {

	//private String[] itemBook = new String[7];
	private ArrayList<String> itemBook = new ArrayList<>();

	private String bookID;
	private int quantity;
	private int  totalPrice;
	
	public CartItem() {
		this.quantity+=1;

	}
	
	public void setItemBook(String bookName) {
		this.itemBook.add(bookName);
	}
	
	public String getBookID() {
		return bookID;
	}

	public void setBookID(String bookID) {
		this.bookID = bookID;
		//this.updateTotalPrice();
	}

	
	public int getQuantity() {
		return quantity;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
		//this.updateTotalPrice();
	}
	
	public int getTotalPrice() {
		return totalPrice;
	}

//	public void updateTotalPrice() {
//		totalPrice = Integer.parseInt(this.itemBook[2]) * this.quantity;
//	}

}

