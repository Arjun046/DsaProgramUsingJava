public class SubarrayWithGivenSum {
    public static  void sum3(int arr[],int n,int sum){
        int currsum=arr[0],start=0,i;
        for(i=1;i<=n;i++){
            while(currsum>sum && start<i-1){
                currsum=currsum-arr[start];
                start++;
            }
            if(currsum==sum){
                int p=i-1;
                System.out.print("sum of index start are:" + start + "and  end index are"+ p);
            }
            if(i<n){
                currsum+=arr[i];
            }

        }
        System.out.println("no subarray found");

    }
    public static void main(String[] args) {
        SubarrayWithGivenSum sum1=new SubarrayWithGivenSum();
        int arr[]={1,4,20,3,10,5};
        int sum2=33;
        int n= arr.length;
        sum1.sum3(arr,n,sum2);

    }
}
