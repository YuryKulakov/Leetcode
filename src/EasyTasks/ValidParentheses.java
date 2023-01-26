package EasyTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ValidParentheses {
    public static void main(String[] args) {
        System.out.println(isValid("{{[}]}"));
    }

    public static   boolean isValid(String s) {

        while (s.contains("{}") || s.contains("()") || s.contains("[]")) {
            s = s.replace( "{}", "");
            s = s.replace("()", "");
            s = s.replace ("[]", "");
        }
        return s.isEmpty();
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
