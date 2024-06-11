public class ArraySmallNum
{
    public static void main(String[] args) {
        int[] arr={12,43,3,43,13,98,65};
        int min=arr[0];
        for(int i:arr)
        {
            if(i<min)
            {
                min=i;
            }
        }
        System.out.println(min);
    }
}
