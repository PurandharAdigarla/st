public class StrongNumber {
    public static void main(String[] args)
    {
        int num=145, temp=num, fact=1, rem=0,sum=0;
        while(num>0)
        {
            rem=num%10;
            num=num/10;
            for(int i=rem;i>=1;i--)
            {
                fact=fact*i;
            }
            sum=sum+fact;
            fact=1;
        }
        System.out.println(sum);
        if (temp==sum)
            System.out.println("Strong Number");
        else
            System.out.println("Not a strong number");
    }
}
