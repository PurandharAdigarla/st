class ConstStu 
{
    int id;
    String name;
    int age;
    ConstStu(int id, String name, int age)
    {
        this.id=id;
        this.name=name;
        this.age=age;
    }
    ConstStu(ConstStu st1,ConstStu st2)
    {
        if (this.age>st1) {
            System.out.println(st1);
            
        }
    }
    public String toString()
    {
        return id+" "+name+" "+age;
    }
    public static void main(String[] args) {
        ConstStu stu=new ConstStu(18, "PTR", 22);
        System.out.println(stu);
        ConstStu stu1=new ConstStu(17,"Abhi",23);
        System.out.println(stu1);
    }
}
