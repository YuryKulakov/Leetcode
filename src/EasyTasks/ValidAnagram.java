package EasyTasks;

public class ValidAnagram {
    public static void main(String[] args) {
        boolean b = isAnagram("aacc", "ccac");
        System.out.println(b);
    }

    public static boolean isAnagram(String s, String t) {

        int coincidence = 0;
        if (s.length() != t.length()) {
            return false;
        }

        char[] array1 = s.toCharArray();
        char[] array2 = t.toCharArray();

        for (char c : array1) {
            for (int j = 0; j < array2.length; j++) {
                if (c == array2[j]) {
                    coincidence++;
                    array2[j] = '*';
                    break;
                }
            }
        }
        return coincidence == s.length();
    }
}
