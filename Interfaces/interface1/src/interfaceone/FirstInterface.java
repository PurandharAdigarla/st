package interfaceone;

public interface FirstInterface 
{
	int i=9;
	default void show()
	{
		System.out.println("Show");
	}
	default void display()
	{
		System.out.println("Display");
	}
}
