package suanfarumen.nov.oct_6th;

public class movezero {
    public static void moveZeroes(int[] nums) {
        int n = nums.length, left = 0, right = 0;
        while (right < n) {
            if (nums[right] != 0) {
                swap(nums, left, right);
                left++;
            }
            right++;
        }
    }

    public static void  swap(int[] nums, int left, int right) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }



    public static void main(String[] args) {
        int nums[]={0,4,0,8,12,0,1};
        moveZeroes(nums);
    }

}
