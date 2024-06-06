package assign7;
public class Debit implements PaymentInterface 
{
	long cardNum;
	int  expDate;
	int cvv;
	public Debit(long cardNum, int expDate, int cvv) 
	{
		super();
		this.cardNum = cardNum;
		this.expDate = expDate;
		this.cvv = cvv;
	}
	public Debit() 
	{
		super();
	}
	@Override
	public String toString() 
	{
		return "Debit [cardNum=" + cardNum + ", expiDate=" + expDate + ", cvv=" + cvv + "]";
	}
	@Override
	public void pay(double amt) 
	{
		System.out.println("Payable amount with Debit Card: "+amt);
	}
}
