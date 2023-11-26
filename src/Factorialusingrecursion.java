import java.util.Scanner;

public class Factorialusingrecursion {
    static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return (n * factorial(n - 1));
        }

    }
    public static void main(String[]args){
        int n,i,fact=1;
        Scanner sc=new Scanner(System.in);
        n= sc.nextInt();
        fact=factorial(n);
        System.out.println("Factorial is "+n+"is"+fact);
    }

}
