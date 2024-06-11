import java.util.Scanner;

public class ArrayTwo
{
    public static void main(String[] args) {
        int[] a=new int[10];
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < a.length ;i++)
        {
            a[i]=sc.nextInt();
        }
        for (int i = 1; i < a.length; i+=2)
        {
            System.out.println(a[i]);
        }
    }
}
