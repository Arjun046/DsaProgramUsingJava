import java.util.Scanner;

public class Division {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k =sc.nextInt();
        int totalsplit=0;
        for(int i=0;i<n;i++){
            int charged=sc.nextInt();
            if(i!=k){
                totalsplit+=charged;
            }
        }
        int actual=sc.nextInt();
        if(totalsplit/2 >=actual){
            System.out.println("Bon Appetit");
        }
        else{
            System.out.println(actual-totalsplit/2);
        }
    }
}
