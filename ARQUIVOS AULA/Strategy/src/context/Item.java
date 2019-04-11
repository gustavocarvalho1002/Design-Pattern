package context;

public class Item {
	
	String itemCode;
	double itemPrice;
	
	public Item(String itemCode, double itemPrice){
		this.itemCode = itemCode;
		this.itemPrice = itemPrice;
	}
	
	public String getItemCode() {
		return itemCode;
	}
	
	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}
	
	public double getItemPrice() {
		return itemPrice;
	}
	
	public void setItemPrice(double itemPrice) {
		this.itemPrice = itemPrice;
	}
	

}
