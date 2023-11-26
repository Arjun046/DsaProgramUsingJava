package mypack;

import java.util.Scanner;

public class HalfPiramid {
    public static void main(String[] args) {
        int i,j,n;
        Scanner scanner=new Scanner(System.in);
        n=scanner.nextInt();
        for (i=1;i<=n;i++){
            for (j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (i=n-1;i>0;i--){
            for (j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
