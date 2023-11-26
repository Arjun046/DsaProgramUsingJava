public class MissingNumber {
    public static  int GetMissing(int arr[],int n){
        int sum=((n+1)*(n+2))/2;
        for (int i=0;i<n;i++){
            sum-=arr[i];

        }
        return sum;
    }
    public static void main(String[] args) {
        int arr[]={1,2,4,5,6,7};
        int n=arr.length;
        System.out.println(GetMissing(arr,n));
    }
}
