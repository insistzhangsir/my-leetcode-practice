package nov;

public class frogjumpQ {

    public static int numways(int n){

        if(n==0||n==1)
            return  1;
        if(n==2)
            return  2;

        return (numways(n-1)+numways(n-2))%100000007;
    }

    public static void main(String[] args) {
        int res=numways(7);
        System.out.println("res = " + res);
    }
}



