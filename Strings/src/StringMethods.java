public class StringMethods
{
    public static void main(String[] args) {
        String str=" purandhar ";
        String str1="PURANDHAR";
        char ch='a';
        System.out.println(str.charAt(4));
        System.out.println(str.codePointAt(4));
        System.out.println(str.codePointBefore(4));
        System.out.println(str.codePointCount(0,8));
        System.out.println(str.compareTo(str1));
        System.out.println(str.compareToIgnoreCase(str1));
        System.out.println(str.concat(str1));
        System.out.println(str.equals(str1));
        System.out.println(str.equalsIgnoreCase(str1));
        System.out.println(str.indexOf('a',4));
        System.out.println(str.lastIndexOf('r'));
        System.out.println(str.replace('p','P'));
        System.out.println(str.contains(str1));
        System.out.println(str.length());
        System.out.println(str.toUpperCase());
        System.out.println(str.trim());
        System.out.println(str.trim().length());
    }
}
