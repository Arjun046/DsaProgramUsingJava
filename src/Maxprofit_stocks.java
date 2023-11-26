public class Maxprofit_stocks {
    //stocks problem leetcode
//     static int maxprofit(int []arr, int n){
//        int maxprofit=0;
//        int minsofar=arr[0];
//        for(int i=0;i<arr.length;i++){
//            minsofar=Math.min(minsofar,arr[i]);
//            int profit=arr[i]-minsofar;
//            maxprofit=Math.max(maxprofit,profit);
//        }
//        return maxprofit;
//    }
    //stocks problem 2
    static int maxprofit(int arr[],int n){
        int profit=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>arr[i-1]){
                profit+=(arr[i]-arr[i-1]);
            }
        }
        return profit;
    }
    public static void main(String[] args) {
        int []arr={5,1,6,1,4};
        int n=arr.length;
        System.out.println("max profit is:" +maxprofit(arr,n));

    }
}
