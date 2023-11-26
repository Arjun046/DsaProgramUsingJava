import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[]args){
        int n,r,sum=0;
        int temp;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        temp=n;
        while (n>0){
            r=n%10;
            sum=sum+(r*r*r);
            n=n/10;
        }
        if(temp==sum){
            System.out.println("Armstrong number");
        }else {
            System.out.println("not Armstrong number");
        }
    }
}
