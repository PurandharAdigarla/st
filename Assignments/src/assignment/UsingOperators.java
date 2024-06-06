package assignment;
import java.util.Scanner;

class UsingOperators {
	 void calc(int a,int b) 
	{
		int sum=a+b;
		System.out.println(sum);
		int sub=b-a;
		System.out.println(sub);
		int pro=a*b;
		System.out.println(pro);
		if(b!=0)
		{
			int div=a/b;
			System.out.println(div);
		}
		else 
		{
			System.out.println("Undifined");
		}
		
	}
	 void calc(float a,float b) 
		{
		 	float sum=a+b;
			System.out.println(sum);
			float sub=b-a;
			System.out.println(sub);
			float pro=a*b;
			System.out.println(pro);
			if(b!=0)
			{
				float div=a/b;
				System.out.println(div);
			}
			else 
			{
				System.out.println("Undifined");
			}
			
		}
	public static void main(String[] args) 
	{
		UsingOperators obj=new UsingOperators();
		obj.calc(20, 0);
		System.out.println();
		obj.calc(24.9f, 2.80f);
	}
}
