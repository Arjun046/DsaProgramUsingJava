import java.util.*;
import java.io.*;
public class Distinctarray {
    static void distinct(int arr[],int n){
//        for(int i=0;i<n;i++){
//            int j;
//            for(j=0;j<i;j++)
//                if(arr[i]==arr[j])
//                    break;
//
//                if(i==j){
//                    System.out.print(arr[i]+" ");
//                }
//
//        }
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            while(i<n-1 && arr[i]==arr[i+1])
                i++;

            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
int arr[]={6,10,5,6,4,3,6,4,6,3};
int n= arr.length;
distinct(arr,n);
    }
}
