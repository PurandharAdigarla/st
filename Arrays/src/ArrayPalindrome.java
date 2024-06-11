import java.util.Scanner;
public class ArrayPalindrome
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int[] arr=new int[sc.nextInt()];
        boolean flag=false;
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < arr.length; i++) {
            arr[i]= sc.nextInt();
        }
        int len=arr.length;
        for (int i = 0; i < len; i++)
        {
            if (arr[i] == arr[len - 1])
                flag = true;
            len -= 1;
        }
            if (flag)
                System.out.println("Is palindrome");
            else
                System.out.println("Not palindrome");
    }
}
