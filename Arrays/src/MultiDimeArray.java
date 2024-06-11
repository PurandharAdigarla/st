import java.util.Scanner;

public class MultiDimeArray
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int col=sc.nextInt();
        int[][] arr=new int[row][col];
        for (int i = 0; i < row; i++)
        {
            for (int j=0; j< col; j++)
                arr[i][j]=sc.nextInt();
        }
        for (int i = 0; i < row; i++)
        {
            for (int j=0; j< col; j++)
                System.out.print(arr[i][j]+" ");
            System.out.println();
        }
        int rowindex=0;
        int colindex=0;
        System.out.println("Enter the number to find index of it");
        int findindex= sc.nextInt();
        boolean flag=false;
        for (int i = 0; i < row; i++)
        {
            for (int j=0; j< col; j++)
            {
                if (arr[i][j] == findindex)
                {
                    rowindex=i;
                    colindex=j;
                    flag=true;
                    break;
                }
            }
        }
        if (flag)
            System.out.println(rowindex+" "+colindex);
        else
            System.out.println("Not found");
    }
}
