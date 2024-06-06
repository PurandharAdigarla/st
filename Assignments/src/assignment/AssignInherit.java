package assignment;

class InheritMain
{
	void show()
	{
		System.out.println("Void Show()");
	}
}
	class Inherit extends InheritMain
	{
		void show()
		{
		System.out.println("Void Display");
		}
	}
	public class AssignInherit
	{
		public static void main(String[] args)
		{
		// TODO Auto-generated method stub
		InheritMain obj=new InheritMain();
		obj.show();
		Inherit obj1=new Inherit();
		obj1.show();
		}
	}

