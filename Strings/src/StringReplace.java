public class StringReplace {
    public static void main(String[] args) {
        String s1="Ram";
        System.out.println(s1.hashCode());
        s1=s1.replace('m','j');
        System.out.println(s1);
        System.out.println(s1.hashCode());
        String s2="Ram";
        System.out.println(s2.hashCode());
    }
}
