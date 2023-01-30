package EasyTasks;

public class BinarySearch {
    public static void main(String[] args) {
        int[] nums={-1,0,3,5,9,12};
        System.out.println(search(nums,9));
    }

    public static int search(int[] nums, int target) {
       int leftIndex=0;
       int rightIndex= nums.length-1;

       while (leftIndex<=rightIndex){
           int mid = ((leftIndex+rightIndex)/2);
           if(nums[mid]==target){
               return mid;
           }else if(nums[mid]<target){
               leftIndex = mid+1;
           }else if(nums[mid]>target){
               rightIndex = mid-1;
           }else {
               break;
           }
       }
       return -1;
    }
}
