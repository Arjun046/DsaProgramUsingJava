public class LeftRotate {
    static void leftr(int arr[],int n,int k){
        int Mod=k%n;
        for (int i=0;i<n;i++){
            System.out.print(arr[(i+Mod)%n]+"  ");

        }
        System.out.println();
    }
    public static void main(String[] args) {
      int arr[]={1,3,5,7,9};
      int n=arr.length;
      int k=2;

      leftr(arr,n,k);
      k=3;

      leftr(arr,n,k);
      k=4;

      leftr(arr, n,k);
    }
}
