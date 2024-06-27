public class NestedStaticContainer
{
    static class Nested
    {
        void display()
        {
            System.out.println("Inside Static Nested Class");
        }
    }
    public static void main(String[] args) {
        Nested obj=new Nested();
        obj.display();
    }
}
