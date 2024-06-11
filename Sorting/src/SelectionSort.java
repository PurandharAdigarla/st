import java.util.Scanner;
public class SelectionSort
{
    void sort(int[] arr)
    {
        for (int i=0;i<arr.length;i++)
        {
            int min=i;

            for (int j = i+1; j < arr.length; j++)
            {
                if(arr[j]<arr[min])
                    min=j;
            }
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }
        System.out.println("Sorted array:");
        for (int a:arr)
            System.out.print(a+" ");
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int[] arr=new int[sc.nextInt()];
        System.out.println("Enter the elements of an array");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        SelectionSort obj=new SelectionSort();
        obj.sort(arr);
    }
}
