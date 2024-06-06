package mypack;
public class Student
{
    int id;
    String name;
    String branch;
    String degree;
    Address address;
    public Student()
    {
        super();
    }
    public Student(int id, String name, String branch,String degree, Address address) {
        this.id = id;
        this.name = name;
        this.branch = branch;
        this.degree=degree;
        this.address = address;
    }
    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", branch='" + branch + '\'' +
                ", degree='" + degree + '\'' +
                ",\naddress=" + address +
                '}';
    }
    public static void main(String[] args) {
        Student obj=new Student(23,"PTR","B.tech","CSE",new Address(12,"Pudimadaka road","Anakapalle","AP","India",531001));
        System.out.println(obj);
    }

}
