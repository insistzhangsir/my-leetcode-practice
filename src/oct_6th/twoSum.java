package oct_6th;

public class twoSum {

    public static int[] twoSum(int[] numbers, int target) {
        int ret[]=new int[2];
        for(int i=0;i<numbers.length;i++)
            for (int j=i+1;j<numbers.length;j++)
                if(numbers[i]+numbers[j]==target) {
                    ret[0] = i+1;
                    ret[1] = j+1;
                }
        for (int i = 0; i <2 ; i++) {
            System.out.println(ret[i]);
        }
        return ret;
    }

    public static int[] twoSum2(int[] numbers, int target) {
        int low = 0, high = numbers.length - 1;
        while (low < high) {
            int sum = numbers[low] + numbers[high];
            if (sum == target) {
                return new int[]{low + 1, high + 1};
            } else if (sum < target) {
                ++low;
            } else {
                --high;
            }
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int nums[]={2,7,11,15};
        twoSum(nums,22);

    }
}
