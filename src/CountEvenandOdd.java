public class CountEvenandOdd {
    public static void main(String[] args) {
        int arr[]={101,200,301,400,501};
        int n=arr.length;
        int countEven=0,countOdd=0;
        for (int i=0;i<n;i++){
            if((arr[i]&1)==0)
                countEven+=1;
            else {
                countOdd+=1;
            }
        }
        System.out.println(countEven);
        System.out.println(countOdd);
    }
}
