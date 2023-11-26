import java.util.Scanner;

public class Duplicateremoveelement {
    public static int removeduplicate(int a[],int n) {

        if (n == 0 || n == 1) {
            return n;
        }
        int j = 0;

        // check if the ith element is not equal to
        // the (i+1)th element, then add that element
        // at the jth index in the same array
        // which indicates that te particular element
        // will only be added once in the array
        for (int i = 0; i < n - 1; i++) {
            if (a[i] != a[i + 1]) {
                a[j++] = a[i];
            }
        }

        a[j++] = a[n - 1];

        return j;
    }
    public static void main(String[]args){
        int n,temp;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int a[]=new int[n];
        n=removeduplicate(a,n);
        for(int i=0;i<n;i++){
            System.out.println(a[i] +" ");
        }

    }
}
