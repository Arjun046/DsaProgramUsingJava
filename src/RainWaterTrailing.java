public class RainWaterTrailing {
    //rain water trailing problem leetcode
    static int rainwater(int arr[],int n){
     //two pointer approach
        int left=0;
        int right=n-1;
        int l_max=0;
        int r_max=0;
        int result=0;
        while(left<=right){
            if(r_max<=l_max){
                result+=Math.max(0,r_max-arr[right]);
                r_max=Math.max(r_max,arr[right]);
                right-=1;
            }else {
                result+=Math.max(0,l_max-arr[left]);
                    l_max=Math.max(l_max,arr[left]);
                    left+=1;

            }
        }
        return result;
//        int n = arr.length;
//        int left[]=new int[n];
//        int right[]=new int[n];
//        left[0]=arr[0];
//        for(int i=1;i<n;i++){
//            left[i]=Math.max(left[i-1],arr[i]);
//            }
//        right[n-1]=arr[n-1];
//        for(int i=n-2;i>=0;i--){
//            right[i]=Math.max(right[i+1],arr[i]);
//        }
//        int ans=0;
//        for(int i=0;i<n;i++){
//            ans+=(Math.min(left[i],right[i])-arr[i]);
//        }
//        return ans;
    }
    public static void main(String[] args) {
        int arr[]={ 3,1,2,4,0,1,3,2};
        int n=arr.length;
        System.out.println(rainwater(arr,n));

    }
}
