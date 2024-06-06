package assign7;
public class COD implements PaymentInterface 
{
	double amt;
	COD(double amt)
	{
		this.amt = amt;
	}
	@Override
	public void pay(double amt) 
	{
		System.out.println("Payable Amount on COD: "+amt);
	}
}
