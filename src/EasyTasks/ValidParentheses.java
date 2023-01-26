package EasyTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        System.out.println(isValid("{[]}"));
    }

    public static boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.size() > 0) {
                    char temp = stack.pop();
                    if ((temp == '(' && c != ')') || (temp == '{' && c != '}') || (temp == '[' && c != ']')) {
                        return false;
                    }
                } else {
                    return false;
                }
            }
        }
        return stack.size() == 0 ? true : false;

//        while (s.contains("{}") || s.contains("()") || s.contains("[]")) {
//            s = s.replace( "{}", "");
//            s = s.replace("()", "");
//            s = s.replace ("[]", "");
//        }
//        return s.isEmpty();
//        boolean what = false;
//        List<String> list = new ArrayList();
//        Collections.addAll(list, s.split(""));
//        for(int i=0;i<list.size()-1;i++){
//            if(list.get(i).equals("(")){
//                what = list.get(i+1).equals(")");
//                i++;
//            }else if(list.get(i).equals("[")){
//                what = list.get(i+1).equals("]");
//                i++;
//            }else if(list.get(i).equals("{")){
//                what = list.get(i+1).equals("}");
//                i++;
//            }
//        }
//        return what;
    }
}
