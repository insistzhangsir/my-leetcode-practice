package suanfarumen.nov.oct_6th;

public class rotate {
    public static void rotate(int[] nums, int k) {
        int n=nums.length;
        int ret[]=new int [n];
        for (int i = 0; i <nums.length ; i++) {
            ret[(i+k)%nums.length]=nums[i];
        }
        for (int j = 0; j <nums.length ; j++) {
            System.out.println(ret[j]);
        }
    }

    public static void main(String[] args) {
        int nums[]={1,2,3,4,5,6,7};
        rotate(nums,3);
    }
}
