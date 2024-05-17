public class Factorial {
    public static void main(String args[])
    {
        int fact=1;
        for(int i=6;i>=1;i--)
        {
            fact=fact*i;
        }
        System.out.println("the factorial of 6 is " +fact);
    }
}
