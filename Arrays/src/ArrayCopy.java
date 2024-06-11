import java.util.Arrays;
import java.util.Scanner;
public class ArrayCopy
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the size of an array");
        int[] arr=new int[sc.nextInt()];
        int[] copyarr=new int[arr.length];

        System.out.println("Enter elements of an array");
        for (int i = 0; i < arr.length; i++) {
            arr[i]= sc.nextInt();
        }
        System.out.println("Array:");
            System.out.print(Arrays.toString(arr));

        System.out.println("\nCoped Array:");
        copyarr=arr.clone();
        System.out.println(Arrays.toString(copyarr));
        System.out.println(Arrays.equals(arr, copyarr));
        System.out.println(arr==copyarr);
    }
}
