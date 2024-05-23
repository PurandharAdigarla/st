public class AnagramChecker {
    
    public static void main(String[] args) {
        // Example usage:
        String a = "CAT";
        String b = "tac";
        
        System.out.println(isAnagram(a, b));
    }
    
    public static boolean isAnagram(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();

        if (a.equals(b)==false){
            return false;
        }
        int sumA = 0, sumB = 0;
        long productA = 1, productB = 1;
        for (int i = 0; i < a.length(); i++) {
            sumA += a.charAt(i);
            sumB += b.charAt(i);
            productA *= a.charAt(i);
            productB *= b.charAt(i);
        }
        
        return (sumA == sumB) && (productA == productB);
    }
}
