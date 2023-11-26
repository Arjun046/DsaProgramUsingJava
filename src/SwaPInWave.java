import java.util.Arrays;

public class SwaPInWave {
    static void swap(int arr[],int a,int b){
        int temp=arr[a];
         arr[a]=arr[b];
         arr[b]=temp;

    }
//    static void wave(int arr[],int n){
//        Arrays.sort(arr);
//        for (int i=0;i<n-1;i+=2)
//            swap(arr,i,i+1);
//    }

    void sortInWave(int arr[], int n)
    {
        // Traverse all even elements
        for(int i = 0; i < n-1; i+=2){
            //swap odd and even positions
            if(i > 0 && arr[i - 1] > arr[i])
                swap(arr, i, i-1);
            if(i < n-1 && arr[i + 1] > arr[i])
                swap(arr, i, i+1);
        }
    }

    public static void main(String[] args) {
        SwaPInWave s=new SwaPInWave();
        int arr[]={10, 90, 49, 2, 1, 5, 23};
        int n= arr.length;
        s.sortInWave(arr,n);
        for (int i:arr){
            System.out.println(i+"  ");
        }
    }
}
