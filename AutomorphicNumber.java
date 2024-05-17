public class AutomorphicNumber {
    public static void main(String[] args)
    {
        int num=376, sq=1, rem=0;
        for(int i=0;i<num;i++)
        {
            sq=num*num;
            rem=sq%1000;
        }
        if (rem==num) {
            System.out.println(num+ " Automorphic number");
        }
        else
        {
            System.out.println(num+ " is Not an automorphoic number");
        }
    }
}
