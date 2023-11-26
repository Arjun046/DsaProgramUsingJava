package mypack;

import java.util.Scanner;

public class InvertedPattern {
    public static void main(String[] args) {
        int i,j,n;

        Scanner scanner=new Scanner(System.in);
        n=scanner.nextInt();
        for ( i=n;i>=1;i--){
            for (j=i;j<n;j++){
                System.out.print(" ");
            }for (j=1;j<=(2*i-1);j++){
                System.out.print("*");

            }
            System.out.println();



        }
    }
}
