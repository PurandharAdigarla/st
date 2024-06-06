package classpack;

import interfaceone.FirstInterface;
import interfacetwo.SecondInterface;

public class ClassOne implements FirstInterface, SecondInterface 
{
	@Override
	public void show()
	{
		FirstInterface.super.show();
		System.out.println("SHOW()");
		// TODO Auto-generated method stub
	}
	public void display()
	{
		SecondInterface.super.display();
		System.out.println("dispaly");
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		SecondInterface obj=new ClassOne();
		obj.show();
		obj.display();
		FirstInterface obj1=new ClassOne();
		obj1.show();
		obj1.display();
	}
}
