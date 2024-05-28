public class CopyConst {
    int id;
    String name;
    CopyConst(int id,String name)
    {
        this.id=id;
        this.name=name;
    }
    CopyConst(CopyConst ob)
    {
        this.id=ob.id;
        this.name=ob.name;
    }
    public String toString()
    {
        return id+" "+name;
    }
    public static void main(String[] args) 
    {
        CopyConst obj=new CopyConst(34,"PTR");
        System.out.println(obj);
        CopyConst obj1=new CopyConst(obj);
        System.out.println(obj1);
    }
}
