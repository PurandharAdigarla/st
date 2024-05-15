class Armstrong {
    public static void main(String[] args)
    {
        int am=153,sum=0,r=0;
        int temp=am;
        while (am>0) {
            r=am%10;
            am=am/10;
            sum=sum+r*r*r;
        }
        if (temp==sum) 
            System.out.println("armstrong number");
        else
        System.out.println("not armstrong");
    }
}
