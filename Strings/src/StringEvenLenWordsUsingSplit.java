public class StringEvenLenWordsUsingSplit
{
    public static void main(String[] args) {
        String str=("I am learning JAVA and you??");
        String[] words=str.split(" ");
        for(String a:words)
            if(a.length()%2==0)
                System.out.println(a);
    }
}
