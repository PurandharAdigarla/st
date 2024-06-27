public class MemberOuter
{
    class MemberInner
    {
        void show()
        {
            System.out.println("Hello from inner class");
        }
    }
//    void invokeInnerClass()
//    {
//        MemberInner obj=new MemberInner();
//        obj.show();
//    }
    public static void main(String[] args) {
        MemberInner obj2=new MemberOuter().new MemberInner();
        obj2.show();
//        MemberOuter obj=new MemberOuter();
//        obj.invokeInnerClass();
    }
}
