public class NestedClass
{
        void show()
        {
            System.out.println("SHOW in Outer class ");
        }
    class InnerClass
    {
        void show()
        {
            System.out.println("SHOW in inner class ");
            InnerClass obj=new InnerClass();
            obj.show();
        }
    }
    public static void main(String[] args) {

    }
}
