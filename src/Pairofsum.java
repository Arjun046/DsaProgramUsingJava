public class Pairofsum {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7};
        int sum=9;
        int low=0;
        int high=a.length-1;
        while (low<high){
            if(a[low]+a[high]>sum){
                high--;
            }else if (a[low]+a[high]<sum){
                low++;
            }else if (a[low]+a[high]==sum){
                System.out.println("pair is("+a[low]+","+a[high]+")");
                low++;
                high--;
            }
        }
    }
}
