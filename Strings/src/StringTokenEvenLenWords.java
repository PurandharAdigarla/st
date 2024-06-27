import java.util.StringTokenizer;
public class StringTokenEvenLenWords
{
    public static void main(String[] args) {
        StringTokenizer str=new StringTokenizer("I am learning JAVA and you??"," ");
        while (str.hasMoreTokens())
        {
            //System.out.println(str.nextToken());
            String str2= str.nextToken();
            if (str2.length()%2==0)
                System.out.println(str2);
        }
    }
}
