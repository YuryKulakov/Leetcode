package EasyTasks;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {3, 2, 3};
        int target = 6;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        int[] array = new int[2];
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(target-nums[i])){
                array[1]=i;
                array[0]=map.get(target-nums[i]);
                return array;
            }
            map.put(nums[i],i);
        }
        return array;
    }
}
