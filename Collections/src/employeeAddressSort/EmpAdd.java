package employeeAddressSort;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class EmpAdd
{
    public static void main(String[] args) {
        Address ad1=new Address(23,"Akp","Andhra Pradesh");
        Address ad2=new Address(2,"ums","Telangana");
        Address ad3=new Address(3,"lms","Kerala");
        Address ad4=new Address(43,"adp","Tamil Nadu");
        Address ad5=new Address(36,"viz","Karnataka");
        Address ad6=new Address(78,"kaz","Goa");

        Employee emp1 = new Employee(3, "Purandhar",23, 23198.21F,ad1);
        Employee emp2 = new Employee(1, "PTR",21, 43198.21F,ad2);
        Employee emp3 = new Employee(6, "Abhi",24, 53198.21F,ad3);
        Employee emp4 = new Employee(2, "Teja",20, 13198.21F,ad5);
        Employee emp5 = new Employee(4, "Purandhar",23, 93198.21F,ad4);
        Employee emp6 = new Employee(5, "Ravi",25, 23198.21F,ad6);

        List<Employee> list=new LinkedList<>();
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        list.add(emp4);
        list.add(emp5);
        list.add(emp6);

        Collections.sort(list);
        for (Employee e:list)
            System.out.println(e);
    }
}
