public class ArrayCommonNum
{
    public static void main(String[] args) {
        int[] a={12,56,87,20,33};
        int[] b={56,90,32,33,67};
        int[] c=new int[Math.min(a.length, b.length)];
        int index = 0;
        for(int i:a)
        {
            for (int j : b)
            {
                if (i == j)
                {
                    c[index++] = i;
                }
            }
        }
        for (int x:c)
            System.out.print(x+" ");
    }
}
