package jianzhioffer.oct_25;


//输入整数数组 arr ，找出其中最小的 k 个数。例如，输入4、5、1、6、2、7、3、8这8个数字，则最小的4个数字是1、2、3、4。
//
//         
//
//        示例 1：
//
//        输入：arr = [3,2,1], k = 2
//        输出：[1,2] 或者 [2,1]

import java.util.Arrays;

public class GetLeastNumbers {



    public static int[] getLeastNumbers(int[] arr, int k) {
        Arrays.sort(arr);
        int []ret=new int [k];
        for (int i = 0; i <k ; i++) {
            ret[i]=arr[i];
        }

        return ret;
    }



    public static void main(String[] args) {
        int  []arr ={4,8,1,6,4,3,7,9,2,11,16};
        getLeastNumbers(arr,4);
    }

}
