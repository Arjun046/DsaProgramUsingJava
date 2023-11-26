public class Maxsumofk {
    public static int maxsum(int arr[],int k) {
//        int maxsum=0;//o(n^2)
//        for(int i=0;i<arr.length-k;i++){
//            int sum=0;
//            for (int j=i;j<i+k;j++){
//                sum=sum+arr[j];
//            }
//            maxsum=Math.max(sum,maxsum);
//        }
//        return maxsum;
//    }
//optimal approach
        int maxsum = 0;
        int sum = 0;
        int start = 0;
        for (int end = 0; end < arr.length; end++) {
            sum = sum + arr[end];
            if (end >= k - 1) {
                maxsum = Math.max(sum, maxsum);
                sum = sum - arr[start];
                start++;
            }

        }
        return maxsum;
    }
        
    public static void main(String[] args) {
        int arr[]={2,1,5,1,3,2};
        int k=3;
        int result=maxsum(arr,k);
        System.out.println(result);

    }
}
