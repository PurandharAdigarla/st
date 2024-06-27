public class StringCharFrequency
{
        public static void main(String[] args) {
            String str="Purandhar Adigarla";
            boolean[] flag=new boolean[str.length()];
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
                System.out.println("Frequency of character "+str.charAt(i)+" is "+count);
            }
        }
    }
