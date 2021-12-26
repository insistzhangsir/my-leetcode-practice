package suanfarumen.nov.oct_13th;

import java.util.Arrays;

//滑动窗口 判断串s1是否在s2中有排列
public class CheckInclusion {
    public static boolean checkInclusion(String s1, String s2) {
//        Set<Character> List = new HashSet<Character>();
//        for(int i=0;i<s1.length();i++){
//            List.add(s1.charAt(i));
//        }
//        for(int j=0;j<s2.length();j++){
//            int r=0;
//            while (List.contains(s2.charAt(j))&&j<s2.length()){
//                j++;
//                r++;
//            }
//            if(r==s1.length()){
//                return true;
//            }
//
//        }
//        return false;

        int n = s1.length(), m = s2.length();
        if (n > m) {
            return false;
        }
        int[] cnt1 = new int[26];
        int[] cnt2 = new int[26];
        for (int i = 0; i < n; ++i) {
            ++cnt1[s1.charAt(i) - 'a'];   //统计英文字母的方法
            ++cnt2[s2.charAt(i) - 'a'];
        }
        if (Arrays.equals(cnt1, cnt2)) {
            return true;
        }
        for (int i = n; i < m; ++i) {
            ++cnt2[s2.charAt(i) - 'a'];       //向右窗口➕1
            --cnt2[s2.charAt(i - n) - 'a'];   //向左窗口➖1
            if (Arrays.equals(cnt1, cnt2)) {
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
       String s1 = "dab", s2 = "eidbaooo";
       if(checkInclusion(s1,s2)) {
           System.out.println(1);
       }else {
           System.out.println(0);
       }
    }
}
