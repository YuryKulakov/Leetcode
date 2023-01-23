package EasyTasks;

public class PalindromeNumber {
    public static void main(String[] args) {
        int x = 1221;
        boolean what = isPalindrome(x);
        System.out.println(what);
    }

    public static boolean isPalindrome(int x) {

        String s = String.valueOf(x);
        int i = 0;
        int j = s.length() - 1;
        while (i <= j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            j--;
            i++;
        }
        return true;
//        int reversedNumber = 0;
//        int temp = x;
//        while (x != 0) {
//            reversedNumber = reversedNumber * 10 + x % 10;
//            x /= 10;
//        }
//        if (reversedNumber == temp&&temp>=0) {
//            return true;
//        } else {
//            return false;
//        }
    }
}
