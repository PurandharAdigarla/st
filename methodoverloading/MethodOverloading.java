package methodoverloading;
public class MethodOverloading
{
    void Hi()
    {
        System.out.println("Hi");
    }
    void Hi(int a)
    {
        System.out.println("hello");
    }
    void Hi(int a, int b)
    {
        System.out.println("my name is purandhar ");
    }

    public static void main(String[] args)
    {
        MethodOverloading obj=new MethodOverloading();
        obj.Hi();
        obj.Hi(12);
        obj.Hi(12,213);
    }
}
