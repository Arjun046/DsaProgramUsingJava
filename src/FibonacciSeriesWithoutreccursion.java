import java.util.Scanner;

public class FibonacciSeriesWithoutreccursion {
    public static void main(String[]args){
    int n1=0,n2=0,n3=1,n;
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter value of n:");
    n=sc.nextInt();
    System.out.print("Fibonacci Series");
    for(int i=1;i<=n;i++) {
        n1 = n2;
        n2 = n3;
        n3 = n1 + n2;
        System.out.print(n1 + " ");
    }
    }

}
