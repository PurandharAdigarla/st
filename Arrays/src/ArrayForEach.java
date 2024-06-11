public class ArrayForEach
{
    public static void main(String[] args)
    {
        int[] a={10,12,44,16,87,90};
        int sum=0;
        for(int i:a) //for each element in an array
        {
            System.out.print(i+" ");
            sum=sum+i;
        }
        System.out.println("\nsum = "+sum);

        int[] b=a.clone();
        for (int j:b)
        {
            System.out.print(j+" ");
        }
    }
}
