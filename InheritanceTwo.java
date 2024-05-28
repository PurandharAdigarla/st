class One{
    int a=7;
}
class Two extends One
{
    int b=8;
}
public class InheritanceTwo {
    public static void main(String[] args) {
        Two obj=new Two();
        System.out.println("a=" +obj.a);
    }
}
