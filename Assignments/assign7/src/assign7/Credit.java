package assign7;

public class Credit implements PaymentInterface {

	long cardNum;
	int  expDate;
	int cvv;
	public Credit() {
		super();
	}
	public Credit(long cardNum, int expDate, int cvv) {
		super();
		this.cardNum = cardNum;
		this.expDate = expDate;
		this.cvv = cvv;
	}
	@Override
	public String toString() {
		return "Credit [cardNum=" + cardNum + ", expDate=" + expDate + ", cvv=" + cvv + "]";
	}
	@Override
	public void pay(double amt) 
	{
		System.out.println("Payable Amount with Credit Card: "+amt);
	}

}
