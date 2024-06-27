public class StringBuffPalindrome
{
    public static void main(String[] args) {
        String str="malayalam";
        StringBuffer obj=new StringBuffer(str);
        String rev=new String(obj.reverse());
        if(str.equals(rev))
            System.out.println(str+" is Palindrome");
        else
            System.out.println("Not palindrome");
    }
}
