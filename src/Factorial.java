import java.util.Scanner;

public class Factorial {
    public static void main(String []args){
        int n,fact=1,c;
        System.out.println("Enter an integer to calculate it's factorial");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        if(n<0){
            System.out.println("Number should be non-negative.");
        }else {
            for(c=1;c<=n;c++){
                fact=fact*c;
                System.out.print("Factorial is "+n+"is="+fact);
            }
        }
    }
}
