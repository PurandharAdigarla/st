import java.util.Scanner;

public class StringReverse
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        String rev="";
        for (int i = 0; i < str.length(); i++)
        {
            rev=str.charAt(i)+rev;
        }
        System.out.println("Reversed String: "+rev);
        System.out.println();
    }
}
