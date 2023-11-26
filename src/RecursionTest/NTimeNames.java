package RecursionTest;

public class NTimeNames {
    int i,n;
    static void fun(int i,int n){
        if(i>n){
            return;
        }
        System.out.println("Pavan");
        fun(i+1,n);

    }
    public static void main(String[] args) {
     int i=1;
     int n=5;
     fun(i,n);
    }
}
