class StudentOne
{
    int id;
    String name;
    String deg;
    String 
    StudentOne()
    {
        System.out.println("One()");
    }

    public StudentOne(int id) {
        this.id = id;
    }
    StudentOne(int id, String name)
    {
        this(id);
        this.name=name;
    }
    StudentOne(int id, String name, String deg)
    {
        this(id,name);
        this.deg=deg;
    }
    public String toString()
    {
        return id+" "+name+" "+deg;
    }
}
class StudentCourse extends StudentOne
{
    String branch;
    String section;
    StudentCourse()
    {
        System.out.println("StudentCourse");
    }
    StudentCourse(int id, String name, String deg, String branch)
    {
        super(id, name, deg);
        this.branch=branch;
    }
    StudentCourse(int id, String name, String deg, String branch,String section)
    {
        this(id,name,deg,branch);
        this.section = section;
    }
    public String toString()
    {
        //return id+" "+name+" "+deg+" "+branch+" "+section;
        return super.toString()+" "+branch+" "+section;  //super.toString() accesses the parameters of the superclass.
    }
}
public class InheritanceFour
{
    public static void main(String[] args)
    {
        StudentCourse st1=new StudentCourse(23,"PTR","B.tech","CSE","K19");
        System.out.println(st1);
    }
}

