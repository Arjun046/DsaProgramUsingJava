package mypack;


import java.util.Arrays;

public class Mathematics {
    public static void main(String[] args) {
//        boolean isprime[]=sieveOfentrosieve(20);
//        for (int i=0;i<=20;i++){
//            System.out.println(i+ ""+isprime[i]);
//        }
//        System.out.println(gcd(24,60));
        System.out.println(fastpower(3773663,5,1000007));

    }
    static long fastpower(long a,long b,int n){
        long res=1;
        while (b>0){
            if((b&1)!=0){
                res=(res*a%n)%n;
            }
            a=(a%n *a%n)%n;
            b=b>>1;
        }
        return res;
    }
    static int gcd(int a,int b){
        if(b==0)
            return a;
        return gcd(b,a%b);
    }
    static boolean[] sieveOfentrosieve(int n){
        boolean isprime[]=new boolean[n+1];
        Arrays.fill(isprime,true);
        isprime[0]=false;
        isprime[0]=false;

        for(int i=2;i*i<=n;i++){
            for(int j=2*i;j<=n;j+=i){
                isprime[j]=false;


            }
        }
        return isprime;


    }
}
