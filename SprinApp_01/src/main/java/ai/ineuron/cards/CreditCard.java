package ai.ineuron.cards;

public class CreditCard implements PaymentCard{
	
	CreditCard(){
		System.out.println("CreditCard object got created...");
	}
	public boolean payBills(double amount) {
		System.out.println("paying bills using credit card "+amount);
		return true;
	}

}
