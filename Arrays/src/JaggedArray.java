import java.util.Arrays;
import java.util.Scanner;
public class JaggedArray
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int rows = sc.nextInt();//5
        int[][] arr = new int[rows][];
        for (int i = 0; i < rows; i++) {
            System.out.println("Enter the no of cols in row[" + i + "]");
            arr[i] = new int[sc.nextInt()];
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Print the elements of arr[" + i + "]");
            // arr=new int[rows][col1];
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Jagged Array");
        for (int[] a : arr) {
//            for (int b : a) {
//                System.out.print(b + " ");
            System.out.println(Arrays.toString(a));
            }
           System.out.println();
        }
    }
