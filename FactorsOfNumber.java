public class FactorsOfNumber {
    public static void main(String[] args)
    {
        int num=18;
        for (int i = 1; i <=num/2; i++) {
            if (num%i==0) {
                System.out.print(i+ " ");
            }            
        }
    }
}
