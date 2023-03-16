package ai.ineuron.cards;

public class DebitCard implements PaymentCard{
	
	DebitCard(){
		System.out.println("DebitCard object got created...");
	}
	public boolean payBills(double amount) {
		System.out.println("paying bills using debit card "+amount);
		return true;
	}

}
