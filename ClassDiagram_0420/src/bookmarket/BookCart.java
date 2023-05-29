package bookmarket;

public class BookCart {
	
	private int id;
	private String idFull;
	private int price=0;
	private int amount=0;
	

	public BookCart(int id, int price) {
		this.id = id;
		this.idFull = "ISBN"+id;
		this.price += price;
		this.amount++;
	}

	public int getId() {
		return id;
	}
	
	public String getIdFull() {
		return idFull;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.amount+=1;
		this.price += price;
	}
	
	public void removePrice(int price) {
		this.amount -= 1;
		this.price -= price;
	}

	public int getAmount() {
		return amount;
	}

}
