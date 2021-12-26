package suanfarumen.nov.oct_23th;

import java.util.ArrayList;
import java.util.List;
//给定一个字符串S，通过将字符串S中的每个字母转变大小写，我们可以获得一个新的字符串。返回所有可能得到的字符串集合。
//输入：S = "a1b2"
//        输出：["a1b2", "a1B2", "A1b2", "A1B2"]
public class LetterCasePermutation {

    static List<String>  res = new ArrayList();

    /*     */
    public static List<String> letterCasePermutation(String S) {
        List<StringBuilder> ans = new ArrayList();
        ans.add(new StringBuilder());

        for (char c: S.toCharArray()) { //遍历串中的每一个字符
            int n = ans.size();
            if (Character.isLetter(c)) {   //如果该字符是字母的话
                for (int i = 0; i < n; ++i) {
                    ans.add(new StringBuilder(ans.get(i)));   //把当前LIST中每一个元素复制一份
                    ans.get(i).append(Character.toLowerCase(c));    //将该字符小写加入第一份的最后
                    ans.get(n+i).append(Character.toUpperCase(c));  //将该字符大写加入第二份的最后
                }
            } else {   //如果是数字就直接加在每一份的最后
                for (int i = 0; i < n; ++i)
                    ans.get(i).append(c);
            }

        }

        List<String> finalans = new ArrayList();
        for (StringBuilder sb: ans)
            finalans.add(sb.toString());
        for (String i : finalans) {
            System.out.println(i);
        }
        return finalans;
    }



    public List<String> letterCasePermutation2(String S) {  //递归  方法2
        char[] chs = S.toCharArray();
        int n = chs.length;
        dfs(chs, n, 0);
        return res;
    }


    private void dfs(char[] chs, int n, int begin) {
        res.add(new String(chs));
        for(int i = begin; i < n; i++){
            if(!Character.isDigit(chs[i])){
                char tmp = chs[i];
                chs[i] = (char)(chs[i] - 'a' >= 0 ? chs[i] - 32 : chs[i] + 32);
                dfs(chs, n, i + 1);
                chs[i] = tmp;
            }
        }
    }




    public static void main(String[] args) {
        String S1="An13B";
        letterCasePermutation(S1);
    }
}
