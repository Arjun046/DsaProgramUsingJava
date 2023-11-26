import java.util.Scanner;

public class FloydTriangle {
    public static void main(String[]args){
        int n,num=1,c,d;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows of floyd's triangle you want");
        n=sc.nextInt();
        System.out.println("Floyd Triangle :-");
        for(c=1;c<=n;c++){
            for(d=1;d<=c;d++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }
}
