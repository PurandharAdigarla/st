package assign7;

public class PaymentProcess {
	void makePayment(PaymentInterface pay,double amt)
	{
		pay.pay(amt);
	}
	void makePayment(long cardNum, int expDate, int cvv,double amt)
	{
		PaymentInterface  debit = new Debit(cardNum,expDate,cvv);
		PaymentInterface credit = new Credit(cardNum,expDate,cvv);
		PaymentInterface cod = new COD(amt);
		makePayment(debit, amt);
		makePayment(credit, amt);
		makePayment(cod,amt);
	}
	public static void main(String[] args) {
		 
		 PaymentProcess paymentObj = new PaymentProcess();
		 paymentObj.makePayment(1456789323,929, 457, 23985.45);
		}
}

