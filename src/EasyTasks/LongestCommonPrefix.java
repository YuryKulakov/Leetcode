package EasyTasks;

import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String [] strs = {"spoiler", "flower", "flow", "flight"};
        System.out.println(longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs) {
        StringBuilder stringBuilder = new StringBuilder();
        if (strs.length == 1) {
            return strs[0];
        }
        Arrays.sort(strs);
        int length = strs[0].length();
        int index = 0;

        while (index < length) {
            if (strs[0].charAt(index) == strs[strs.length - 1].charAt(index)) {
                stringBuilder.append(strs[0].charAt(index));
            } else {
                break;
            }
            index++;
        }
        return stringBuilder.toString();
    }
}
