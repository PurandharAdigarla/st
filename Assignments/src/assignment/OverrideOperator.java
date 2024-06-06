
package assignment;
public class OverrideOperator extends UsingOperators
{
	void calc(int a,int b) 
	 {
		int sum=a+b;
		System.out.println(sum);
		int sub=b-a;
		System.out.println(sub);
	}
	void calc(float a,float b) 
	{
	 	float sum=a+b;
		System.out.println(sum);
		float sub=b-a;
		System.out.println(sub);
	}
	void calc(int a, int b, int c)
	{
		int pro=a*b*c;
		System.out.println(pro);
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		UsingOperators obj=new OverrideOperator();
		obj.calc(233, 1123);
	}

}
