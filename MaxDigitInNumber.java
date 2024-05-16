public class MaxDigitInNumber 
{
    public static void main(String[] args)
    {
        int num=289184, dig=0, max=0;
        while(num>0)
        {
            dig=num%10;
            num=num/10;
            if(dig>max)
                max=dig;
        }
        System.out.println("Maximum digit in the number the given number is "+max);
    }   
}
