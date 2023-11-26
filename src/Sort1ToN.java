import java.util.Arrays;

public class Sort1ToN {
    static void sort(int arr[]){
        int i=0;

        while(i< arr.length){
            int j=arr[i]-1;
            if(arr[j]!=arr[i]){
                swap(arr,i,j);
            }else {
                i++;
            }
        }
    }
    static void swap(int arr[],int first,int last){
        int temp=arr[first];
        arr[first]=arr[last];
        arr[last]=temp;
    }
    public static void main(String[] args) {
      int arr[]={10,5,3,4,7,2,8,6,9,1};
      sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
