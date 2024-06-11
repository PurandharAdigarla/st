import java.util.Scanner;

public class ArrayLargeNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int[] arr=new int[sc.nextInt()];
        boolean flag=false;
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < arr.length; i++) {
            arr[i]= sc.nextInt();
        }
        int max = arr[0];
        for (int b : arr) {
            if (b > max) {
                max = b;
            }
        }
        System.out.println("Largest number in the array is: "+max);
    }
}
