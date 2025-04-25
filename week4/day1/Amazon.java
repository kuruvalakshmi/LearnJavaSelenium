package week4.day1;

public class Amazon extends CanaraBank {

   	public void upiPayments() {
	  System.out.println("UPIpayment");
		
	}

	public void cardPayments() {
		System.out.println("Cardpayment");
		
	}

	public void cashOnDelivery() {
		System.out.println("Cash on delivery");
		
	}
	public void internetBanking() {
		System.out.println("Internet Banking");
		
	}
	
	public void recordPaymentDetails() {
		System.out.println("Payment Details Recorded");
		
	}
	public static void main(String[] args) {
		Amazon payOptions = new Amazon ();
		payOptions.upiPayments();
		payOptions.cardPayments();
		payOptions.cashOnDelivery();
		payOptions.internetBanking();
		payOptions.recordPaymentDetails();
		
	}

	}


