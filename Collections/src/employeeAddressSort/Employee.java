package employeeAddressSort;
public class Employee implements Comparable<Employee>
{
    int id;
    String empName;
    int age;
    double salary;
    Address address;

    public Employee()
    {
    }
    public Employee(int id, String empName, int age, double salary, Address address) {
        this.id = id;
        this.empName = empName;
        this.age = age;
        this.salary = salary;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", empName='" + empName + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", address=" + address +
                '}';
    }

    @Override
    public int compareTo(Employee o) {
        // sorting with address
        return this.address.State.compareTo(o.address.State);

        //sorting with id's
        /*if (this.id>o.id)
            return 9;
        else if(this.id<o.id)
            return -9;
        else
            return 0;*/
    }
}
