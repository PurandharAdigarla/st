package thispackage;
import mypack.Employee;
public class Programmer extends Employee
{
    String project;
    Programmer()
    {
        System.out.println("programmer");
    }
    public Programmer(int id, String name, int salary, String project)
    {
        super(id, name, salary);
        this.project=project;
    }
    @Override
    public String toString() {
        return  super.toString()+", Programmer" +
                " project='" + project + '\'' +
                "} " ;
    }

    public static void main(String[] r) {
        Programmer ob=new Programmer(44,"Abhi",4354654,"Banking Project");
        //Employee obj = new Employee(44, "Abhi", 34203);
        System.out.println(ob);
    }
}