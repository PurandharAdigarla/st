public class FinalTest 
{
    final int a;
    FinalTest(int a)
    {
        this.a=a;
    }
    public String toString()
    {
        return a+" ";
    }
    public static void main(String[] args) {
        FinalTest ft1=new FinalTest(10);
        System.out.println(ft1);
        FinalTest ft2=new FinalTest(22);
        System.out.println(ft2);  
        System.out.println(ft1);
    }
}
