public class RotatedSortedArray
{
    void sort(int[] arr)
    {
        int count = 0;
        for (int i = 0; i < 2; i++) {
            int temp=arr[i];
            arr[i]=arr[arr.length-1];
            arr[arr.length-1]=temp;
            count+=1;
        }
        for (int i:arr)
            System.out.print(i+" ");
        System.out.println("\n"+count);
    }
    public static void main(String[] args) {
        int[] arr={2,3,6,12,15,18};
        RotatedSortedArray obj=new RotatedSortedArray();
        obj.sort(arr);
    }
}
