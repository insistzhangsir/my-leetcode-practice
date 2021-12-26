package suanfarumen.nov;

public class searchInsert {
    public  static int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int l=0,r=n-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(nums[mid]<target)
                l=mid+1;
            else
                r=mid-1;
        }
        return l;
    }


    public static void main(String[] args) {
        int nums[]={1,3,5,6,8,9,11};
        int res= searchInsert(nums,7);
        System.out.println("res = " + res);
    }
}
