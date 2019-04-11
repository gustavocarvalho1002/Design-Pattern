package test;

import java.util.Calendar;

import strategy.Payment;
import concreteStrategy.PaymentByBankingBillet;
import concreteStrategy.PaymentByCreditCard;
import context.Item;
import context.ShoppingContext;

public class StrategyTest {

	public static void main(String[] args) {

		ShoppingContext shoppingContext;

		Item lego = new Item("1234", 100.56);
		Item arduino = new Item("5678", 34.00);

		Item camera = new Item("1234", 200.00);
		Item cellphone = new Item("5678", 180.55);

		Payment payment;

		System.out.println("\n Paying by Credit Card:");
		shoppingContext = new ShoppingContext();
		shoppingContext.addItem(lego);
		shoppingContext.addItem(arduino);
		payment = new PaymentByCreditCard("Maur�cio Serrano", "4073.0200.0000.0002", 111);
		shoppingContext.pay(payment);

		System.out.println("\n Paying by Banking Billet:");
		shoppingContext = new ShoppingContext();
		shoppingContext.addItem(camera);
		shoppingContext.addItem(cellphone);
		payment = new PaymentByBankingBillet("Milene Serrano", "Americanas.com",
				"40730.02000 00000.000234 12345.678900 3 33390000038055");
		shoppingContext.pay(payment);

	}

}
