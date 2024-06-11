import java.util.Scanner;
public class ArraySecondLargeNum
{
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the size of the array");
            int[] arr=new int[sc.nextInt()];
            System.out.println("Enter the elements of the array");
            for (int i = 0; i < arr.length; i++) {
                arr[i]= sc.nextInt();
            }
            int max = arr[0];
            int secondMax = arr[0];

            for (int num : arr) {
                if (num > max) {
                    secondMax = max;
                    max = num;
                } else if (num > secondMax && num < max) {
                    secondMax = num;
                }
            }
            System.out.println("Largest number in the array is: " + max);
            System.out.println("Second largest number in the array is: " + secondMax);
        }
}
