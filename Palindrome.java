class Palindrome {
    public static void main(String[] args)
    {
        int i=123321,r=0,n=0;
        int temp=i;
        while (i>0) {
            r=i%10;
            i=i/10;
            n=n*10+r;
        }
        if (temp==n) 
        System.out.println("Its a palindrome number");
        else
        System.out.println("Its not a palindrome number");
    }
}