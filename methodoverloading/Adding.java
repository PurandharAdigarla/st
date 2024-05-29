package methodoverloading;

import java.util.Scanner;

public class Adding
{
    int sum(int a, int b)
    {
        int sum= a+b;
        System.out.println(sum);
        return sum;
    }
    float sum(float a,float b)
    {
        float sum= a+b;
        System.out.println(sum);
        return sum;
    }
    public static void main(String[] args) {
        Adding obj=new Adding();
        Scanner sc=new Scanner(System.in);
        obj.sum(sc.nextInt(),sc.nextInt());
        obj.sum(12.433f,87.23f);
    }
}
