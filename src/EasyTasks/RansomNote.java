package EasyTasks;

public class RansomNote {

    public static void main(String[] args) {
        String ransomNote = "aab", magazine = "baa";
        boolean result = canConstruct(ransomNote, magazine);
        System.out.println(result);
    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        if (magazine.contains(ransomNote)) {
            return true;
        }
        char[] ransom = ransomNote.toLowerCase().toCharArray();
        char[] magaz = magazine.toLowerCase().toCharArray();
        char[] result = new char[ransomNote.length()];

        for (int i = 0; i < ransom.length; i++) {
            for (int j = 0; j < magaz.length; j++) {
                if (ransom[i] == magaz[j]) {
                    result[i] = ransom[i];
                    magaz[j]=' ';
                    break;
                }
                if (j == magaz.length - 1 && ransom[i] != magaz[j]) {
                    return false;
                }
            }
        }
        return true;
    }
}