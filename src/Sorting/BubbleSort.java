package Sorting;

public class BubbleSort {
    static void bubblesort(int arr[],int n){
        int i,j,temp;
        boolean swapped;
        for (i=0;i<n-1;i++){
            swapped=false;
            for (j=0;j<n-i-1;j++){
                if(arr[j+1]<arr[j]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swapped=true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={4,3,7,1,5};
        int n= arr.length;
        bubblesort(arr,n);
        for (int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }

}