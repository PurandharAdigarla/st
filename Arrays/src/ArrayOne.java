import java.util.Scanner;
public class ArrayOne
{
    public static void main(String[] args)
    {
        //int[] a ={1,5,2,6,9};

        Scanner sc=new Scanner(System.in);
        int j= sc.nextInt();
        int[] b=new int[j];
//        for(int i=0; i<a.length;i++)
//            System.out.println(a[i]);
        for (int i = 0; i<j; i++)
        {
            b[i]=sc.nextInt();;
        }
        for (int i=j-1; i>=0; i--) {
            System.out.print(b[i]+" ");
        }
    }
}
