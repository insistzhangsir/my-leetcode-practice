package suanfarumen.nov.oct_8th;
//反转字母
public class reveserwords {

    public static  String reverseWords(String s) {
        StringBuffer ret = new StringBuffer();
        int i=0;
        while(i<s.length()){
            int start=i;
            while(i<s.length()&&s.charAt(i)!=' '){
                i++;
            }
            for(int p=start;p<i;p++){
              ret.append(s.charAt(start+i-1-p));
            }
            while(i<s.length()&&s.charAt(i)==' '){
                i++;
                ret.append(' ');
            }
        }
        return ret.toString();
    }




    public static void main(String[] args) {
        String s="Let's take LeetCode contest";
        String ret=reverseWords(s);
        System.out.println(ret);
    }

}

