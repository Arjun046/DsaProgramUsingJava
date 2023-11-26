package Sorting;

public class Selection {
    public static void selection(int arr[],int n){
        for(int i=0;i<n-1;i++){
            int min=i;
            for (int j=i+1;j<n;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            if (min!=i){
                int temp=arr[min];
                arr[min]=arr[i];
                arr[i]=temp;
            }
        }

    }
    public static void main(String[] args) {
        int arr[]={4,1,9,2,3,6};
        int n= arr.length;
        selection(arr,n);
        for (int i=0;i<n;i++){
            System.out.println(arr[i]);
        }

    }
}
