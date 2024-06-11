public class PassingArrayToMethod
{
    void show(int[] arr)
    {
        int sum=0;
        for(int i:arr)
            sum=sum+i;
        System.out.println("sum = "+sum);
    }
    public static void main(String[] args)
    {
        int[] a={4,7,6,3};
        PassingArrayToMethod obj=new PassingArrayToMethod();
        obj.show(a);
    }
}
