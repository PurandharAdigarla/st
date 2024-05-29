package Inheritance;
class Aa
{
    int a=6;
}
class Bb extends Aa
{
    int b=9;
}
class Cc extends Bb
{
    int c=1;
}
public class QuesOne
{
    public static void main(String[] args) {
        Cc obj=new Cc();
        int sum=obj.a+obj.b+obj.c;
        System.out.println("sum = "+sum);
    }
}