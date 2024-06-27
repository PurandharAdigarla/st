public class NumberOfWordsInString {
    public static void main(String[] args) {
        String s = "I am learning java and and and java is a OOPs language";
        String[] words = s.split(" ");
        int wordCount = words.length;
        System.out.println("Total number of words in the string: " + wordCount);
        boolean[] flag = new boolean[words.length];
        for (int i = 0; i < words.length; i++) {
            if (flag[i])
                continue;
            int count = 1;
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    flag[j] = true;
                    count++;
                }
            }
        }
    }
}