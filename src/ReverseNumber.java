import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[]args){
        int n,reverse=0,rem;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        while (n>0){
            rem=n%10;
            reverse=reverse*10+rem;
            n=n/10;
            System.out.println(reverse);
        }
    }
}
