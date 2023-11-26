public class LargestSum {
     static int maxsum(int arr[]){
         int maxsum=arr[0];
         int sum=arr[0];

         for(int i=1;i<arr.length;i++){
             if(sum<0){
                 sum=arr[i];
             }else{
                 sum=sum+arr[i];
             }
             maxsum=Math.max(sum,maxsum);
         }
         return maxsum;
     }
         //kadanes algorithms
//        int currsum=0;
//        int maxsum=0;
//        for (int i=0;i< arr.length;i++){
//            currsum=currsum+arr[i];
//            if(currsum>maxsum){
    //                maxsum=currsum;
//            }
//            if(currsum<0){
//                currsum=0;
//            }
//        }
//        return maxsum;
//    }
    public static void main(String[] args) {
        int arr[]={5,-1,2,4,-4,5};
        System.out.println(maxsum(arr));

    }
}


