package ai.ineuron.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ai.ineuron.cards.CreditCard;
import ai.ineuron.cards.DebitCard;
import ai.ineuron.paymentprocessing.PaymentProcess;

public class PayBills {
	public static void main(String[] args) {
		
		ApplicationContext factory=new ClassPathXmlApplicationContext("beans.xml");
		factory.getBean("credit",CreditCard.class);
		factory.getBean("debit",DebitCard.class);
		PaymentProcess pp=factory.getBean("proPayment", PaymentProcess.class);
		pp.doPayment(5000);
	}

}
