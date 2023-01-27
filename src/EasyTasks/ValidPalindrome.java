package EasyTasks;

public class ValidPalindrome {
    public static void main(String[] args) {
        isPalindrome("A man, a plan, a canal: Panama");
    }

    public static boolean isPalindrome(String s) {
        s = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        String str=new StringBuilder(s).reverse().toString();
        return str.equals(s);
    }
}
