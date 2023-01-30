package EasyTasks;

public class BinarySearch {
    public static void main(String[] args) {
        int[] nums={-1,0,3,5,9,12};
        System.out.println(search(nums,89));
    }

    public static int search(int[] nums, int target) {
        int left = 0, right = nums.length;

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] <= target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        if (left > 0 && nums[left - 1] == target) {
            return left - 1;
        } else {
            return -1;
        }
    }
}
