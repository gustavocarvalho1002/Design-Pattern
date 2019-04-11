package concreteStrategy;
import java.util.Locale;

import strategy.Payment;

public class PaymentByBankingBillet implements Payment {
	
	private String bankingBilletPayerName;
	private String bankingBilletBeneficiaryName;
	private String bankingBilletNumber;

	public PaymentByBankingBillet(String bankingBilletPayerName, String bankingBilletBeneficiaryName, String bankingBilletNumber) {
		this.bankingBilletPayerName = bankingBilletPayerName;
		this.bankingBilletBeneficiaryName = bankingBilletBeneficiaryName;
		this.bankingBilletNumber = bankingBilletNumber;
	}
	
	@Override
	public void pay(double amount) {
		// Payment Strategy by using a Banking Billet
		//Here is the place to implements the details to deal with a payment by using a Banking Billet
		double formattedAmount = Double.valueOf(String.format(Locale.UK,  "%.2f", amount));
		System.out.println(formattedAmount + " paid with banking billet");
		System.out.println("The banking billet's details are:");
		System.out.println("Banking Billet's Payer Name: " + this.bankingBilletPayerName);
		System.out.println("Banking Billet's Beneficiary Name: " + this.bankingBilletBeneficiaryName);
		System.out.println("Banking Billet's Number: " + this.bankingBilletNumber);
	}
}

