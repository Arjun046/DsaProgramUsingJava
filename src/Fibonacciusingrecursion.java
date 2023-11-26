import java.util.Scanner;

public class Fibonacciusingrecursion {
    static int n1 = 0, n2 = 1, n3 = 0, n;

    static void fibonacci(int n) {
        if (n > 0) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.print(" " + n3);
            fibonacci(n - 1);
        }
    }


    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        System.out.print(n1+" "+n2);
        fibonacci(n-2);
    }
}
