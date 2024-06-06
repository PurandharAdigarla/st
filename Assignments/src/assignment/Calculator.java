package assignment;
import java.util.*;
public class Calculator 
{
	float add(float a, float b)
	{
		float sum=a+b;
		System.out.println("sum= "+sum);
		return sum;
	}
	float sub(float a,float b)
	{
		float sub=a-b;
		System.out.println("sub= "+sub);
		return sub;
	}
	float mul(float a,float b)
	{
		float mul=a*b;
		System.out.println("Product= "+mul);
		return mul;
	}
	float div(float a,float b)
	{
		float div=0;
		if(b!=0)
		{
			div=a/2;
			System.out.println("Division= "+div);
		}
		else
		{
			System.out.println("Number cannot be divided by 0");
		}
		return div;
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		boolean flag=true;
		do
		{
			System.out.println("\nEnter 1 for addintion\nEnter 2 for Subtraction\n"
					+ "Enter 3 for Multiplication\n"
					+ "Enter 4 for Division\n"
					+ "Enter 5 to exit from calculator\n");
			int ch=sc.nextInt();
			Calculator obj=new Calculator();
			switch(ch)
			{
			case 1:
				obj.add(sc.nextFloat(),sc.nextFloat());
				break;
			case 2:
				obj.sub(sc.nextFloat(),sc.nextFloat());
				break;
			case 3:
				obj.mul(sc.nextFloat(),sc.nextFloat());
				break;
			case 4:
				obj.div(sc.nextFloat(),sc.nextFloat());
				break;
			case 5:
				flag=false;
				break;
				default:
					System.out.println("Invalid input");
			}
		}while (flag);
	}
}
