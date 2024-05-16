public class MaxMinDigit 
{
    public static void main(String[] args)
    {
        int num=289184, dig=0, max=0,min=9;
        int num1=num;
        while(num>0)
        {
            dig=num%10;
            num=num/10;
            if(dig>max)
                max=dig;
        }
        while(num1>0)
        {
            dig=num1%10;
            num1=num1/10;
            if(dig<min)
            min=dig;
        }
        System.out.println("The minimum digit in the given number is "+min);
        System.out.println("Maximum digit in the number the given number is "+max);
    }   
}