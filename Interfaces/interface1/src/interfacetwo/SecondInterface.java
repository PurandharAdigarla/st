package interfacetwo;
public interface SecondInterface 
{
	void show();
	default void display()
	{
		System.out.println("Second Interface");
	}
}
