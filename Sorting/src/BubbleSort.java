import java.util.Scanner;
public class BubbleSort
{
    void sort(int[] arr)
    {
        for (int i = 0; i < arr.length-1;i++)
        {
            for (int j = 0; j < arr.length-i-1 ; j++) {
                if (arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
//                    arr[j]=arr[j]+arr[j+1];
//                    arr[j+1]=arr[j]-arr[j+1];
//                    arr[j]=arr[j]-arr[j+1];
                }
            }
        }
        System.out.println("Sorted array:");
        for(int a: arr)
        {
            System.out.print(a+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of an array");
        int[] arr=new int[sc.nextInt()];
        System.out.println("Enter elements of an array");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        BubbleSort obj=new BubbleSort();
        obj.sort(arr);
    }
}
