public class StringMostRepeatedWord {
    public static void main(String[] args) {
        String s = "I am learning java and and and java is a OOPs language";
        String[] words = s.split(" ");
        boolean[] flag = new boolean[words.length];
        int maxCount = 0;
        String mostRepeatedWord = "";

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
            if (count > maxCount) {
                maxCount = count;
                mostRepeatedWord = words[i];
            }
        }
        if (maxCount > 1) {
            System.out.println("The most repeated word is \"" + mostRepeatedWord + "\" with a frequency of " + maxCount);
        } else {
            System.out.println("No word is repeated.");
        }
    }
}