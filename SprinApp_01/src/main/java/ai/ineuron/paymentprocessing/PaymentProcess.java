package ai.ineuron.paymentprocessing;

import ai.ineuron.cards.PaymentCard;

public class PaymentProcess {
	
	PaymentCard payCard=null;
	
	public PaymentProcess(){
		System.out.println("PaymentProcess object got created...");
	}
	
	public PaymentProcess(PaymentCard payCard){
		this.payCard=payCard;
	}

	public void setPayCard(PaymentCard payCard) {
		this.payCard = payCard;
	}
	
	public void doPayment(double amount) {
		if(payCard!=null) {
			boolean status=payCard.payBills(amount);
			if(status)
				System.out.println("Payment success....");
			else
				System.out.println("Payment failed... try again...");			
		}else
			System.out.println("You haven't selected card, please select card to payment");
		
	}
}
