class One{
    int a=100;
}
class Two extends One
{
    int a=8;
}
public class InheritanceTwo {
    public static void main(String[] args) {
        One obj=new Two();
        System.out.println("a=" +obj.a);
    }
}
