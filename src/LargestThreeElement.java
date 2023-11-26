import java.util.Scanner;

public class LargestThreeElement {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter an length of array");
        int n= sc.nextInt();
        int first= sc.nextInt();
        int second = sc.nextInt();
        int third=sc.nextInt();

        System.out.println("enter an integer");
        int arr[]=new int[n];

        if(n<3){
            System.out.print("Invalid Input");
            return;
        }
        third=second=first=Integer.MIN_VALUE;
        for(int i=0;i< n;i++ ){
            arr[i]=sc.nextInt();
            if(arr[i]>first){
                third=second;
                second=first;
                first=arr[i];
            } else if (arr[i]>second && arr[i]!=first) {
                third=second;
                second=arr[i];

            } else if (arr[i]>third && arr[i]!=second) {
                third=arr[i];

            }
        }

System.out.println("three largest element arr"+first+" "+second+" "+third);

       }

    }
