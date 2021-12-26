package suanfarumen.nov.oct_25th;
//给定一个不含重复数字的数组 nums ，返回其 所有可能的全排列 。你可以 按任意顺序 返回答案。
//
//         
//
//        示例 1：
//
//        输入：nums = [1,2,3]
//        输出：[[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]

import java.util.ArrayList;
import java.util.List;

//https://leetcode-cn.com/problems/permutations/solution/hui-su-suan-fa-python-dai-ma-java-dai-ma-by-liweiw/

public class permute {


    public static List<List<Integer>> permute(int[] nums) {
        int len = nums.length;
        // 使用一个动态数组保存所有可能的全排列
        List<List<Integer>> res = new ArrayList<>();
        if (len == 0) {
            return res;
        }
        boolean[] used = new boolean[len];

        List<Integer> path = new ArrayList<>();

        dfs(nums, len, 0, path, used, res);
        return res;

    }

    public static void dfs(int[] nums, int len, int depth, List<Integer> path, boolean[] used, List<List<Integer>> res) {

        if (depth == len) {
            res.add(new ArrayList<>(path));
            return;
        }

        // 在非叶子结点处，产生不同的分支，这一操作的语义是：在还未选择的数中依次选择一个元素作为下一个位置的元素，这显然得通过一个循环实现。
        for (int i = 0; i < len; i++) {
            if (!used[i]) {
                path.add(nums[i]);
                used[i] = true;

                dfs(nums, len, depth + 1, path, used, res);
                // ****************************重点  ，回溯的过程状态变量需要设置成为和先前一样 ，因此在回到上一层结点的过程中，需要撤销上一次的选择，这个操作称之为「状态重置」
                // 注意：下面这两行代码发生 「回溯」，回溯发生在从 深层结点 回到 浅层结点 的过程，代码在形式上和递归之前是对称的
                used[i] = false;
                path.remove(path.size() - 1);
            }
        }
    }


    public static void main(String[] args) {
        int[] nums={1,2,3};
        List<List<Integer>> lists = permute(nums);
        System.out.println(lists);
    }
}
