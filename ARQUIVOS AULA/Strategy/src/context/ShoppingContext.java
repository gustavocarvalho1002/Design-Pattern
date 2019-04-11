package context;

import java.util.ArrayList;
import java.util.List;
import strategy.Payment;

public class ShoppingContext {
	
	List<Item> items;
	Payment payment;
	
	public ShoppingContext() {
		this.items = new ArrayList<Item>();
	}
	
	public void addItem(Item item) {
		this.items.add(item);
	}
	
	public void removeItem(Item item) {
		this.items.remove(item);
	}
	
	public double calculateTotalPrice() {
		double sum = 0;
		for(Item item : items) {
			sum += item.getItemPrice();
		}
		return sum;
	}
	
	public void pay(Payment payment){
		double amount = this.calculateTotalPrice();
		this.payment = payment;
		this.payment.pay(amount);	
	}
	
	//Other important typical processing for shopping context...

}
