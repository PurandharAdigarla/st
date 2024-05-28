public class StuConstructor {
    int stuId;
    String stuName;
    String stuBranch;
    StuConstructor(){
        System.out.println("StuConstuctor");
    }
    StuConstructor(int stuId, String stuName, String stuBranch)
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
        StuConstructor st=new StuConstructor();
        StuConstructor st1=new StuConstructor(12,"PTR","CSE");
        st1.show();
        StuConstructor st2=new StuConstructor();
        st2.stuId=st1.stuId;
        st2.stuName=st1.stuName;
        st2.stuBranch=st1.stuBranch;
        st2.show();
    }
}
