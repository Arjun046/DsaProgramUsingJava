package RecursionTest;

public class OneToN {
    static void fun1(int i,int n){
        if(i>n){
            return;
        }
        System.out.println(i);
        fun1(i+1,n);
    }
    public static void main(String[] args) {
     int i=1;
     int n=5;
     fun1(i,n);
    }
}
