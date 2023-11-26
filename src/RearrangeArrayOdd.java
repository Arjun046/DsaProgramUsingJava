public class RearrangeArrayOdd {
    static void Rearrange(int arr[],int n){
        for(int i=1;i<n;i++){
            if(i%2==0){
                if(arr[i]<arr[i-1]){
                    int temp=arr[i];
                    arr[i]=arr[i-1];
                    arr[i-1]=temp;
                }
            }else{
                if(arr[i]>arr[i-1]){
                    int temp=arr[i];
                    arr[i]=arr[i-1];
                    arr[i-1]=temp;
                }
            }
        }
        for (int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        int n = 5;
        int arr[] = { 1, 3, 2, 2, 5 };
        Rearrange(arr, n);
    }
}
