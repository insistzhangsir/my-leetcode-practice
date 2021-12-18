package nov;


import java.util.Arrays;

public class repeatnum {

    public static int findRepeatNumber(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++) {
            if (nums[i] == nums[i + 1])
                return nums[i];
        }
        return -1;
    }

    public static void swap(int [] nums, int i, int j){
        nums[i]=nums[i]^nums[j];
        nums[j]=nums[i]^nums[j];
        nums[i]=nums[i]^nums[j];

    }


    public static void main(String[] args) {
        int [] nums={2,5,7,4,9,5,5,3,2,9,13};
        System.out.println(nums[0]);
        System.out.println(nums[1]);
        int res=findRepeatNumber( nums);
        swap(nums,0,1);
        System.out.println(nums[0]);
        System.out.println(nums[1]);
      //  System.out.println(res);


    }
}
