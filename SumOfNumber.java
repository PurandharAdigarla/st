public class SumOfNumber {
    public static void main(String[] args)
    {
        int num=12345, sum =0, r=0;
        while (num>0) {
            r=num%10;
            num=num/10;
            sum=sum+r;
        }
        System.out.println(sum);
    }
}
