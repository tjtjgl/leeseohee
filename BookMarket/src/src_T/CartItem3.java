
package src_T;


public class CartItem3 {

	private String[] itemBook = new String[7];


	private String bookID;
	private int quantity;
	private int  totalPrice;
	
	public CartItem3() {
		// TODO Auto-generated constructor stub
	}
	
	public CartItem3(String[] book) {
		
		this.itemBook = book;
		this.bookID = book[0];
		this.quantity = 1;	
		updateTotalPrice();
	}
	public String[] getItemBook() {
		return itemBook;
	}

	public void setItemBook(String[] itemBook) {
		this.itemBook = itemBook;
	}
	public String getBookID() {
		return bookID;
	}

	public void setBookID(String bookID) {
		this.bookID = bookID;
		this.updateTotalPrice();
	}

	
	public int getQuantity() {
		return quantity;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
		this.updateTotalPrice();
	}
	
	public int getTotalPrice() {
		return totalPrice;
	}

	public void updateTotalPrice() {
		totalPrice = Integer.parseInt(this.itemBook[2]) * this.quantity;
	}

	
	
}

