public class ConvertingIntergerToBinary {
    public static void main(String[] args)
    {
        int n=3;
        int r=0;
        while (n>0) {
            r=n%2;
            n=n/2;
            System.out.print(r);
        }
    }
}
