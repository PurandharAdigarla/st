import java.util.Scanner;
public class LocalNestedMathOperations
{
    void performOperation(int a, int b)
    {
        class Addition
        {
            int sum=0;
            int add(int a, int b)
            {
                sum=a+b;
                System.out.println("Sum of "+a+" and "+b+" is "+sum);
                return sum;
            }
        }
        Addition obj=new Addition();
        obj.add(a,b);
    }
    public static void main(String[] args) {
        LocalNestedMathOperations obj=new LocalNestedMathOperations();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the numbers to be added: ");
        obj.performOperation(sc.nextInt(),sc.nextInt());
    }
}
