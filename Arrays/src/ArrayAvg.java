import java.util.Scanner;

public class ArrayAvg {

    void avg(int[] arr) {
        if (arr.length == 0) {
            System.out.println("No ages provided.");
            return;
        }

        int sum = 0;
        for (int age : arr) {
            sum += age;
        }
        double average = (double) sum / arr.length;

        int closestAge = arr[0];
        double minDiff = arr[0];
        if (minDiff < 0) {
            minDiff = -minDiff;
        }

        for (int i = 1; i < arr.length; i++) {
            double diff = arr[i] - average;
            if (diff < 0) {
                diff = -diff;
            }
            if (diff < minDiff) {
                minDiff = diff;
                closestAge = arr[i];
            }
        }

        System.out.println("Average age is: " + average);
        System.out.println("The age closest to the average is: " + closestAge);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        if (size <= 0) {
            System.out.println("Size must be greater than zero.");
            sc.close();
            return;
        }

        int[] arr = new int[size];
        System.out.println("Enter the ages in the array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        ArrayAvg obj = new ArrayAvg();
        obj.avg(arr);
        sc.close();
    }
}
