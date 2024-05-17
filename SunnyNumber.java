public class SunnyNumber {
    public static void main(String[] args)
    {
        int num=18,a=0;
        boolean flag=false;
        {
            for (int i = 1; i<num; i++) 
            {
                a=(i*i)-1;
                if (a==num)
                { 
                    flag=true;
                    break;
                }
            }
            if (flag==true) {
                System.out.println("Sunny Number");
            }
            else{
                System.out.println("Not a sunny number");
            }
        }
    }
}
