package suanfarumen.nov.oct_6th;

public class sortedSquare {

    public static int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int[] ans = new int[n];
        int i=0,j=n-1,pos=n-1;
        while(i<=j){
            if(nums[i]*nums[i]>nums[j]*nums[j]){
                ans[pos]=nums[i]*nums[i];
                i++;
            }else{
                ans[pos]=nums[j]*nums[j];
                j--;
            }
            pos--;
       }
        for (int k = 0; k <n ; k++) {
            System.out.println(ans[k]);
        }
        return ans;
    }

    public static void main(String[] args) {
        int nums[]={-4,-2,0,3,6};
        sortedSquares(nums);

    }
}
