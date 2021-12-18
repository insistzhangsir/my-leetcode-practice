package oct_8th;
//反转字符串
public class reversestring {

    public static void reverseString(char[] s) {
        int n=s.length;
        for (int i=0,j=n-1;i<j;i++,j--){
            char temp=s[i];
            s[i]=s[j];
            s[j]=temp;
        }
        for (int i = 0; i <s.length ; i++) {
            System.out.println("s[i] = " + s[i]);
        }
    }

    public static void main(String[] args) {
        char s[]={'a','b','c','d','e'};
        reverseString(s);
    }

}
