public class TryThis {
    int stuId;
    String stuName;
    String stuBranch;
    TryThis (){
        System.out.println("StuConstuctor");
    }
    TryThis (int stuId, String stuName)
    {
        this.stuId=stuId;
        this.stuName=stuName;
    }
    TryThis (int stuId, String stuName, String stuBranch)
    {
        this.stuId=stuId;
        this.stuName=stuName;
        this.stuBranch=stuBranch;
    }
    void show()
    {
        System.out.println(stuId+" "+stuName+" "+stuBranch);
    }
    public static void main(String[] args) 
    {
        TryThis  st=new TryThis ();
        TryThis  st1=new TryThis (12,"PTR","CSE");
        st1.show();
        TryThis  st2=new TryThis (56, "Abhi");
        st2.show();
    }
}

