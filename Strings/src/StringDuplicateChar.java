public class StringDuplicateChar
{
    public static void main(String[] args) {
        String str="Purandhar Adigarla";
        String str2="";
        boolean[] flag=new boolean[str.length()];
        System.out.print("Duplicates Characters in the above string: ");
        for (int i = 0; i < str.length(); i++)
        {
            if (flag[i])
                continue;
            int count=1;
            for (int j=i+1;j<str.length();j++)
            {
                if(str.charAt(i)==str.charAt(j)) {
                    flag[j] = true;
                    count++;
                }
            }
            if (count>1)
            {
                System.out.print(str.charAt(i));
            }
        }
    }
}
