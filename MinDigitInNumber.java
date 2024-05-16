public class MinDigitInNumber 
{
    public static void main(String[] args)
    {
        int num=64319875, dig=0, min=9;
        while(num>0)
        {
            dig=num%10;
            num=num/10;
            if(dig<min)
            min=dig;
        }
        System.out.println("The minimum digit in the given number is "+min);
    }    
}
