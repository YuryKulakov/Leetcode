package EasyTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RomanToInteger {
    public static void main(String[] args) {
        System.out.println(romanToInt("III"));
    }

    public static int romanToInt(String s) {
        String[] romeNumbers = s.split("");
        List<Integer> listNumbers = new ArrayList<>();
        Map<String, Integer> map = new HashMap();
        int result = 0;
        int value, nextValue;
        map.put("I", 1);
        map.put("V", 5);
        map.put("X", 10);
        map.put("L", 50);
        map.put("C", 100);
        map.put("D", 500);
        map.put("M", 1000);

        for (String str : romeNumbers) {
            int temp = map.get(str);
            listNumbers.add(temp);
        }
        for (int i = 0; i < listNumbers.size(); i++) {
            value = listNumbers.get(i);
            if (i != listNumbers.size()-1) {
                nextValue = listNumbers.get(i + 1);
                if (nextValue > value) {
                    value = nextValue - value;
                    i++;
                }
                result += value;
            }else {
                result+=value;
            }
        }
        return result;
    }
}
