package mypack;

public class Employee
{
    int id;
    String name;
    int salary;
    public Employee()
    {
        System.out.println("Employee");
    }
    protected Employee(int id, String name, int salary)
    {
        this.id = id;
        this.name = name;
        this.salary=salary;
    }
    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    public static void main(String[] args)
    {
        Employee e1=new Employee(31,"PTR",60000);
        System.out.println(e1);
    }
}
