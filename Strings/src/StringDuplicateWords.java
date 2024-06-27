public class StringDuplicateWords {
    public static void main(String[] args) {
        String s = "I am learning java and java is a OOPs language";
        String[] words = s.split(" ");
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
            if (count > 1) {
                System.out.println("Duplicate word: " + words[i] + " (Count: " + count + ")");
            }
        }
    }
}