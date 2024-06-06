package assignment;
public class AssignConstruct 
{
	int id;
	String name;
	double sal;
	public AssignConstruct(int id, String name, double sal) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
	}
	public String toString() {
		return "AssignConstruct [id=" + id + ", name=" + name + ", sal=" + sal + "]";
	}
	public static void main (String[] args) 
	{
		// TODO Auto-generated constructor stub
		AssignConstruct obj1=new AssignConstruct(34,"PTR",45000.34);
		System.out.print(obj1);
	}
}
