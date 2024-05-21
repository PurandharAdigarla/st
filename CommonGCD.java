public class CommonGCD {
    public static void main(String[] args)
    {
        int num1=48;
        int num2=18;
        int min=0;
        if (num1<num2) {
            min=num1;
        }
        else
        {
            min=num2;
        }
        for(int i=min;i>=1;i--)
        {
            if (num1%i==0 && num2%i==0) {
                System.out.println(i);
                break;
            }
        }
    }
}
