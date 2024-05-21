public class LCMofTwoNumbers 
{
    public static void main(String[] args)
    {
        int num1=12;
        int num2=15;
        int min=0;
        int lcm=0;
        int gcd=0;
        if (num1<num2) 
        {
            min=num1;
        }
        else
        {
            min=num2;
        }
        for(int i=min;i>=1;i--)
        {
            if (num1%i==0 && num2%i==0) 
            {
                System.out.println("GCD = " +i);
                gcd=i;
                break;
            }
            
        }
        //LCM
        lcm=(num1*num2)/gcd;
        System.out.println("LCM = "+lcm);
    }
}
