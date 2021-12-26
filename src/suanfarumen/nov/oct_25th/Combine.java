package suanfarumen.nov.oct_25th;
//给定两个整数 n 和 k，返回范围 [1, n] 中所有可能的 k 个数的组合。
//
//        你可以按 任何顺序 返回答案。
//
//         
//
//        示例 1：
//
//        输入：n = 4, k = 2
//        输出：
//        [
//        [2,4],
//        [3,4],
//        [2,3],
//        [1,2],
//        [1,3],
//        [1,4],
//        ]

import java.util.ArrayList;
import java.util.List;

public class Combine {

    public static List<List<Integer>> combine(int n, int k) {

        List<List<Integer>> res = new ArrayList<>();
        if (k<=0 || n<k) {
            return res;
        }
        List<Integer> path = new ArrayList<>();
        dfs(n,k,  1, path,  res);
        System.out.println(res);
        return res;

    }
    public static  void dfs(int n,int k, int begin, List<Integer>path, List<List<Integer>> res){
        if(path.size()==k){
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i = begin; i <= n ; i++) {
            path.add(i);
            dfs( n, k, i+1, path, res);
            path.remove(path.size()-1);
        }
    }
    public static void main(String[] args) {
        combine(4,2);
    }




}
