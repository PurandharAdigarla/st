public class SmallAndLargeWordOfString {
    public static void main(String[] args) {
        String s = "I am learning java and and and java is a OOPs language";
        String[] words = s.split(" ");
        boolean[] flag = new boolean[words.length];
        int maxCount = 0;
        String mostRepeatedWord = "";
        String largestWord = "";
        String smallestWord = s;

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

            // Check for the largest word
            if (words[i].length() > largestWord.length()) {
                largestWord = words[i];
            }

            // Check for the smallest word
            if (words[i].length() < smallestWord.length()) {
                smallestWord = words[i];
            }
        }
        System.out.println("The largest word is: " + largestWord );
        System.out.println("The smallest word is: " + smallestWord );
    }
}
