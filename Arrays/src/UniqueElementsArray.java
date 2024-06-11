import java.util.Scanner;
public class UniqueElementsArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int[] arr=new int[sc.nextInt()];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < arr.length; i++) {
            arr[i]= sc.nextInt();
        }
        boolean[] visited = new boolean[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (visited[i]) {
                continue;
            }
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    visited[j] = true;
                }
            }
        }
        int uniqueCount = 0;
        for (boolean b : visited) {
            if (!b) {
                uniqueCount++;
            }
        }
        int[] uniqueArr = new int[uniqueCount];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (!visited[i]) {
                uniqueArr[index++] = arr[i];
            }
        }
        System.out.println("Array without duplicates:");
        for (int value : uniqueArr) {
            System.out.print(value + " ");
        }
    }
}
