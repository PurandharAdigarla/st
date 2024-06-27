import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

class EmployeeCollection implements Comparable<EmployeeCollection>{
    int id;
    String empName;
    int age;
    double salary;
    @Override
    public int compareTo(EmployeeCollection e)
    {
        if (this.salary > e.salary)
            return 2;
        else if(this.salary < e.salary)
            return -2;
        else
            return 0;
//        {
//            int i = this.empName.compareTo(e.empName);
//            if (i==0)
//            {
//                if (e.id>this.id)
//                    return 1;
//                else if (e.id<this.id)
//                    return -1;
//                else return 0;
//            }
//            return i;
//        }
    }
    public EmployeeCollection() {
    }

    public EmployeeCollection(int id, String empName,int age, float salary) {
        this.id = id;
        this.empName = empName;
        this.age=age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "EmployeeCollection {" +
                "id=" + id +
                ", empName='" + empName + '\'' +
                ", age='" + age + '\'' +
                ", salary=" + salary +
                '}';
    }
}

    public class EmpArrayList {
        public static void main(String[] args) {
            EmployeeCollection emp1 = new EmployeeCollection(3, "Purandhar",23, 23198.21F);
            EmployeeCollection emp2 = new EmployeeCollection(1, "PTR",21, 43198.21F);
            EmployeeCollection emp3 = new EmployeeCollection(6, "Abhi",24, 53198.21F);
            EmployeeCollection emp4 = new EmployeeCollection(2, "Teja",20, 13198.21F);
            EmployeeCollection emp5 = new EmployeeCollection(4, "Purandhar",23, 93198.21F);
            EmployeeCollection emp6 = new EmployeeCollection(5, "Ravi",25, 23198.21F);

            ArrayList<EmployeeCollection> emp=new ArrayList<EmployeeCollection>();
            emp.add(emp1);
            emp.add(emp2);
            emp.add(emp3);
            emp.add(emp4);
            emp.add(emp5);
            emp.add(emp6);
            System.out.println("max salary: "+Collections.max(emp));
            System.out.println();

            //sorting
            Collections.sort(emp);
            Iterator<EmployeeCollection> itr=emp.iterator();

            while (itr.hasNext())
            {
                System.out.println(itr.next());
            }
        }
    }
