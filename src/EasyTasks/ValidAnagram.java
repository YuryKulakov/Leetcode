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

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    coincidence++;
                    array2[j] = '*';
                    break;
                }
            }
        }
        if (coincidence == s.length())
            return true;

        return false;
    }
}
