public class CloneDemo 
{
    int empId;
    String empName;
    int salary;

    //let's see the exact copy constructor
    CloneDemo(CloneDemo cd)
    {
        this.empId=cd.empId;
        this.empName=cd.empName;
        this.salary=cd.salary;
        System.out.println("CloneDemo()");
    }

    CloneDemo(int empId,String empName, int salary)
    {
        this.empId=empId;
        this.empName=empName;
        this.salary=salary;
    }

    //let's see an predefined method which is also called as two string method
    public String toString()
    {
        return empId+" "+empName+" "+salary;
    }

    public static void main(String[] args) 
    {
        CloneDemo obj1 = new CloneDemo(1, "Lokesh",500000);
        CloneDemo obj2 = new CloneDemo(obj1);
        //this is said to be field to  be field copy
        // obj2.empId=obj1.empId;
        // obj2.empName=obj1.empName;
        // obj2.salary=obj1.salary;
        System.out.println(obj2);   //Here the tostring method is invoked to print the object values of obj2 rather than to print a garbage value
    }
}