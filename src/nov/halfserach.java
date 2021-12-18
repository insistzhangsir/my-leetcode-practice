package nov;

public class halfserach {



    private static int search(int[] nums, int target) {
//        int low =0;
//        int high = nums.length-1;
//        int mid=(low+high)/2;
//        while(low<=high){
//            mid=(low+high)/2;
//            if(nums[mid]==target)
//                return mid;
//            else if(nums[mid]>target)
//                high=mid-1;
//            else if(nums[mid]<target)
//                low=mid+1;
//        }
//        return -1;
        int low = 0, high = nums.length - 1;
        while (low <= high) {
            int mid = (high - low) / 2 + low;
            int num = nums[mid];
            if (num == target) {
                return mid;
            } else if (num > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        int a[]= {1,3,5,6,9,11,12};
        int res=search(a,23);
        System.out.println("res = " + res);
    }
}
